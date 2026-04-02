/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import conexao.Conexao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class TarefaDAO {

    // Método para inserir uma nova tarefa no banco de dados
    public boolean inserir(TarefaBean tarefa) {
        try {

        String sql = "INSERT INTO tarefas (titulo, descricao, responsavel, status) VALUES (?, ?, ?, ?)";
        
            // Abre conexão com o banco
            Connection conn = Conexao.conectar();
            
            // Prepara o comando SQL
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, tarefa.getTitulo());
            stmt.setString(2, tarefa.getDescricao());
            stmt.setString(3, tarefa.getResponsavel());
            stmt.setString(4, tarefa.getStatus());

             return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    // Listar todas as tarefas
    public List<TarefaBean> listar() {
        List<TarefaBean> tarefas = new ArrayList<>(); // Cria uma lista para armazenar as tarefas
        
        try{
        // Consulta SQL para buscar todas as tarefas    
        String sql = "SELECT * FROM tarefas";
        
        // Abre conexão com o banco
        Connection conn = Conexao.conectar();
                
            // Prepara o comando SQL   
            PreparedStatement stmt = conn.prepareStatement(sql);

            ResultSet rs = stmt.executeQuery();

            while (rs.next()) { // Percorre todos os registros retornados
                TarefaBean t = new TarefaBean(); // Cria um objeto TarefaBean para cada registro
                t.setId(rs.getInt("id")); // Seta o id da tarefa
                t.setTitulo(rs.getString("titulo")); // Seta o titulo da tarefa
                t.setDescricao(rs.getString("descricao")); // Seta a descrição da tarefa
                t.setResponsavel(rs.getString("responsavel")); // Seta o responsável da tarefa
                t.setStatus(rs.getString("status")); // Seta o status da tarefa
                tarefas.add(t); // Adiciona a tarefa na lista
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tarefas;
    }
    
    // Método para atualizar uma tarefa existente
    public boolean atualizar(TarefaBean tarefa) {      
        try{
            
        String sql = "UPDATE tarefas SET titulo = ?, descricao = ?, responsavel = ?, status = ? WHERE id = ?";
        
            // Abre conexão com o banco
            Connection conn = Conexao.conectar();
            
            // Prepara o comando SQL        
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1, tarefa.getTitulo());
            stmt.setString(2, tarefa.getDescricao());
            stmt.setString(3, tarefa.getResponsavel());
            stmt.setString(4, tarefa.getStatus());
            stmt.setInt(5, tarefa.getId());

            return stmt.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean excluir(int id) {
        try{
        
        String sql = "DELETE FROM tarefas WHERE id = ?";
        
            // Abre conexão
            Connection conn = Conexao.conectar();
                
            // Prepara o comando SQL
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setInt(1, id);
            return stmt.executeUpdate() > 0;
        
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}