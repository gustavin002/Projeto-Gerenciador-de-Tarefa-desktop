/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * Classe responsável por representar o usuário do sistema.
 * Utiliza o padrão JavaBean para armazenar dados.
 */
package model;

public class UsuarioBean {
    
    // Atributos privados (encapsulamento)
    // Representam os dados do usuário no sistema
    private String usuario; // login do usuário
    private String nome;    // nome completo do usuário
    private String senha;   // senha do usuário

    
    // Retorna o login do usuário
    public String getUsuario() {
        return usuario;
    }

    
    // Define o login do usuário
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    // Retorna o nome do usuário
    public String getNome() {
        return nome;
    }

    
    // Define o nome do usuário
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    // Retorna a senha do usuário
    public String getSenha() {
        return senha;
    }

    
    // Define a senha do usuário
    public void setSenha(String senha) {
        this.senha = senha;
    }
}