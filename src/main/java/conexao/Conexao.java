/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class Conexao {
    private static Connection conn = null;
    
    private static final String url = "jdbc:mysql://localhost:3306/projetoFinal";
    private static final String user = "root";
    private static final String senha  = "1234";
    
   private Conexao () {
   }
   
   public static synchronized Connection conectar(){
   try{
       if (conn == null || conn.isClosed()){
           conn = DriverManager.getConnection(url, user, senha);
           JOptionPane.showMessageDialog(null, "Conectado com o banco de dados");
       }
   } catch(SQLException e){
        JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco de dados");
       e.printStackTrace();
   }
   return conn;
}
   
}