/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.*; // Importa componentes gráficos (JFrame, JButton, etc)
import javax.swing.table.*; // Importa classes de tabela
import java.util.ArrayList; // Lista dinâmica
import java.util.List; // Interface de lista
import model.UsuarioBean; // Importa UsuarioBean usada para armazenar os dados do usuário logado

public class Inicio extends javax.swing.JFrame {

    private DefaultTableModel modelo;  // Modelo da tabela (dados)
    private TableRowSorter<DefaultTableModel> sorter; // Responsável por ordenar e filtrar a tabela
    private UsuarioBean usuarioLogado; // Guarda o usuário que fez login

    public Inicio(UsuarioBean usuario) {
        this.usuarioLogado = usuario; // Armazena o usuário logado
        initComponents();
        configurarTabela();// Configura a tabela com dados iniciais
    }
    // Método para configurar a tabela com dados e sorter
    private void configurarTabela() {
        modelo = (DefaultTableModel) jTable1.getModel(); // Pega o modelo da tabela
        modelo.setRowCount(0);
        sorter = new TableRowSorter<>(modelo); // Cria o sorter para ordenação e filtro
        jTable1.setRowSorter(sorter); // Aplica o sorter na tabela

        modelo.addRow(new Object[]{1, "Comprar materiais", "Papel e canetas", "João", "Pendente"});
        modelo.addRow(new Object[]{2, "Reunião clientes", "Apresentar o projeto", "Matheus", "Em andamento"});
        modelo.addRow(new Object[]{3, "Atualizar site", "Corrigir layout", "Luiz", "Concluido"});
        modelo.addRow(new Object[]{4, "Enviar relatório", "Para o financeiro", "Gustavo", "Concluido"});
    }
    // Método para filtrar a tabela de acordo com status e responsável
    private void filtrarTabela() {
        List<RowFilter<Object, Object>> filtros = new ArrayList<>(); // Lista de filtros
        String status = inicioFiltroStatus.getSelectedItem().toString(); // Pega status selecionado
        String responsavel = inicioFiltroResponsavel.getSelectedItem().toString(); // Pega responsável selecionado

        // Se o status não for "Todos", adiciona filtro por status (coluna 4)
        if (!status.equalsIgnoreCase("Todos")) {
            filtros.add(RowFilter.regexFilter("(?i)" + status, 4));
        }
        
        // Se o responsável não for "Todos", adiciona filtro por responsável (coluna 3)
        if (!responsavel.equalsIgnoreCase("Todos")) {
            filtros.add(RowFilter.regexFilter("(?i)" + responsavel, 3));
        }
        
        // Se não houver filtros, mostra tudo
        if (filtros.isEmpty()) {
            sorter.setRowFilter(null);
        // Aplica todos os filtros juntos (AND)
        } else {
            sorter.setRowFilter(RowFilter.andFilter(filtros));
        }
    }
    
    // Adiciona uma nova linha na tabela
    public void adicionarLinhaNaTabela(String titulo, String descricao, String responsavel, String status) {
    int novoId = modelo.getRowCount() + 1; // Cria ID baseado na quantidade de linhas
    modelo.addRow(new Object[]{novoId, titulo, descricao, responsavel, status}); // Adiciona nova linha
}
    
    // Retorna o índice da linha selecionada na tabela
    public int getLinhaSelecionada() {
    int linha = jTable1.getSelectedRow(); // Pega o índice visual da linha selecionada pelo usuário
    if (linha >= 0) { // Verifica se alguma linha foi selecionada (valor -1 significa nenhuma)
        return jTable1.convertRowIndexToModel(linha); // Converte o índice visual para o índice real do modelo (necessário quando a tabela está filtrada ou ordenada)
    } else {
        return -1; // Retorna -1 indicando que nenhuma linha está selecionada
    }
}

// Retorna o valor de uma célula específica
public Object getValorCelula(int linha, int coluna) {
    return modelo.getValueAt(linha, coluna); // Busca e retorna o conteúdo da célula na linha e coluna informadas
}

// Atualiza os dados de uma linha existente
public void editarLinhaNaTabela(int linha, String titulo, String descricao, String responsavel, String status) { // Recebe a linha a ser editada e os novos valores
    modelo.setValueAt(titulo, linha, 1); // Atualiza a coluna TÍTULO (índice 1)
    modelo.setValueAt(descricao, linha, 2); // Atualiza a coluna DESCRIÇÃO (índice 2)
    modelo.setValueAt(responsavel, linha, 3); // Atualiza a coluna RESPONSÁVEL (índice 3)
    modelo.setValueAt(status, linha, 4); // Atualiza a coluna STATUS (índice 4)
}
    
    private void adicionarTarefa() {
        new NovaTarefa(this).setVisible(true); // Abre janela passando a tela atual
    }
    
    // Faz logout e volta para tela de login
    private void logout() {
        new Login().setVisible(true); // Abre tela de login
        this.dispose(); // Fecha a tela atual
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

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
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
        jPanel1.add(inicioLoginBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 380, -1, 40));

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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 87, 520, 350));

        inicioBotaoNovaTarefa.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        inicioBotaoNovaTarefa.setText("NOVA TAREFA");
        inicioBotaoNovaTarefa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioBotaoNovaTarefaActionPerformed(evt);
            }
        });
        jPanel1.add(inicioBotaoNovaTarefa, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, -1, -1));

        inicioBotaoEditar.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        inicioBotaoEditar.setText("EDITAR");
        inicioBotaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioBotaoEditarActionPerformed(evt);
            }
        });
        jPanel1.add(inicioBotaoEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, -1, -1));

        inicioBotaoExcluir.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        inicioBotaoExcluir.setText("EXCLUIR");
        inicioBotaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicioBotaoExcluirActionPerformed(evt);
            }
        });
        jPanel1.add(inicioBotaoExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, -1, -1));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1016, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void inicioLoginBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioLoginBotaoActionPerformed
          logout();
    }//GEN-LAST:event_inicioLoginBotaoActionPerformed

    private void inicioBotaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioBotaoEditarActionPerformed
        int linhaSelecionada = jTable1.getSelectedRow();
    
        if (linhaSelecionada >= 0) {
        new Editar(this).setVisible(true); //  abre o Editar passando o Inicio
        } else {
        JOptionPane.showMessageDialog(this, "Selecione uma tarefa para editar!");
        }
    }//GEN-LAST:event_inicioBotaoEditarActionPerformed

    private void inicioBotaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicioBotaoExcluirActionPerformed
       int linhaSelecionada = jTable1.getSelectedRow();// Pega linha selecionada
       
        if (linhaSelecionada >= 0) {
        int linhaModelo = jTable1.convertRowIndexToModel(linhaSelecionada);
        
        // Confirmação de exclusão
        int confirmacao = JOptionPane.showConfirmDialog(this, "Deseja excluir esta tarefa?", "Confirmar exclusão", JOptionPane.YES_NO_OPTION);

        if (confirmacao == JOptionPane.YES_OPTION) {
            modelo.removeRow(linhaModelo); // Remove linha
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