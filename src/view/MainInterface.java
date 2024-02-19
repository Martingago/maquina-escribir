package view;

import javax.swing.ImageIcon;
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
        total_words_now = new javax.swing.JTextField();
        PanelPestañas = new javax.swing.JTabbedPane();
        Globales = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        text_global_palabras = new javax.swing.JTextPane();
        Detalles = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaElementos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Consola = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        salida_mensajes_consola = new javax.swing.JTextPane();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        text_ultima_palabra_encontrada = new javax.swing.JTextPane();
        panel_log = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        texto_palabras = new javax.swing.JTextArea();
        total_time_ejecution = new javax.swing.JTextField();
        total_words_generated = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        panel_menu_app = new javax.swing.JPanel();
        start_btn = new javax.swing.JButton();
        pause_btn = new javax.swing.JButton();
        force_copy_data_btn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        img = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_principal.setBackground(new java.awt.Color(255, 255, 255));
        panel_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_registro.setBackground(new java.awt.Color(255, 255, 255));
        panel_registro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        total_words_now.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        total_words_now.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        total_words_now.setBorder(null);
        total_words_now.setFocusable(false);
        total_words_now.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_words_nowActionPerformed(evt);
            }
        });
        panel_registro.add(total_words_now, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 560, 160, 30));

        PanelPestañas.setBackground(new java.awt.Color(153, 153, 153));
        PanelPestañas.setFont(new java.awt.Font("Noto Sans", 1, 16)); // NOI18N

        Globales.setBackground(new java.awt.Color(255, 255, 255));
        Globales.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Evolución global de las palabras");
        Globales.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 530, 30));

        text_global_palabras.setContentType("text/html");
        text_global_palabras.setEditable(false);
        text_global_palabras.setBackground(new java.awt.Color(255, 255, 255));
        text_global_palabras.setContentType("text/html");
        text_global_palabras.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        text_global_palabras.setFocusable(false);
        jScrollPane1.setViewportView(text_global_palabras);

        Globales.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 530, 420));

        PanelPestañas.addTab("General", Globales);

        Detalles.setBackground(new java.awt.Color(245, 245, 245));
        Detalles.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane4.setBorder(null);

        tablaElementos.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        model.addColumn("ID");
        model.addColumn("Palabra");
        model.addColumn("Intentos");
        model.addColumn("Hora");
        model.addColumn("Fecha");
        tablaElementos.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
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

        Detalles.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 530, 420));

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Detalle palabras encontradas");
        Detalles.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 530, 30));

        PanelPestañas.addTab("Detalles", Detalles);

        Consola.setBackground(new java.awt.Color(245, 245, 245));
        Consola.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        salida_mensajes_consola.setEditable(false);
        salida_mensajes_consola.setBackground(new java.awt.Color(255, 255, 255));
        salida_mensajes_consola.setContentType("text/html");
        salida_mensajes_consola.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        salida_mensajes_consola.setFocusable(false);
        jScrollPane5.setViewportView(salida_mensajes_consola);

        Consola.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 530, 420));

        jLabel7.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Registro de mensajes de la consola");
        Consola.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 530, 30));

        PanelPestañas.addTab("Consola", Consola);

        panel_registro.add(PanelPestañas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 510));

        jLabel6.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Generaciones palabra actual:");
        panel_registro.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 560, 230, 30));

        jScrollPane6.setViewportView(text_ultima_palabra_encontrada);

        panel_registro.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 530, 30));

        panel_principal.add(panel_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 550, 610));

        panel_log.setBackground(new java.awt.Color(96, 96, 96));
        panel_log.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Total elementos generados");
        panel_log.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 190, 30));

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        texto_palabras.setEditable(false);
        texto_palabras.setColumns(20);
        texto_palabras.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        texto_palabras.setRows(5);
        texto_palabras.setAutoscrolls(false);
        texto_palabras.setBorder(null);
        texto_palabras.setFocusable(false);
        jScrollPane2.setViewportView(texto_palabras);

        panel_log.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 190, 430));

        total_time_ejecution.setBackground(new java.awt.Color(29, 29, 29));
        total_time_ejecution.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        total_time_ejecution.setForeground(new java.awt.Color(255, 255, 255));
        total_time_ejecution.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        total_time_ejecution.setBorder(null);
        total_time_ejecution.setFocusable(false);
        total_time_ejecution.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_time_ejecutionActionPerformed(evt);
            }
        });
        panel_log.add(total_time_ejecution, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 40));

        total_words_generated.setBackground(new java.awt.Color(96, 96, 96));
        total_words_generated.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        total_words_generated.setForeground(new java.awt.Color(255, 255, 255));
        total_words_generated.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        total_words_generated.setBorder(null);
        total_words_generated.setFocusable(false);
        total_words_generated.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_words_generatedActionPerformed(evt);
            }
        });
        panel_log.add(total_words_generated, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 570, 190, 30));

        jLabel4.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Registro de palabras");
        panel_log.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 190, 30));

        panel_principal.add(panel_log, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 610));

        getContentPane().add(panel_principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, -1));

        panel_menu_app.setBackground(new java.awt.Color(29, 29, 29));
        panel_menu_app.setFont(new java.awt.Font("Noto Sans", 0, 12)); // NOI18N
        panel_menu_app.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        start_btn.setBackground(new java.awt.Color(0, 250, 174));
        start_btn.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        start_btn.setText("Iniciar");
        start_btn.setToolTipText("Inicia el programa que generará carácteres aleatorios hasta completar la cadena seleccionada");
        start_btn.setBorder(null);
        panel_menu_app.add(start_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 220, 40));

        pause_btn.setBackground(new java.awt.Color(204, 204, 204));
        pause_btn.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        pause_btn.setText("Pausar");
        pause_btn.setBorder(null);
        pause_btn.setEnabled(false);
        panel_menu_app.add(pause_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, 220, 40));

        force_copy_data_btn.setBackground(new java.awt.Color(59, 110, 158));
        force_copy_data_btn.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        force_copy_data_btn.setText("Actualizar copia seguridad");
        force_copy_data_btn.setBorder(null);
        force_copy_data_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                force_copy_data_btnActionPerformed(evt);
            }
        });
        panel_menu_app.add(force_copy_data_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 530, 220, 40));

        jLabel5.setFont(new java.awt.Font("Noto Sans", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Paradoja de los monos");
        panel_menu_app.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 260, -1));

        jLabel8.setFont(new java.awt.Font("Noto Sans", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Infinitos.");
        panel_menu_app.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 230, -1));

        img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/paradoja-monos-infinitos-reescalado.png"))); // NOI18N
        img.setText("jLabel9");
        panel_menu_app.add(img, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 220, 230));

        getContentPane().add(panel_menu_app, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 320, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void force_copy_data_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_force_copy_data_btnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_force_copy_data_btnActionPerformed

    private void total_time_ejecutionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_time_ejecutionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_total_time_ejecutionActionPerformed

    private void total_words_generatedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_words_generatedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_total_words_generatedActionPerformed

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
    private javax.swing.JPanel Consola;
    private javax.swing.JPanel Detalles;
    private javax.swing.JPanel Globales;
    private javax.swing.JTabbedPane PanelPestañas;
    public javax.swing.JButton force_copy_data_btn;
    private javax.swing.JLabel img;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JPanel panel_log;
    private javax.swing.JPanel panel_menu_app;
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
