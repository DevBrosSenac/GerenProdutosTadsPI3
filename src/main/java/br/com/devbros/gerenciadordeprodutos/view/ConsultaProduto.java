/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.devbros.gerenciadordeprodutos.view;

import br.com.devbros.gerenciadordeprodutos.controller.ProdutoController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author priscyla-poliveira
 */
public class ConsultaProduto extends javax.swing.JFrame {

    /**
     * Creates new form ConsultaProduto
     */
    public ConsultaProduto() {
        initComponents();
        this.setTitle("Consulta de produtos");
        desativarFormulario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        disponivelButtonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        pesquisarButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        produtoTabela = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        nomeLabel = new javax.swing.JLabel();
        descricaoLabel = new javax.swing.JLabel();
        vendaLabel = new javax.swing.JLabel();
        compraLabel = new javax.swing.JLabel();
        qtdLabel = new javax.swing.JLabel();
        nomeTxt = new javax.swing.JTextField();
        descricaoTxt = new javax.swing.JTextField();
        vendaTxt = new javax.swing.JTextField();
        compraTxt = new javax.swing.JTextField();
        qtdSpinner = new javax.swing.JSpinner();
        salvarButton = new javax.swing.JButton();
        excluirButton = new javax.swing.JButton();
        cancelarButton = new javax.swing.JButton();
        editarButton = new javax.swing.JButton();
        categoriaButton = new javax.swing.JButton();
        disponivelLabel = new javax.swing.JLabel();
        simButton = new javax.swing.JRadioButton();
        naoButton = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("CONSULTAR PRODUTOS");

        pesquisarButton.setText("PESQUISAR");

        produtoTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "NOME", "CATEGORIA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(produtoTabela);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("EDITAR PRODUTO");

        nomeLabel.setText("NOME:");

        descricaoLabel.setText("DESCRIÇÃO:");

        vendaLabel.setText("PREÇO DE VENDA:");

        compraLabel.setText("PREÇO DE COMPRA:");

        qtdLabel.setText("QUANTIDADE:");

        nomeTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTxtActionPerformed(evt);
            }
        });

        salvarButton.setText("SALVAR");
        salvarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarButtonActionPerformed(evt);
            }
        });

        excluirButton.setText("EXCLUIR");
        excluirButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirButtonActionPerformed(evt);
            }
        });

        cancelarButton.setText("CANCELAR");
        cancelarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtonActionPerformed(evt);
            }
        });

        editarButton.setText("EDITAR PRODUTO");
        editarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editarButtonActionPerformed(evt);
            }
        });

        categoriaButton.setText("SELECIONAR CATEGORIA...");
        categoriaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaButtonActionPerformed(evt);
            }
        });

        disponivelLabel.setText("DISPONÍVEL:");

        disponivelButtonGroup.add(simButton);
        simButton.setText("SIM");

        disponivelButtonGroup.add(naoButton);
        naoButton.setText("NÃO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextField1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pesquisarButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(editarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(categoriaButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(salvarButton)
                        .addGap(18, 18, 18)
                        .addComponent(excluirButton)
                        .addGap(18, 18, 18)
                        .addComponent(cancelarButton))
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nomeLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(descricaoLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descricaoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(vendaLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vendaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(compraLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(compraTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(qtdLabel)
                            .addComponent(disponivelLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(qtdSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(simButton)
                                .addGap(18, 18, 18)
                                .addComponent(naoButton)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomeLabel)
                            .addComponent(nomeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(descricaoLabel)
                            .addComponent(descricaoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vendaLabel)
                            .addComponent(vendaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(compraLabel)
                            .addComponent(compraTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(qtdLabel)
                            .addComponent(qtdSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(disponivelLabel)
                            .addComponent(simButton)
                            .addComponent(naoButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(salvarButton)
                            .addComponent(excluirButton)
                            .addComponent(cancelarButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pesquisarButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editarButton)
                            .addComponent(categoriaButton))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTxtActionPerformed

    public void desativarFormulario() {
        nomeLabel.setEnabled(false);
        nomeTxt.setEditable(false);
        descricaoLabel.setEnabled(false);
        descricaoTxt.setEditable(false);
        vendaLabel.setEnabled(false);
        vendaTxt.setEditable(false);
        compraLabel.setEnabled(false);
        compraTxt.setEditable(false);
        qtdLabel.setEnabled(false);
        qtdSpinner.setEnabled(false);
        disponivelLabel.setEnabled(false);
        simButton.setEnabled(false);
        naoButton.setEnabled(false);
    }

    public void ativarFormulario() {
        nomeLabel.setEnabled(true);
        nomeTxt.setEditable(true);
        descricaoLabel.setEnabled(true);
        descricaoTxt.setEditable(true);
        vendaLabel.setEnabled(true);
        vendaTxt.setEditable(true);
        compraLabel.setEnabled(true);
        compraTxt.setEditable(true);
        qtdLabel.setEnabled(true);
        qtdSpinner.setEnabled(true);
        disponivelLabel.setEnabled(true);
        simButton.setEnabled(true);
        naoButton.setEnabled(true);
    }

    public void limparFormulario() {
        nomeTxt.setText("");
        descricaoTxt.setText("");
        vendaTxt.setText("");
        compraTxt.setText("");
        qtdSpinner.setValue(0);
        disponivelButtonGroup.clearSelection();
    }

    public static void loadTabela(){
        //Peço ao controller resgatar os produtos do banco de dados
        ArrayList<String[]> listaProdutos = ProdutoController.getProdutos();
        
        //Crio manualmente um modelo para a tabela e defino as colunas
        DefaultTableModel tmProdutos = new DefaultTableModel();
        tmProdutos.addColumn("NOME");
        tmProdutos.addColumn("CATEGORIA");
        produtoTabela.setModel(tmProdutos);
        
        //Para cada produto resgatado do banco de dados, atualizo a tabela
        listaProdutos.forEach(tmProdutos::addRow);
    }

    private void cancelarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtonActionPerformed
        // TODO add your handling code here:
        Menu m = new Menu();
        m.setVisible(true);
        m.setResizable(false);
        m.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_cancelarButtonActionPerformed

    private void categoriaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaButtonActionPerformed
        // TODO add your handling code here:
        ProdutoCategoria p = new ProdutoCategoria();
        p.setVisible(true);
        p.setResizable(false);
        p.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_categoriaButtonActionPerformed

    private void editarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editarButtonActionPerformed
        // TODO add your handling code here:
        if(produtoTabela.getRowCount() > 0){
            if(produtoTabela.getSelectedRow() >= 0){
                ativarFormulario();
                
                //Atribuo os valores que estão na linha selecionada para a tabela
                nomeTxt.setText(produtoTabela.getModel().getValueAt(produtoTabela.getSelectedRow(), 0).toString());
                categoriaButton.setText(produtoTabela.getModel().getValueAt(produtoTabela.getSelectedRow(), 1).toString());

            }
            else{
                JOptionPane.showMessageDialog(this,"Selecione um produto para editar!");
            }
        } else{
            JOptionPane.showMessageDialog(this,"Não há produto para editar!");
        }
    }//GEN-LAST:event_editarButtonActionPerformed

    private void salvarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarButtonActionPerformed
        // TODO add your handling code here:
        limparFormulario();
    }//GEN-LAST:event_salvarButtonActionPerformed

    private void excluirButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirButtonActionPerformed
        if (produtoTabela.getRowCount() > 0) {
            int numeroLinha = produtoTabela.getSelectedRow();
            ProdutoController.Excluir(produtoTabela.getValueAt(numeroLinha,0).toString());
            JOptionPane.showMessageDialog(this,"Produto excluído da base de dados");
        } else{
            JOptionPane.showMessageDialog(this,"Não há produtos para excluir!");
        }
    }//GEN-LAST:event_excluirButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultaProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultaProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarButton;
    private javax.swing.JButton categoriaButton;
    private javax.swing.JLabel compraLabel;
    private javax.swing.JTextField compraTxt;
    private javax.swing.JLabel descricaoLabel;
    private javax.swing.JTextField descricaoTxt;
    private javax.swing.ButtonGroup disponivelButtonGroup;
    private javax.swing.JLabel disponivelLabel;
    private javax.swing.JButton editarButton;
    private javax.swing.JButton excluirButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton naoButton;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nomeTxt;
    private javax.swing.JButton pesquisarButton;
    private static javax.swing.JTable produtoTabela;
    private javax.swing.JLabel qtdLabel;
    private javax.swing.JSpinner qtdSpinner;
    private javax.swing.JButton salvarButton;
    private javax.swing.JRadioButton simButton;
    private javax.swing.JLabel vendaLabel;
    private javax.swing.JTextField vendaTxt;
    // End of variables declaration//GEN-END:variables
}
