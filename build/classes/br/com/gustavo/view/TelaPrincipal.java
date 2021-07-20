/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gustavo.view;

import br.com.gustavo.model.DAO.ProdutoDAO;
import br.com.gustavo.model.bean.Produto;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author GUSTAVO
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * METODO DEFAULT TABEL MODEL PARA A TABELA DO JSWING
     */
    public TelaPrincipal() {
        initComponents();
        DefaultTableModel modelo = (DefaultTableModel) jtprodutos.getModel();
        jtprodutos.setRowSorter(new TableRowSorter(modelo));
        readtable();
    }

    //METODO PARA LER A TABELA
    public void readtable() {
        DefaultTableModel modelo = (DefaultTableModel) jtprodutos.getModel();
        modelo.setNumRows(0);
        ProdutoDAO dao = new ProdutoDAO();

        for (Produto p : dao.findAll()) {
            modelo.addRow(new Object[]{
                p.getId(),
                p.getDescricao(),
                p.getQtd(),
                p.getValor()
            });
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtprodutos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtDesc = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtQtd = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPreco = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/gustavo/imagens/hibernatelogo.jpg"))); // NOI18N

        jtprodutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Descrição", "Quantidade", "Preco"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtprodutos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtprodutosKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jtprodutos);
        if (jtprodutos.getColumnModel().getColumnCount() > 0) {
            jtprodutos.getColumnModel().getColumn(3).setResizable(false);
        }

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Atualizar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Remover");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setText("Descrição");

        jLabel3.setText("Quantidade");

        jLabel4.setText("Preco");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(8, 8, 8)
                        .addComponent(jButton3))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(102, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(121, 121, 121)
                                .addComponent(jLabel3)
                                .addGap(132, 132, 132)
                                .addComponent(jLabel4)
                                .addGap(133, 133, 133))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(104, 104, 104)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQtd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //BOTÃO CADASTRAR
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //CADASTRANDO NO BANCO DE DADOS COM JPA

        Produto p = new Produto();
        ProdutoDAO dao = new ProdutoDAO();

        p.setDescricao(txtDesc.getText());
        p.setQtd(Integer.parseInt(txtQtd.getText()));
        p.setValor(Double.parseDouble(txtPreco.getText()));
        dao.save(p);
        txtDesc.setText("");
        txtQtd.setText("");
        txtPreco.setText("");
        readtable();

        JOptionPane.showMessageDialog(null, "Salvo com sucesso !");

    }//GEN-LAST:event_jButton1ActionPerformed
    //BOTAO ATUALIZAR
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // ATUALIZANDO DADOS DO BANCO DE DADOS COM JPA

        if (jtprodutos.getSelectedRow() != -1) {
            Produto p = new Produto();
            ProdutoDAO dao = new ProdutoDAO();

            p.setDescricao(txtDesc.getText());
            p.setQtd(Integer.parseInt(txtQtd.getText()));
            p.setValor(Double.parseDouble(txtPreco.getText()));
            p.setId((int) jtprodutos.getValueAt(jtprodutos.getSelectedRow(), 0));
            dao.update(p);
            txtDesc.setText("");
            txtQtd.setText("");
            txtPreco.setText("");
            readtable();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso !");

        }else{
                    
 JOptionPane.showMessageDialog(null,"Selecione um produto para atualizar", "Produto",JOptionPane.WARNING_MESSAGE);  
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    //BOTÃO REMOVER
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // REMOVENDO DADOS DO BANCO DE DADOS COM JPA
        
        if(jtprodutos.getSelectedRow() != -1){
            Produto p = new Produto();
            ProdutoDAO dao = new ProdutoDAO();

            p.setId((int) jtprodutos.getValueAt(jtprodutos.getSelectedRow(), 0));
            dao.delete(p);
            txtDesc.setText("");
            txtQtd.setText("");
            txtPreco.setText("");
            readtable();

            JOptionPane.showMessageDialog(null, "excluido com sucesso !");
        }else{
     JOptionPane.showMessageDialog(null,"Selecione um produto para excluir", "Produto",JOptionPane.WARNING_MESSAGE);     
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    //METODO PARA MOSTRAR NOS TEXTFIELDS OS VALORES OBTIDOS DA TABELA SSIM QUE CLICAR NOS CAMPOS
    private void jtprodutosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtprodutosKeyReleased

        //IF PARA SABER SE A LINHA ESTA SELECIONADA
        if (jtprodutos.getSelectedRow() != -1) {

            txtDesc.setText(jtprodutos.getValueAt(jtprodutos.getSelectedRow(), 1).toString());
            txtQtd.setText(jtprodutos.getValueAt(jtprodutos.getSelectedRow(), 2).toString());
            txtPreco.setText(jtprodutos.getValueAt(jtprodutos.getSelectedRow(), 3).toString());
        }else{
JOptionPane.showMessageDialog(null,"Produto", "Nenhuma linha selecionada",JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_jtprodutosKeyReleased

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtprodutos;
    private javax.swing.JTextField txtDesc;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQtd;
    // End of variables declaration//GEN-END:variables

}