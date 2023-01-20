package br.com.GorjTable.telas;

import br.com.GorjTable.dal.ConnectionModule;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TelaLogin extends javax.swing.JFrame {

    Connection conexao = null;

    public TelaLogin() {
        initComponents();
        conexao = ConnectionModule.conector();
        //System.out.println(conexao);
        if (conexao != null) {
            lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/GorjTable/icons/Good.png")));
        } else {
            lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/GorjTable/icons/NotGood.png")));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEnter = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TABELA CLIENTES GORJ");
        setBackground(new java.awt.Color(0, 204, 51));
        setResizable(false);

        btnEnter.setText("Enter");
        btnEnter.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnEnter.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEnter.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        lblStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/GorjTable/icons/Good.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(lblStatus))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblStatus)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        try {
            Entrar();
        } catch (SQLException ex) {
            Logger.getLogger(TelaLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEnterActionPerformed

    public void Entrar() throws SQLException {
        TelaPrincipal principal = new TelaPrincipal();
        principal.setVisible(true);
        this.dispose();
        conexao.close();

    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnter;
    private javax.swing.JLabel lblStatus;
    // End of variables declaration//GEN-END:variables
}
