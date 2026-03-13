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

        // Validação para garantir que nenhum campo esteja vazio
        if (usuario.getUsuario() == null || usuario.getUsuario().isBlank() ||
            usuario.getNome() == null || usuario.getNome().isBlank() ||
            usuario.getSenha() == null || usuario.getSenha().isBlank()) {

            System.err.println("Erro: todos os campos (usuário, nome e senha) são obrigatórios!");
            return false;
        }

        try {

            // Verifica se o usuário já existe antes de cadastrar
            if (usuarioExiste(usuario.getUsuario())) {
                System.out.println("Usuário já existe!");
                return false;
            }

            // Comando SQL para inserir novo usuário
            String sql = "INSERT INTO usuarios (usuario, nome, senha) VALUES (?, ?, ?)";

            // Try-with-resources garante que a conexão será fechada automaticamente
            try (Connection conn = new Conexao().getConnection();
                 PreparedStatement stmt = conn.prepareStatement(sql)) {

                // Define os valores nos parâmetros da query
                stmt.setString(1, usuario.getUsuario());
                stmt.setString(2, usuario.getNome());
                stmt.setString(3, usuario.getSenha());

                // Executa o INSERT e retorna quantidade de linhas afetadas
                int linhas = stmt.executeUpdate();

                // Se inseriu pelo menos uma linha, retorna true
                return linhas > 0;
            }

        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar usuário: " + e.getMessage());
            return false;
        }
    }

    
    /*
     * Método responsável por autenticar o usuário no sistema.
     * Retorna um objeto UsuarioBean se login for válido.
     * Retorna null se usuário ou senha estiverem incorretos.
     */
    public UsuarioBean logar(String usuario, String senha) {

        // Consulta SQL para verificar usuário e senha
        String sql = "SELECT * FROM usuarios WHERE usuario = ? AND senha = ?";

        try (Connection conn = new Conexao().getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            // Substitui os parâmetros da consulta
            stmt.setString(1, usuario);
            stmt.setString(2, senha);

            // Executa a consulta
            try (ResultSet rs = stmt.executeQuery()) {

                // Se encontrar resultado, login é válido
                if (rs.next()) {

                    // Cria objeto para retornar os dados do usuário
                    UsuarioBean u = new UsuarioBean();
                    u.setUsuario(rs.getString("usuario"));
                    u.setNome(rs.getString("nome"));

                    return u; // senha não é retornada por segurança
                }
            }

        } catch (SQLException e) {
            System.err.println("Erro no login: " + e.getMessage());
        }

        // Retorna null se não encontrar usuário
        return null;
    }
    public List<UsuarioBean> listar() {
    List<UsuarioBean> usuarios = new ArrayList<>();
    String sql = "SELECT * FROM usuarios";

    try (Connection conn = new Conexao().getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql);
         ResultSet rs = stmt.executeQuery()) {

        while (rs.next()) {
            UsuarioBean u = new UsuarioBean();
            u.setUsuario(rs.getString("usuario"));
            u.setNome(rs.getString("nome"));
            usuarios.add(u);
        }

    } catch (SQLException e) {
        e.printStackTrace();
    }

    return usuarios;
}

    
    /*
     * Método auxiliar que verifica se um usuário já está cadastrado.
     * Retorna true se existir no banco.
     */
    public boolean usuarioExiste(String usuario) {

        String sql = "SELECT 1 FROM usuarios WHERE usuario = ?";

        try (Connection conn = new Conexao().getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, usuario);

            try (ResultSet rs = stmt.executeQuery()) {

                // Se existir pelo menos um registro, retorna true
                return rs.next();
            }

        } catch (SQLException e) {
            System.err.println("Erro ao verificar usuário: " + e.getMessage());
            return false;
        }
    }
}