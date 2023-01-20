/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.GorjTable.telas;

import Beans.Clientesgorj;
import br.com.GorjTable.dal.ClienteDAO;
import br.com.GorjTable.dal.ConnectionModule;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jarvis
 */
public class TabelaDeClientes extends javax.swing.JFrame {

//incopatible types: java
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        Voltar = new javax.swing.JButton();
        Pesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TABELA");
        setAutoRequestFocus(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Tabela.setBackground(new java.awt.Color(51, 255, 51));
        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Comercio", "Cidade", "Endereço", "CNPJ", "Status", "Telefone"
            }
        ));
        jScrollPane1.setViewportView(Tabela);

        Voltar.setText("Back");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });

        Pesquisar.setText("Search");
        Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pesquisar)
                    .addComponent(Voltar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Voltar)
                .addGap(18, 18, 18)
                .addComponent(Pesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(1076, 811));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        TelaPrincipal principal = new TelaPrincipal();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_VoltarActionPerformed

    private void PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarActionPerformed
        fillTable();


    }//GEN-LAST:event_PesquisarActionPerformed

    private void fillTable() {
        ClienteDAO clienteDAO = new ClienteDAO();
        List<Clientesgorj> listaClientes = clienteDAO.getClientes();

        DefaultTableModel tabelaClientes = (DefaultTableModel) Tabela.getModel();

        for (Clientesgorj c : listaClientes) {
            Object[] obj = new Object[]{
                c.getId(),
                c.getNome(),
                c.getComercio(),
                c.getCidade(),
                c.getEndereco(),
                c.getCnpj(),
                c.getStatus_cl(),
                c.getTelefone()

            };
            tabelaClientes.addRow(obj);

            //id, nome, comercio, cidade, endereco, cnpj(int) status_cl, telefone(int) 
        }

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TabelaDeClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TabelaDeClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TabelaDeClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TabelaDeClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new TabelaDeClientes().setVisible(false);
        });
    }

    public TabelaDeClientes() {
        initComponents();
        ConnectionModule.conector();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Pesquisar;
    private javax.swing.JTable Tabela;
    private javax.swing.JButton Voltar;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
