/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.*;
import javax.swing.table.*;
import java.util.ArrayList;
import java.util.List;
import model.UsuarioBean;

public class Inicio extends javax.swing.JFrame {

    private DefaultTableModel modelo;
    private TableRowSorter<DefaultTableModel> sorter;
    private UsuarioBean usuarioLogado;

    public Inicio(UsuarioBean usuario) {
        this.usuarioLogado = usuario;
        initComponents();
        configurarTabela();// Configura a tabela com dados iniciais
        setLocationRelativeTo(null);// Centraliza a janela na tela
    }
    // Método para configurar a tabela com dados e sorter
    private void configurarTabela() {
        modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0); 
        sorter = new TableRowSorter<>(modelo);
        jTable1.setRowSorter(sorter);

        modelo.addRow(new Object[]{1, "Comprar materiais", "Papel e canetas", "João", "pendente"});
        modelo.addRow(new Object[]{2, "Reunião clientes", "Apresentação do projeto", "Matheus", "em andamento"});
        modelo.addRow(new Object[]{3, "Atualizar site", "Corrigir layout", "Luiz", "concluido"});
    }
    // Método para filtrar a tabela de acordo com status e responsável
    private void filtrarTabela() {
        List<RowFilter<Object, Object>> filtros = new ArrayList<>();
        String status = inicioFiltroStatus.getSelectedItem().toString();
        String responsavel = inicioFiltroResponsavel.getSelectedItem().toString();

        if (!status.equalsIgnoreCase("Todos")) {
            filtros.add(RowFilter.regexFilter("(?i)" + status, 4));
        }
        if (!responsavel.equalsIgnoreCase("Todos")) {
            filtros.add(RowFilter.regexFilter("(?i)" + responsavel, 3));
        }

        RowFilter<Object, Object> rf = filtros.isEmpty() ? null : RowFilter.andFilter(filtros);
        sorter.setRowFilter(rf);
    }
    
    private void adicionarTarefa() {
        
    String titulo = JOptionPane.showInputDialog(this, "Digite o título:");
    if (titulo == null) return;
    titulo = titulo.trim();
    if (titulo.isEmpty()) return;

    String descricao = JOptionPane.showInputDialog(this, "Digite a descrição:");
    if (descricao == null) return;
    descricao = descricao.trim();
    if (descricao.isEmpty()) return;

    String responsavel;
    
    if (usuarioLogado != null) {
    responsavel = usuarioLogado.getNome();
    } else {
    responsavel = "Não definido";
    }

    int novoId = 1;

    for (int i = 0; i < modelo.getRowCount(); i++) {
    int idAtual = (int) modelo.getValueAt(i, 0);
    if (idAtual >= novoId) {
        novoId = idAtual + 1;
    }
}
    
    modelo.addRow(new Object[]{
        novoId, titulo, descricao, responsavel, "pendente"
    });
}
    
    private void logout() {
        new Login().setVisible(true);
        this.dispose();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inicioLoginBotao = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        inicioBotaoNovaTarefa = new javax.swing.JButton();
        inicioBotaoEditar = new javax.swing.JButton();
        inicioBotaoExcluir = new javax.swing.JButton();
        inicioFiltroStatus = new javax.swing.JComboBox<>();
        inicioFiltroResponsavel = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel1.setText("GERENCIADOR DE TAREFAS EMPRESARIAL");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        inicioLoginBotao.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        inicioLoginBotao.setText("LOGOUT");
        inicioLoginBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioLoginBotaoActionPerformed(evt);
            }
        });
        jPanel1.add(inicioLoginBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 380, -1, 50));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "TÍTULO", "DESCRIÇÃO", "RESPONSÁVEL", "STATUS"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 87, 490, 340));

        inicioBotaoNovaTarefa.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        inicioBotaoNovaTarefa.setText("NOVA TAREFA");
        inicioBotaoNovaTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioBotaoNovaTarefaActionPerformed(evt);
            }
        });
        jPanel1.add(inicioBotaoNovaTarefa, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, -1));

        inicioBotaoEditar.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        inicioBotaoEditar.setText("EDITAR");
        inicioBotaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioBotaoEditarActionPerformed(evt);
            }
        });
        jPanel1.add(inicioBotaoEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, -1, -1));

        inicioBotaoExcluir.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        inicioBotaoExcluir.setText("EXCLUIR");
        inicioBotaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioBotaoExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(inicioBotaoExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, -1, -1));

        inicioFiltroStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "pendente", "em andamento", "concluido" }));
        inicioFiltroStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioFiltroStatusActionPerformed(evt);
            }
        });
        jPanel1.add(inicioFiltroStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(935, 80, 70, 30));

        inicioFiltroResponsavel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "João", "Matheus", "Luiz", "Gustavo" }));
        inicioFiltroResponsavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioFiltroResponsavelActionPerformed(evt);
            }
        });
        jPanel1.add(inicioFiltroResponsavel, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 80, 70, 30));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel3.setText("STATUS:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 80, 100, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel4.setText("RESPONSAVEL:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, -1, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inicioLoginBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioLoginBotaoActionPerformed
          logout();
    }//GEN-LAST:event_inicioLoginBotaoActionPerformed

    private void inicioBotaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioBotaoEditarActionPerformed
        int linhaSelecionada = jTable1.getSelectedRow();
        if (linhaSelecionada != -1) {
            int linhaModelo = jTable1.convertRowIndexToModel(linhaSelecionada);
            String novoTitulo = JOptionPane.showInputDialog(this, "Editar título:", modelo.getValueAt(linhaModelo, 1));
        if (novoTitulo != null && !novoTitulo.isBlank()) {
            modelo.setValueAt(novoTitulo.trim(), linhaModelo, 1);
        }        
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma tarefa para editar!");
        }
    }//GEN-LAST:event_inicioBotaoEditarActionPerformed

    private void inicioBotaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioBotaoExcluirActionPerformed
        int linhaSelecionada = jTable1.getSelectedRow();
        if (linhaSelecionada != -1) {
            int linhaModelo = jTable1.convertRowIndexToModel(linhaSelecionada);
            if (JOptionPane.showConfirmDialog(this, "Deseja excluir esta tarefa?") == JOptionPane.YES_OPTION) {
                modelo.removeRow(linhaModelo);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma tarefa para excluir!");
        }
    }//GEN-LAST:event_inicioBotaoExcluirActionPerformed

    private void inicioFiltroStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioFiltroStatusActionPerformed
         filtrarTabela();
    }//GEN-LAST:event_inicioFiltroStatusActionPerformed

    private void inicioBotaoNovaTarefaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioBotaoNovaTarefaActionPerformed
        adicionarTarefa();
    }//GEN-LAST:event_inicioBotaoNovaTarefaActionPerformed

    private void inicioFiltroResponsavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioFiltroResponsavelActionPerformed
         filtrarTabela();
    }//GEN-LAST:event_inicioFiltroResponsavelActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton inicioBotaoEditar;
    private javax.swing.JButton inicioBotaoExcluir;
    private javax.swing.JButton inicioBotaoNovaTarefa;
    private javax.swing.JComboBox<String> inicioFiltroResponsavel;
    private javax.swing.JComboBox<String> inicioFiltroStatus;
    private javax.swing.JButton inicioLoginBotao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}