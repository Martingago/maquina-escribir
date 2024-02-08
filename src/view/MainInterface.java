package view;

import model.global.GlobalData;

public class MainInterface extends javax.swing.JFrame {

    /**
     * Creates new form MainInterface
     */

    public MainInterface() {
        initComponents();
        GlobalData data = GlobalData.getInstance();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_principal = new javax.swing.JPanel();
        panel_registro = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto_salida = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        texto_palabras = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        start_btn = new javax.swing.JButton();
        total_words_generated = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        total_time_ejecution = new javax.swing.JTextField();
        pause_btn = new javax.swing.JButton();
        force_copy_data_btn = new javax.swing.JButton();
        total_words_now = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        panel_principal.setBackground(new java.awt.Color(255, 255, 255));
        panel_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_registro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        texto_salida.setColumns(20);
        texto_salida.setRows(5);
        texto_salida.setBorder(null);
        texto_salida.setFocusable(false);
        jScrollPane1.setViewportView(texto_salida);

        panel_registro.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 530, 330));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Registro palabras encontradas:");
        panel_registro.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 360, 30));

        panel_principal.add(panel_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 560, 400));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Log datos:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 140, 30));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        texto_palabras.setColumns(20);
        texto_palabras.setRows(5);
        texto_palabras.setBorder(null);
        texto_palabras.setFocusable(false);
        jScrollPane2.setViewportView(texto_palabras);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 140, 270));

        jScrollPane3.setBorder(null);
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane3.setFont(new java.awt.Font("Segoe UI", 0, 5)); // NOI18N

        jTextArea2.setColumns(5);
        jTextArea2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jTextArea2.setRows(3);
        jTextArea2.setText("(El registro de datos se\n ha limitado a 4 elementos \npor segundo)");
        jTextArea2.setWrapStyleWord(true);
        jTextArea2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextArea2.setFocusable(false);
        jScrollPane3.setViewportView(jTextArea2);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 140, -1));

        panel_principal.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 400));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        start_btn.setBackground(new java.awt.Color(153, 255, 153));
        start_btn.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        start_btn.setText("Iniciar");
        start_btn.setToolTipText("Inicia el programa que generará carácteres aleatorios hasta completar la cadena seleccionada");
        start_btn.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jPanel1.add(start_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 120, 30));

        total_words_generated.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        total_words_generated.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        total_words_generated.setBorder(null);
        total_words_generated.setFocusable(false);
        total_words_generated.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_words_generatedActionPerformed(evt);
            }
        });
        jPanel1.add(total_words_generated, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 250, 30));

        jLabel4.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        jLabel4.setText("Tiempo Activo:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 100, 30));

        jLabel5.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Total de palabras generadas:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 250, 30));

        total_time_ejecution.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        total_time_ejecution.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        total_time_ejecution.setBorder(null);
        total_time_ejecution.setFocusable(false);
        total_time_ejecution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_time_ejecutionActionPerformed(evt);
            }
        });
        jPanel1.add(total_time_ejecution, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 150, 30));

        pause_btn.setBackground(new java.awt.Color(255, 153, 153));
        pause_btn.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        pause_btn.setText("Pausar");
        pause_btn.setEnabled(false);
        jPanel1.add(pause_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 120, 30));

        force_copy_data_btn.setBackground(new java.awt.Color(153, 255, 255));
        force_copy_data_btn.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        force_copy_data_btn.setText("Forzar copia seguridad");
        jPanel1.add(force_copy_data_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 250, 30));

        total_words_now.setFont(new java.awt.Font("Noto Sans", 2, 12)); // NOI18N
        total_words_now.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        total_words_now.setBorder(null);
        total_words_now.setFocusable(false);
        total_words_now.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_words_nowActionPerformed(evt);
            }
        });
        jPanel1.add(total_words_now, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 250, 30));

        jLabel6.setFont(new java.awt.Font("Noto Sans", 2, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Total en la palabra actual:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 240, 30));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 260, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 260, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_principal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_principal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void total_words_generatedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_words_generatedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_total_words_generatedActionPerformed

    private void total_time_ejecutionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_time_ejecutionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_total_time_ejecutionActionPerformed

    private void total_words_nowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_words_nowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_total_words_nowActionPerformed

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
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton force_copy_data_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JPanel panel_principal;
    private javax.swing.JPanel panel_registro;
    public javax.swing.JButton pause_btn;
    public javax.swing.JButton start_btn;
    public javax.swing.JTextArea texto_palabras;
    public javax.swing.JTextArea texto_salida;
    public javax.swing.JTextField total_time_ejecution;
    public javax.swing.JTextField total_words_generated;
    public javax.swing.JTextField total_words_now;
    // End of variables declaration//GEN-END:variables
}
