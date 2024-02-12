package view;

import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import model.global.GlobalData;

public class MainInterface extends javax.swing.JFrame {

    /**
     * Creates new form MainInterface
     */
    public DefaultTableModel model = new DefaultTableModel();

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
        PanelPestañas = new javax.swing.JTabbedPane();
        Detalles = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaElementos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Globales = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        text_global_palabras = new javax.swing.JTextPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        salida_mensajes_consola = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        text_ultima_palabra_encontrada = new javax.swing.JTextPane();
        panel_log = new javax.swing.JPanel();
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

        PanelPestañas.setBackground(new java.awt.Color(0, 153, 153));

        Detalles.setBackground(new java.awt.Color(153, 255, 255));
        Detalles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane4.setBorder(null);

        tablaElementos.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        model.addColumn("ID");
        model.addColumn("Palabra");
        model.addColumn("Intentos");
        model.addColumn("Hora");
        model.addColumn("Fecha");
        tablaElementos.setModel(model
        );
        tablaElementos.setEnabled(false);
        //Diseño de las columnas
        tablaElementos.getColumnModel().getColumn(0).setPreferredWidth(60);
        tablaElementos.getColumnModel().getColumn(1).setPreferredWidth(100);
        tablaElementos.getColumnModel().getColumn(2).setPreferredWidth(197);
        tablaElementos.getColumnModel().getColumn(3).setPreferredWidth(90);
        tablaElementos.getColumnModel().getColumn(4).setPreferredWidth(80);
        // Cambiar la alineación de las columnas a la derecha
        DefaultTableCellRenderer rightRenderer = new DefaultTableCellRenderer();
        rightRenderer.setHorizontalAlignment(SwingConstants.RIGHT);
        for (int i = 0; i < tablaElementos.getColumnCount(); i++) {
            tablaElementos.getColumnModel().getColumn(i).setCellRenderer(rightRenderer);
        }
        jScrollPane4.setViewportView(tablaElementos);

        Detalles.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 540, 270));

        jLabel1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel1.setText("Detalle palabras encontradas:");
        Detalles.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, 30));

        PanelPestañas.addTab("Detalles", Detalles);

        Globales.setBackground(new java.awt.Color(255, 255, 204));
        Globales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel2.setText("Evolución global de las palabras:");
        Globales.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 260, 30));

        text_global_palabras.setContentType("text/html");
        text_global_palabras.setEditable(false);
        text_global_palabras.setContentType("text/html");
        text_global_palabras.setFocusable(false);
        jScrollPane1.setViewportView(text_global_palabras);

        Globales.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 540, 270));

        PanelPestañas.addTab("General", Globales);

        jPanel2.setBackground(new java.awt.Color(102, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salida_mensajes_consola.setEditable(false);
        salida_mensajes_consola.setContentType("text/html");
        salida_mensajes_consola.setFocusable(false);
        jScrollPane5.setViewportView(salida_mensajes_consola);

        jPanel2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 540, 270));

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel7.setText("Registro de mensajes de la consola:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 310, 30));

        PanelPestañas.addTab("Consola", jPanel2);

        panel_registro.add(PanelPestañas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 350));

        jScrollPane6.setViewportView(text_ultima_palabra_encontrada);

        panel_registro.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 540, 30));

        panel_principal.add(panel_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 560, 400));

        panel_log.setBackground(new java.awt.Color(204, 255, 204));
        panel_log.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Log datos:");
        panel_log.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 140, 30));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        texto_palabras.setColumns(20);
        texto_palabras.setRows(5);
        texto_palabras.setBorder(null);
        texto_palabras.setFocusable(false);
        jScrollPane2.setViewportView(texto_palabras);

        panel_log.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 140, 270));

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

        panel_log.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 346, 140, 50));

        panel_principal.add(panel_log, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 400));

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
    private javax.swing.JPanel Detalles;
    private javax.swing.JPanel Globales;
    private javax.swing.JTabbedPane PanelPestañas;
    public javax.swing.JButton force_copy_data_btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JPanel panel_log;
    private javax.swing.JPanel panel_principal;
    private javax.swing.JPanel panel_registro;
    public javax.swing.JButton pause_btn;
    public javax.swing.JTextPane salida_mensajes_consola;
    public javax.swing.JButton start_btn;
    public javax.swing.JTable tablaElementos;
    public javax.swing.JTextPane text_global_palabras;
    public javax.swing.JTextPane text_ultima_palabra_encontrada;
    public javax.swing.JTextArea texto_palabras;
    public javax.swing.JTextField total_time_ejecution;
    public javax.swing.JTextField total_words_generated;
    public javax.swing.JTextField total_words_now;
    // End of variables declaration//GEN-END:variables
}
