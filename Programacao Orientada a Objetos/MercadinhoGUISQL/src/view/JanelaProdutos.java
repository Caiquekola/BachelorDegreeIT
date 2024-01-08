/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;


import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.bean.Produto;
import model.dao.ProdutoDAO;

/**
 *
 * @author ADMIN
 */
public class JanelaProdutos extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public JanelaProdutos() {
        initComponents();
        setLocationRelativeTo(null); 
        DefaultTableModel modelo = (DefaultTableModel) jtTabela.getModel();
        jtTabela.setRowSorter(new TableRowSorter(modelo));
        
        readJTable();
    }
    public void readJTable(){
        DefaultTableModel modelo = (DefaultTableModel) jtTabela.getModel();
        modelo.setNumRows(0);
        ProdutoDAO pdao = new ProdutoDAO();
    
        for(Produto p: pdao.read()){
            
            modelo.addRow(new Object[]{
                p.getId(),
                p.getDescricao(),
                p.getQtd(),
                p.getPreco()
            });
            
        }
    
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpDados = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtDesc = new javax.swing.JTextField();
        jtQtd = new javax.swing.JTextField();
        jtPreco = new javax.swing.JTextField();
        jlDescricao = new javax.swing.JLabel();
        jlPreco = new javax.swing.JLabel();
        jlQuantidade = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jpBotao = new javax.swing.JPanel();
        jbCadastrar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbAtualizar = new javax.swing.JButton();
        jpTabela = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabela = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images/Kola MarketNo.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jtDesc.setToolTipText("");
        jtDesc.setName(""); // NOI18N
        jtDesc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDescActionPerformed(evt);
            }
        });

        jtQtd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtQtdActionPerformed(evt);
            }
        });

        jtPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPrecoActionPerformed(evt);
            }
        });

        jlDescricao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlDescricao.setText("Nome do produto");

        jlPreco.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlPreco.setText("Preço");

        jlQuantidade.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlQuantidade.setText("Quantidade");

        javax.swing.GroupLayout jpDadosLayout = new javax.swing.GroupLayout(jpDados);
        jpDados.setLayout(jpDadosLayout);
        jpDadosLayout.setHorizontalGroup(
            jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpDadosLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlDescricao))
                .addGap(35, 35, 35)
                .addGroup(jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpDadosLayout.createSequentialGroup()
                        .addComponent(jlQuantidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpDadosLayout.createSequentialGroup()
                        .addComponent(jtQtd, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                        .addGap(54, 54, 54)))
                .addGroup(jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlPreco)
                    .addComponent(jtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29))
            .addComponent(jSeparator1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDadosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpDadosLayout.setVerticalGroup(
            jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDadosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDescricao)
                    .addComponent(jlPreco)
                    .addComponent(jlQuantidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jpDados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 562, -1));

        jbCadastrar.setText("Cadastrar");
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });

        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbAtualizar.setText("Atualizar");
        jbAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpBotaoLayout = new javax.swing.GroupLayout(jpBotao);
        jpBotao.setLayout(jpBotaoLayout);
        jpBotaoLayout.setHorizontalGroup(
            jpBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBotaoLayout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addComponent(jbCadastrar)
                .addGap(68, 68, 68)
                .addComponent(jbExcluir)
                .addGap(75, 75, 75)
                .addComponent(jbAtualizar)
                .addGap(102, 102, 102))
        );
        jpBotaoLayout.setVerticalGroup(
            jpBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBotaoLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jpBotaoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbCadastrar)
                    .addComponent(jbExcluir)
                    .addComponent(jbAtualizar))
                .addGap(15, 15, 15))
        );

        getContentPane().add(jpBotao, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 305, -1, -1));

        jtTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "DESCRIÇÃO", "QTD", "PREÇO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtTabela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTabelaMouseClicked(evt);
            }
        });
        jtTabela.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtTabelaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtTabela);

        javax.swing.GroupLayout jpTabelaLayout = new javax.swing.GroupLayout(jpTabela);
        jpTabela.setLayout(jpTabelaLayout);
        jpTabelaLayout.setHorizontalGroup(
            jpTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpTabelaLayout.setVerticalGroup(
            jpTabelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpTabelaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jpTabela, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 365, -1, -1));

        jLabel2.setBackground(new java.awt.Color(102, 0, 0));
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/images.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 580));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtPrecoActionPerformed

    private void jtDescActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDescActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDescActionPerformed

    private void jtQtdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtQtdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtQtdActionPerformed

    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        // TODO add your handling code here:
        Produto p = new Produto();
        ProdutoDAO dao = new ProdutoDAO();
        p.setDescricao(jtDesc.getText());
        p.setQtd(Integer.parseInt(jtQtd.getText()));
        p.setPreco(Double.parseDouble(jtPreco.getText()));
        dao.create(p);
        jtQtd.setText("");
        jtPreco.setText("");
        jtDesc.setText("");
        readJTable();
    }//GEN-LAST:event_jbCadastrarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        // TODO add your handling code here:
        if(jtTabela.getSelectedRow()!= -1){
            Produto p = new Produto();
            ProdutoDAO dao = new ProdutoDAO();
            p.setId((int)jtTabela.getValueAt(jtTabela.getSelectedRow(), 0));
            dao.delete(p);

            jtQtd.setText("");
            jtPreco.setText("");
            jtDesc.setText("");

            readJTable();
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizarActionPerformed
        // TODO add your handling code here:
        if(jtTabela.getSelectedRow()!= -1){
            Produto p = new Produto();
            ProdutoDAO dao = new ProdutoDAO();
            p.setDescricao(jtDesc.getText());
            p.setQtd(Integer.parseInt(jtQtd.getText()));
            p.setPreco(Double.parseDouble(jtPreco.getText()));
            p.setId((int)jtTabela.getValueAt(jtTabela.getSelectedRow(), 0));
            dao.update(p);

            jtQtd.setText("");
            jtPreco.setText("");
            jtDesc.setText("");

            readJTable();
        }
        
        
    }//GEN-LAST:event_jbAtualizarActionPerformed

    private void jtTabelaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtTabelaKeyReleased
        // TODO add your handling code here:
        if(jtTabela.getSelectedRow()!= -1){
            jtDesc.setText(jtTabela.getValueAt(jtTabela.getSelectedRow(),1).toString());
            jtQtd.setText(jtTabela.getValueAt(jtTabela.getSelectedRow(),2).toString());
            jtPreco.setText(jtTabela.getValueAt(jtTabela.getSelectedRow(),3).toString());
        }
    }//GEN-LAST:event_jtTabelaKeyReleased

    private void jtTabelaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTabelaMouseClicked
        // TODO add your handling code here:
        if(jtTabela.getSelectedRow()!= -1){
            jtDesc.setText(jtTabela.getValueAt(jtTabela.getSelectedRow(),1).toString());
            jtQtd.setText(jtTabela.getValueAt(jtTabela.getSelectedRow(),2).toString());
            jtPreco.setText(jtTabela.getValueAt(jtTabela.getSelectedRow(),3).toString());
        }
    }//GEN-LAST:event_jtTabelaMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JanelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
            
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                
                new JanelaProdutos().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbAtualizar;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JLabel jlDescricao;
    private javax.swing.JLabel jlPreco;
    private javax.swing.JLabel jlQuantidade;
    private javax.swing.JPanel jpBotao;
    private javax.swing.JPanel jpDados;
    private javax.swing.JPanel jpTabela;
    private javax.swing.JTextField jtDesc;
    private javax.swing.JTextField jtPreco;
    private javax.swing.JTextField jtQtd;
    private javax.swing.JTable jtTabela;
    // End of variables declaration//GEN-END:variables
}
