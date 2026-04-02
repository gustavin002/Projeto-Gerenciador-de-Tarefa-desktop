/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/*
 * Tela responsável pelo cadastro de novos usuários.
 * Essa classe pertence à camada VIEW do padrão MVC.
 */
package view;

import javax.swing.JOptionPane;
import model.UsuarioBean;
import model.UsuarioDAO;

public class Cadastro extends javax.swing.JFrame {

    public Cadastro() {
        initComponents();// Método que monta toda a interface gráfica
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cadastroNome = new javax.swing.JTextField();
        cadastroUsuario = new javax.swing.JTextField();
        cadastroBotaoCadastrar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        cadastroSenha = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        cadastroBotaoLogin = new javax.swing.JButton();
        cadastroMostrarSenha = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel1.setText("CADASTRO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, -1, 50));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 140, 37, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel3.setText("NOME:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 80, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel7.setText("USUÁRIO:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 120, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel8.setText("SENHA:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, 40));

        cadastroNome.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPanel1.add(cadastroNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 540, -1));

        cadastroUsuario.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPanel1.add(cadastroUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 540, -1));

        cadastroBotaoCadastrar.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        cadastroBotaoCadastrar.setText("CADASTRAR");
        cadastroBotaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroBotaoCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(cadastroBotaoCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, -1, 50));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel12.setText("FINALIZAR O CADASTRO:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, -1, 40));

        cadastroSenha.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jPanel1.add(cadastroSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 540, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel11.setText("VOLTAR AO LOGIN:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 230, 40));

        cadastroBotaoLogin.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        cadastroBotaoLogin.setText("LOGIN");
        cadastroBotaoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroBotaoLoginActionPerformed(evt);
            }
        });
        jPanel1.add(cadastroBotaoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 150, 50));

        cadastroMostrarSenha.setText("MOSTRAR SENHA");
        cadastroMostrarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroMostrarSenhaActionPerformed(evt);
            }
        });
        jPanel1.add(cadastroMostrarSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 260, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cadastroBotaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroBotaoCadastrarActionPerformed
        String nome = cadastroNome.getText().trim();
        String usuario = cadastroUsuario.getText().trim();
        String senha = new String(cadastroSenha.getPassword()).trim();

        // Validação de campos obrigatórios
        if (nome.isEmpty() || usuario.isEmpty() || senha.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validação de senha mínima
        if (senha.length() < 6) {
            JOptionPane.showMessageDialog(null, "A senha deve ter pelo menos 6 caracteres!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validação de complexidade da senha (letra + número)
        if (!senha.matches("(?=.*[A-Za-z])(?=.*\\d).*")) {
            JOptionPane.showMessageDialog(null, "A senha deve conter pelo menos uma letra e um número!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        UsuarioDAO dao = new UsuarioDAO();

        // Verifica usuário duplicado
        if (dao.usuarioExiste(usuario)) {
            JOptionPane.showMessageDialog(null, "Este usuário já está cadastrado!", "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Cria o bean e cadastra
        UsuarioBean usuarioBean = new UsuarioBean();
        usuarioBean.setNome(nome);
        usuarioBean.setUsuario(usuario);
        usuarioBean.setSenha(senha);

        boolean sucesso = dao.cadastro(usuarioBean);
        if (sucesso) {
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

            // Limpa campos
            cadastroNome.setText("");
            cadastroUsuario.setText("");
            cadastroSenha.setText("");
            
        } else {
            JOptionPane.showMessageDialog(null, "Falha ao cadastrar usuário!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cadastroBotaoCadastrarActionPerformed

    private void cadastroMostrarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroMostrarSenhaActionPerformed
         if (cadastroMostrarSenha.isSelected()){
            cadastroSenha.setEchoChar((char) 0); // mostra a senha
        }   else{
                cadastroSenha.setEchoChar('*'); // esconde a senha
        }
    }//GEN-LAST:event_cadastroMostrarSenhaActionPerformed

    private void cadastroBotaoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroBotaoLoginActionPerformed
            Login telaLogin = new Login();
            telaLogin.setVisible(true);
            this.dispose(); // Fecha a tela atual
    }//GEN-LAST:event_cadastroBotaoLoginActionPerformed

    public static void main(String args[]) {
        new Cadastro().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastroBotaoCadastrar;
    private javax.swing.JButton cadastroBotaoLogin;
    private javax.swing.JCheckBox cadastroMostrarSenha;
    private javax.swing.JTextField cadastroNome;
    private javax.swing.JPasswordField cadastroSenha;
    private javax.swing.JTextField cadastroUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}