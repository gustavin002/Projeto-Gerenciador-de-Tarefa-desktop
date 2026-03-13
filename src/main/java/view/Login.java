/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/*
 * Tela de login do sistema.
 * Classe da camada VIEW do padrão MVC.
 * Responsável por autenticar usuários existentes e abrir a tela inicial.
 */
package view;

import conexao.Conexao;
import javax.swing.JOptionPane;
import model.UsuarioBean;
import model.UsuarioDAO;

public class Login extends javax.swing.JFrame {
    // Objeto de conexão com o banco
    Conexao conn = new Conexao();

    public Login() {
        initComponents();// Inicializa a interface gráfica
        conn.testarConexao();// Testa se a conexão com o banco está funcionando
    }
    // Método principal que inicia a aplicação                 
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> new Login().setVisible(true));
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        loginSenha = new javax.swing.JPasswordField();
        loginBotaoEntrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LoginBotaoCadastrar = new javax.swing.JButton();
        loginUsuario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel1.setText("LOGIN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 0, -1, 50));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel2.setText("USUARIO:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 170, 83));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel3.setText("SENHA:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 130, 83));

        loginSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        loginSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginSenhaActionPerformed(evt);
            }
        });
        jPanel1.add(loginSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 693, 40));

        loginBotaoEntrar.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        loginBotaoEntrar.setText("ENTRAR");
        loginBotaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBotaoEntrarActionPerformed(evt);
            }
        });
        jPanel1.add(loginBotaoEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, 180, 60));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel4.setText("INICIAR SESSÃO:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 200, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel6.setText("NÃO POSSUO CADASTRO:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, -1, -1));

        LoginBotaoCadastrar.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        LoginBotaoCadastrar.setText("CADASTRAR");
        LoginBotaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBotaoCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(LoginBotaoCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 490, -1, 60));

        loginUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        loginUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(loginUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 690, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 625, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginSenhaActionPerformed

    }//GEN-LAST:event_loginSenhaActionPerformed

    private void loginBotaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBotaoEntrarActionPerformed
        // Captura os dados digitados
        String currentUser = loginUsuario.getText().trim();
        String currentSenha = new String(loginSenha.getPassword()).trim();
        // Reseta bordas dos campos (visual)
        loginUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.GRAY));
        loginSenha.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.GRAY));
        // Validação: usuário não pode estar vazio
        if (currentUser.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo usuário",
                "Erro", JOptionPane.ERROR_MESSAGE);
            loginUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.RED, 2));
            return;
        }

        if (currentSenha.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha o campo senha",
                "Erro", JOptionPane.ERROR_MESSAGE);
            loginSenha.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.RED, 2));
            return;
        }

        UsuarioDAO dao = new UsuarioDAO();
        UsuarioBean usuarioLogado = dao.logar(currentUser, currentSenha);

        if (usuarioLogado != null) {
            JOptionPane.showMessageDialog(null, "Login realizado com sucesso!",
                "Sucesso", JOptionPane.INFORMATION_MESSAGE);
            // Abre a tela inicial passando o usuário logado
            Inicio telaInicio = new Inicio(usuarioLogado);
            telaInicio.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos!",
                "Erro", JOptionPane.ERROR_MESSAGE);
            // Destaca os campos em vermelho
            loginUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.RED, 2));
            loginSenha.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.RED, 2));
        }
    }//GEN-LAST:event_loginBotaoEntrarActionPerformed
    // Evento do botão CADASTRAR
    // Abre a tela de cadastro e fecha a tela de login
    private void LoginBotaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBotaoCadastrarActionPerformed
        Cadastro telaCadastro = new Cadastro();
        telaCadastro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_LoginBotaoCadastrarActionPerformed

    private void loginUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginUsuarioActionPerformed
        
    }//GEN-LAST:event_loginUsuarioActionPerformed

     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginBotaoCadastrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginBotaoEntrar;
    private javax.swing.JPasswordField loginSenha;
    private javax.swing.JTextField loginUsuario;
    // End of variables declaration//GEN-END:variables

}
