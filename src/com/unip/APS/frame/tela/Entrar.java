package com.unip.APS.frame.tela;

import javax.swing.JLabel;

public class Entrar extends javax.swing.JFrame {

    public Entrar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txt_LoginSucesso = new javax.swing.JLabel();
        bt_Logar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        txt_LoginSucesso.setBackground(new java.awt.Color(255, 255, 255));
        txt_LoginSucesso.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_LoginSucesso.setForeground(new java.awt.Color(0, 204, 204));
        txt_LoginSucesso.setText("Login efetuado com sucesso!");

        bt_Logar.setBackground(new java.awt.Color(153, 153, 153));
        bt_Logar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        bt_Logar.setForeground(new java.awt.Color(255, 255, 255));
        bt_Logar.setText("Confirmar");
        bt_Logar.setContentAreaFilled(false);
        bt_Logar.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        bt_Logar.setOpaque(true);
        bt_Logar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_LogarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(bt_Logar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(txt_LoginSucesso)))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(txt_LoginSucesso, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 152, Short.MAX_VALUE)
                .addComponent(bt_Logar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_LogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_LogarActionPerformed
        setVisible(false);
    }//GEN-LAST:event_bt_LogarActionPerformed
        
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Entrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_Logar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txt_LoginSucesso;
    // End of variables declaration//GEN-END:variables

    public String getTxt_LoginSucesso() {
        return txt_LoginSucesso.toString();
    }

    public void setTxt_LoginSucesso(JLabel txt_LoginSucesso) {
        this.txt_LoginSucesso = txt_LoginSucesso;
    }
}
