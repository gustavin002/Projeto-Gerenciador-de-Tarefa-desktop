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
        initComponents();// Método gerado automaticamente pelo NetBeans que monta toda a interface gráfica
        cadastroBotaoLogin.addActionListener(e -> {
        Login telaLogin = new Login();// Instancia a tela de login
        telaLogin.setVisible(true);// Torna a tela visível
        this.dispose(); // Fecha a tela atual
    });
    }
    
    @SuppressWarnings("unchecked")
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
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel1.setText("CADASTRO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 20, -1, 50));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 140, 37, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel3.setText("NOME:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 110, 80, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel7.setText("USUARIO:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 120, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel8.setText("SENHA:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, -1, 40));

        cadastroNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(cadastroNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 120, 540, -1));

        cadastroUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(cadastroUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 540, -1));

        cadastroBotaoCadastrar.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        cadastroBotaoCadastrar.setText("CADASTRAR");
        cadastroBotaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroBotaoCadastrarActionPerformed(evt);
            }
        });
        jPanel1.add(cadastroBotaoCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 320, -1, 50));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel12.setText("FINALIZAR O CADASTRO:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 260, -1, 40));

        cadastroSenha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(cadastroSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, 540, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel11.setText("VOLTAR AO LOGIN:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 230, 40));

        cadastroBotaoLogin.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        cadastroBotaoLogin.setText("LOGIN");
        jPanel1.add(cadastroBotaoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, 150, 50));

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel4.setText("Seja Bem Vindo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(744, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 810));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1046, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastroBotaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroBotaoCadastrarActionPerformed
        String nome = cadastroNome.getText().trim();
        String usuario = cadastroUsuario.getText().trim();
        String senha = new String(cadastroSenha.getPassword()).trim();

        // Validação de campos obrigatórios
        if (nome.isEmpty() || usuario.isEmpty() || senha.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!", 
                                          "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validação de senha mínima
        if (senha.length() < 6) {
            JOptionPane.showMessageDialog(null, "A senha deve ter pelo menos 6 caracteres!", 
                                          "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validação de complexidade da senha (letra + número)
        if (!senha.matches("(?=.*[A-Za-z])(?=.*\\d).*")) {
            JOptionPane.showMessageDialog(null, "A senha deve conter pelo menos uma letra e um número!", 
                                          "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        UsuarioDAO dao = new UsuarioDAO();

        // Verifica usuário duplicado
        if (dao.usuarioExiste(usuario)) {
            JOptionPane.showMessageDialog(null, "Este usuário já está cadastrado!", 
                                          "Erro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Cria o bean e cadastra
        UsuarioBean usuarioBean = new UsuarioBean();
        usuarioBean.setNome(nome);
        usuarioBean.setUsuario(usuario);
        usuarioBean.setSenha(senha);

        boolean sucesso = dao.cadastro(usuarioBean);
        if (sucesso) {
            JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!", 
                                          "Sucesso", JOptionPane.INFORMATION_MESSAGE);

            // Limpa campos
            cadastroNome.setText("");
            cadastroUsuario.setText("");
            cadastroSenha.setText("");

            // Abre login
            Login telaLogin = new Login();
            telaLogin.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Falha ao cadastrar usuário!", 
                                          "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cadastroBotaoCadastrarActionPerformed

    public static void main(String args[]) {

       try {
           // Define o tema visual Nimbus
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // Executa a interface gráfica na Thread de Eventos do Swing
        java.awt.EventQueue.invokeLater(() -> {
            new Cadastro().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastroBotaoCadastrar;
    private javax.swing.JButton cadastroBotaoLogin;
    private javax.swing.JTextField cadastroNome;
    private javax.swing.JPasswordField cadastroSenha;
    private javax.swing.JTextField cadastroUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}