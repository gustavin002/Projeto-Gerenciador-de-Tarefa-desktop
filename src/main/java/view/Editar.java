/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Editar extends javax.swing.JFrame {

    private Inicio telaInicio; // Referência à tela principal, usada para acessar e editar os dados da tabela
    private int linhaModelo; // Guarda o índice da linha selecionada no modelo da tabela

    public Editar(Inicio inicio) {
        this.telaInicio = inicio; // Armazena a referência da tela principal
        initComponents();
        setLocationRelativeTo(null);
        carregarDados(); // Carrega os dados da tarefa selecionada nos campos do formulário
    }

    // Método que preenche os campos com os dados da tarefa selecionada
    private void carregarDados() {
        linhaModelo = telaInicio.getLinhaSelecionada(); // Obtém o índice da linha selecionada na tabela

        if (linhaModelo < 0) { // Verifica se nenhuma linha foi selecionada (valor -1 significa sem seleção)
            JOptionPane.showMessageDialog(this, "Selecione uma tarefa para editar!"); // Exibe aviso ao usuário
            this.dispose(); // Fecha a janela atual
            return; // Encerra o método sem carregar nenhum dado
        }

        editarTitulo.setText((String) telaInicio.getValorCelula(linhaModelo, 1)); // Preenche o campo título com o valor da coluna 1
        editarDescricao.setText((String) telaInicio.getValorCelula(linhaModelo, 2));  // Preenche o campo descrição com o valor da coluna 2
        editarResponsavel.setSelectedItem(telaInicio.getValorCelula(linhaModelo, 3)); // Seleciona o responsável correspondente ao valor da coluna 3
        editarStatus.setSelectedItem(telaInicio.getValorCelula(linhaModelo, 4)); // Seleciona o status correspondente ao valor da coluna 4
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
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
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        editarTitulo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        editarDescricao = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        novaTarefaEditar = new javax.swing.JButton();
        editarResponsavel = new javax.swing.JComboBox<>();
        editarStatus = new javax.swing.JComboBox<>();

        novaTarefaTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        novaTarefaTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novaTarefaTituloActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("TITULO :");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("DESCRIÇÃO :");

        novaTarefaDescricao.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("RESPONSÁVEL :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("STATUS :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel5.setText("ADICIONAR NOVA TAREFA");

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
        novaTarefaStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Em andamento", "Pendente", "Concluido" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(novaTarefaDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
                            .addComponent(novaTarefaTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
                            .addComponent(novaTarefaResponsavel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(novaTarefaStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(jLabel5)))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(novaTarefaAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(440, 440, 440))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novaTarefaTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(45, 45, 45)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(novaTarefaDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(novaTarefaResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(novaTarefaStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(novaTarefaAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        editarTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        editarTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarTituloActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel6.setText("TITULO :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel7.setText("DESCRIÇÃO :");

        editarDescricao.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel8.setText("RESPONSÁVEL :");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel9.setText("STATUS :");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel10.setText("EDITAR TAREFA");

        novaTarefaEditar.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        novaTarefaEditar.setText("EDITAR");
        novaTarefaEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                novaTarefaEditarActionPerformed(evt);
            }
        });

        editarResponsavel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        editarResponsavel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "João", "Matheus", "Luiz", "Gustavo", " " }));

        editarStatus.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        editarStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Em andamento", "Pendente", "Concluído" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(editarDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
                            .addComponent(editarTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 750, Short.MAX_VALUE)
                            .addComponent(editarResponsavel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editarStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(jLabel10))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(404, 404, 404)
                        .addComponent(novaTarefaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editarTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editarDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(editarResponsavel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(editarStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(novaTarefaEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void novaTarefaTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaTarefaTituloActionPerformed

    }//GEN-LAST:event_novaTarefaTituloActionPerformed

    private void novaTarefaAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaTarefaAdicionarActionPerformed

    }//GEN-LAST:event_novaTarefaAdicionarActionPerformed

    private void novaTarefaResponsavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaTarefaResponsavelActionPerformed

    }//GEN-LAST:event_novaTarefaResponsavelActionPerformed

    private void editarTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarTituloActionPerformed

    }//GEN-LAST:event_editarTituloActionPerformed
    // Evento disparado ao clicar no botão EDITAR
    private void novaTarefaEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_novaTarefaEditarActionPerformed
        String titulo = editarTitulo.getText().trim(); // Lê o texto do campo título e remove espaços extras nas bordas
        String descricao = editarDescricao.getText().trim(); // Lê o texto do campo descrição e remove espaços extras nas bordas
        String responsavel = (String) editarResponsavel.getSelectedItem(); // Obtém o responsável selecionado no ComboBox
        String status = (String) editarStatus.getSelectedItem(); // Obtém o status selecionado no ComboBox

        // Verifica se algum campo obrigatório está vazio
        if (titulo.isEmpty() || descricao.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos os campos são obrigatórios!");
            return; // Encerra o método sem salvar, aguardando o usuário corrigir
        }

        // edita a linha existente, não adiciona uma nova
        telaInicio.editarLinhaNaTabela(linhaModelo, titulo, descricao, responsavel, status);
        this.dispose();

    }//GEN-LAST:event_novaTarefaEditarActionPerformed
    // Método main vazio, a janela é aberta a partir da tela Inicio
    public static void main(String args[]) {
        
    }
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField editarDescricao;
    private javax.swing.JComboBox<String> editarResponsavel;
    private javax.swing.JComboBox<String> editarStatus;
    private javax.swing.JTextField editarTitulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton novaTarefaAdicionar;
    private javax.swing.JTextField novaTarefaDescricao;
    private javax.swing.JButton novaTarefaEditar;
    private javax.swing.JComboBox<String> novaTarefaResponsavel;
    private javax.swing.JComboBox<String> novaTarefaStatus;
    private javax.swing.JTextField novaTarefaTitulo;
    // End of variables declaration//GEN-END:variables
}
