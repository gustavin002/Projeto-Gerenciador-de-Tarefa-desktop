/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * Classe DAO (Data Access Object)
 * Responsável por fazer a comunicação entre o sistema e o banco de dados.
 */
package model;

import conexao.Conexao; // Classe responsável por criar conexão com o banco
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {

    /*
     * Método responsável por cadastrar um novo usuário no banco de dados.
     * Retorna true se o cadastro for realizado com sucesso.
     */
    public boolean cadastro(UsuarioBean usuario) {

        // Validação: verifica se os campos obrigatórios estão preenchidos
        if (usuario.getUsuario() == null || usuario.getUsuario().isBlank() ||
            usuario.getNome() == null || usuario.getNome().isBlank() ||
            usuario.getSenha() == null || usuario.getSenha().isBlank()) {
            System.err.println("Erro: todos os campos são obrigatórios!");
            return false;
        }

        try {
            // Verifica se já existe um usuário com o mesmo login
            if (usuarioExiste(usuario.getUsuario())) {
                System.out.println("Usuário já existe!");
                return false;
            }
            
            // Comando SQL para inserir um novo usuário
            String sql = "INSERT INTO usuarios (usuario, nome, senha) VALUES (?, ?, ?)";
            
            // Abre conexão com o banco
            Connection conn = Conexao.conectar();
            
            // Prepara o comando SQL
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            // Define os valores dos parâmetros
            stmt.setString(1, usuario.getUsuario());
            stmt.setString(2, usuario.getNome());
            stmt.setString(3, usuario.getSenha());
            
            // Executa o comando e retorna true se inseriu pelo menos 1 registro
            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar usuário: " + e.getMessage());
            return false;
        }
    }

    /*
     * Método responsável por realizar o login do usuário.
     * Retorna um objeto UsuarioBean se o login for válido,
     * ou null caso contrário.
     */
    public UsuarioBean logar(String usuario, String senha) {

        try {
            // Consulta SQL para buscar usuário e senha 
            String sql = "SELECT * FROM usuarios WHERE usuario = ? AND senha = ?";
            
            // Abre conexão com o banco
            Connection conn = Conexao.conectar();
            
            // Prepara o comando SQL
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            // Define os parâmetros da consulta
            stmt.setString(1, usuario);
            stmt.setString(2, senha);
            
            // Executa a consulta
            ResultSet rs = stmt.executeQuery();
            
            // Se encontrou resultado, cria e retorna o usuário
            if (rs.next()) {
                UsuarioBean u = new UsuarioBean();
                u.setUsuario(rs.getString("usuario"));
                u.setNome(rs.getString("nome"));
                return u;
            }

        } catch (SQLException e) {
            // Trata erro no login
            System.err.println("Erro no login: " + e.getMessage());
        }
        
        // Retorna null se não encontrou usuário
        return null;
    }
    
    /*
     * Método que retorna uma lista com todos os usuários do banco.
     */
    public List<UsuarioBean> listar() {
        // Lista que armazenará os usuários
        List<UsuarioBean> usuarios = new ArrayList<>();

        try {
            // Consulta SQL para buscar todos os usuários
            String sql = "SELECT * FROM usuarios";
            
            // Abre conexão com o banco
            Connection conn = Conexao.conectar();
            
            // Prepara o comando SQL
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            // Executa a consulta
            ResultSet rs = stmt.executeQuery();

            // Percorre os resultados e adiciona na lista
            while (rs.next()) {
                UsuarioBean u = new UsuarioBean();
                u.setUsuario(rs.getString("usuario"));
                u.setNome(rs.getString("nome"));
                usuarios.add(u);
            }

        } catch (SQLException e) {
            // Trata erro ao listar usuários
            System.err.println("Erro ao listar usuários: " + e.getMessage());
        }

        return usuarios;
    }
    
    /*
     * Método que verifica se um usuário já existe no banco.
     * Retorna true se existir, false caso contrário.
     */
    public boolean usuarioExiste(String usuario) {

        try {
            // Consulta para verificar existência
            String sql = "SELECT 1 FROM usuarios WHERE usuario = ?";
            
            // Abre conexão com o banco
            Connection conn = Conexao.conectar();
            
            // Prepara o comando SQL
            PreparedStatement stmt = conn.prepareStatement(sql);
            
            // Define o parâmetro
            stmt.setString(1, usuario);
            
            // Executa a consulta
            ResultSet rs = stmt.executeQuery();
            
            // Retorna true se encontrou algum registro
            return rs.next();

        } catch (SQLException e) {
            System.err.println("Erro ao verificar usuário: " + e.getMessage());
            return false;
        }
    }
}