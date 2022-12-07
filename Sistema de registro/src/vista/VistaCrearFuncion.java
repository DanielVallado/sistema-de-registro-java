package vista;

import com.toedter.calendar.JDateChooser;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class VistaCrearFuncion extends javax.swing.JFrame {

    public VistaCrearFuncion() {
        initComponents();
    }
    
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/iconoApp.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entradaHora = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnCrearFuncion = new javax.swing.JButton();
        btnVolverAtras = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtError = new javax.swing.JLabel();
        entradaFecha = new com.toedter.calendar.JDateChooser();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        nombreFuncion = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        entradaPrimerHora = new javax.swing.JRadioButton();
        entradaSegundaHora = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crear Función");
        setIconImage(getIconImage());
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(28, 12, 91));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("CREAR FUNCIÓN");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, 70));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 90));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnCrearFuncion.setBackground(new java.awt.Color(28, 12, 91));
        btnCrearFuncion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnCrearFuncion.setForeground(new java.awt.Color(255, 255, 255));
        btnCrearFuncion.setText("Crear función");
        btnCrearFuncion.setBorderPainted(false);
        btnCrearFuncion.setFocusPainted(false);
        btnCrearFuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearFuncionActionPerformed(evt);
            }
        });
        jPanel3.add(btnCrearFuncion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, 160, 40));

        btnVolverAtras.setBackground(new java.awt.Color(255, 255, 255));
        btnVolverAtras.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnVolverAtras.setForeground(new java.awt.Color(0, 124, 186));
        btnVolverAtras.setText("Volver atrás");
        btnVolverAtras.setBorderPainted(false);
        btnVolverAtras.setContentAreaFilled(false);
        btnVolverAtras.setFocusPainted(false);
        jPanel3.add(btnVolverAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 370, 120, 30));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 124, 186));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Llena los siguientes datos para crear una función");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 124, 186));
        jLabel12.setText("Fecha de presentación:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        txtError.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtError.setForeground(new java.awt.Color(255, 0, 51));
        txtError.setText("Error");
        jPanel3.add(txtError, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, -1, 20));

        entradaFecha.getDateEditor().setEnabled(false);
        entradaFecha.setBackground(new java.awt.Color(205, 205, 205));
        entradaFecha.setForeground(new java.awt.Color(0, 124, 255));
        entradaFecha.setDateFormatString("yyy-MM-dd");
        entradaFecha.setDoubleBuffered(false);
        entradaFecha.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        entradaFecha.setOpaque(false);
        jPanel3.add(entradaFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 370, 30));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 124, 186));
        jLabel13.setText("Nombre de la funcion:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jPanel4.setBackground(new java.awt.Color(205, 205, 205));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreFuncion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nombreFuncion.setForeground(new java.awt.Color(0, 124, 186));
        nombreFuncion.setText("Nombre");
        jPanel4.add(nombreFuncion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 540, 30));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 570, 30));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 124, 186));
        jLabel10.setText("Hora de presentación:");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, -1, 30));

        entradaPrimerHora.setBackground(new java.awt.Color(255, 255, 255));
        entradaHora.add(entradaPrimerHora);
        entradaPrimerHora.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        entradaPrimerHora.setForeground(new java.awt.Color(0, 124, 186));
        entradaPrimerHora.setText("18:00");
        entradaPrimerHora.setBorder(null);
        entradaPrimerHora.setContentAreaFilled(false);
        entradaPrimerHora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entradaPrimerHora.setFocusPainted(false);
        entradaPrimerHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entradaPrimerHoraActionPerformed(evt);
            }
        });
        jPanel5.add(entradaPrimerHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, -1, 40));

        entradaSegundaHora.setBackground(new java.awt.Color(255, 255, 255));
        entradaHora.add(entradaSegundaHora);
        entradaSegundaHora.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        entradaSegundaHora.setForeground(new java.awt.Color(0, 124, 186));
        entradaSegundaHora.setText("20:30");
        entradaSegundaHora.setBorder(null);
        entradaSegundaHora.setContentAreaFilled(false);
        entradaSegundaHora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entradaSegundaHora.setFocusPainted(false);
        jPanel5.add(entradaSegundaHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 0, -1, 40));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 580, 40));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 700, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearFuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearFuncionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCrearFuncionActionPerformed

    private void entradaPrimerHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entradaPrimerHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entradaPrimerHoraActionPerformed

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
            java.util.logging.Logger.getLogger(VistaCrearFuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaCrearFuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaCrearFuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaCrearFuncion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaCrearFuncion().setVisible(true);
            }
        });
    }

    public JLabel getNombreFuncion() {
        return nombreFuncion;
    }

    public void setNombreFuncion(JLabel nombreFuncion) {
        this.nombreFuncion = nombreFuncion;
    }
    
    public JButton getBtnCrearFuncion() {
        return btnCrearFuncion;
    }

    public void setBtnCrearFuncion(JButton btnCrearFuncion) {
        this.btnCrearFuncion = btnCrearFuncion;
    }

    public JButton getBtnVolverAtras() {
        return btnVolverAtras;
    }

    public void setBtnVolverAtras(JButton btnVolverAtras) {
        this.btnVolverAtras = btnVolverAtras;
    }

    public ButtonGroup getEntradaHora() {
        return entradaHora;
    }

    public void setEntradaHora(ButtonGroup entradaHora) {
        this.entradaHora = entradaHora;
    }

    public JRadioButton getEntradaPrimerHora() {
        return entradaPrimerHora;
    }

    public void setEntradaPrimerHora(JRadioButton entradaPrimerHora) {
        this.entradaPrimerHora = entradaPrimerHora;
    }

    public JRadioButton getEntradaSegundaHora() {
        return entradaSegundaHora;
    }

    public void setEntradaSegundaHora(JRadioButton entradaSegundaHora) {
        this.entradaSegundaHora = entradaSegundaHora;
    }
    
    public JDateChooser getEntradaFecha() {
        return entradaFecha;
    }

    public void setEntradaFecha(JDateChooser entradaFecha) {
        this.entradaFecha = entradaFecha;
    }

    public JLabel getTxtError() {
        return txtError;
    }

    public void setTxtError(JLabel txtError) {
        this.txtError = txtError;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrearFuncion;
    private javax.swing.JButton btnVolverAtras;
    private com.toedter.calendar.JDateChooser entradaFecha;
    private javax.swing.ButtonGroup entradaHora;
    private javax.swing.JRadioButton entradaPrimerHora;
    private javax.swing.JRadioButton entradaSegundaHora;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel nombreFuncion;
    private javax.swing.JLabel txtError;
    // End of variables declaration//GEN-END:variables
}
