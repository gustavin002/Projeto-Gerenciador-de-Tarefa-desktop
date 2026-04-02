/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;

public class NovaTarefa extends javax.swing.JFrame {

    private Inicio telaInicio;
    
    public NovaTarefa(Inicio inicio) {
    this.telaInicio = inicio; // Guarda a referência da tela inicial
    initComponents();
    setLocationRelativeTo(null);
}
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        novaTarefaTitulo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        novaTarefaDescricao = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        novaTarefaAdicionar = new javax.swing.JButton();
        novaTarefaResponsavel = new javax.swing.JComboBox<>();
        novaTarefaStatus = new javax.swing.JComboBox<>();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jLabel6.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        novaTarefaTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        novaTarefaTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novaTarefaTituloActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setText("TITULO :");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel2.setText("DESCRIÇÃO :");

        novaTarefaDescricao.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel3.setText("RESPONSÁVEL :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel4.setText("STATUS :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel5.setText("ADICIONAR NOVA TAREFA");

        novaTarefaAdicionar.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        novaTarefaAdicionar.setText("ADICIONAR");
        novaTarefaAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novaTarefaAdicionarActionPerformed(evt);
            }
        });

        novaTarefaResponsavel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        novaTarefaResponsavel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "João", "Matheus", "Luiz", "Gustavo" }));
        novaTarefaResponsavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novaTarefaResponsavelActionPerformed(evt);
            }
        });

        novaTarefaStatus.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        novaTarefaStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Em andamento", "Pendente", "Concluído" }));
        novaTarefaStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novaTarefaStatusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(novaTarefaDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
                            .addComponent(novaTarefaTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
                            .addComponent(novaTarefaResponsavel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(novaTarefaStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(novaTarefaAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novaTarefaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novaTarefaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(novaTarefaResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(novaTarefaStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(novaTarefaAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void novaTarefaTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaTarefaTituloActionPerformed
    
    }//GEN-LAST:event_novaTarefaTituloActionPerformed

    private void novaTarefaAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaTarefaAdicionarActionPerformed
        String titulo = novaTarefaTitulo.getText().trim(); // Pega título
        String descricao = novaTarefaDescricao.getText().trim(); // Pega descrição
        String responsavel = (String) novaTarefaResponsavel.getSelectedItem(); // Pega responsável
        String status = (String) novaTarefaStatus.getSelectedItem(); // Pega status
        
        if (titulo.isEmpty() || descricao.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Todos os campos são obrigatórios");
        return;
        }
        
    telaInicio.adicionarLinhaNaTabela(titulo, descricao, responsavel, status); // Envia dados
    this.dispose(); // Fecha a tela atual
    
    }//GEN-LAST:event_novaTarefaAdicionarActionPerformed

    private void novaTarefaResponsavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaTarefaResponsavelActionPerformed

    }//GEN-LAST:event_novaTarefaResponsavelActionPerformed

    private void novaTarefaStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaTarefaStatusActionPerformed
        
    }//GEN-LAST:event_novaTarefaStatusActionPerformed

    public static void main(String args[]) {
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton novaTarefaAdicionar;
    private javax.swing.JTextField novaTarefaDescricao;
    private javax.swing.JComboBox<String> novaTarefaResponsavel;
    private javax.swing.JComboBox<String> novaTarefaStatus;
    private javax.swing.JTextField novaTarefaTitulo;
    // End of variables declaration//GEN-END:variables
}
