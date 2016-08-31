/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interfaz;

import javax.swing.JOptionPane;

/**
 *
 * @author llara11
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    double v[];
    public Principal() {
        initComponents();
        cmbCrear.setEnabled(true);
        cmbLlenaManual.setEnabled(false);
         cmbAutomatico.setEnabled(false);
         cmbMostrar.setEnabled(false);
         cmbBorrar.setEnabled(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtLongitud = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        cmbCrear = new javax.swing.JButton();
        cmbLlenaManual = new javax.swing.JButton();
        cmbAutomatico = new javax.swing.JButton();
        cmbMostrar = new javax.swing.JButton();
        cmbBorrar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtResultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        jLabel1.setText("Manejo De Vectores ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 0, -1, -1));

        jPanel2.setBackground(new java.awt.Color(123, 224, 179));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Iniciales\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 0, 51))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setText("Longitud:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        txtLongitud.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtLongitudKeyTyped(evt);
            }
        });
        jPanel2.add(txtLongitud, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 70, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 160, 70));

        jPanel3.setBackground(new java.awt.Color(124, 226, 183));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 51, 51))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cmbCrear.setBackground(new java.awt.Color(0, 0, 0));
        cmbCrear.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cmbCrear.setForeground(new java.awt.Color(255, 255, 255));
        cmbCrear.setText("Crear");
        cmbCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCrearActionPerformed(evt);
            }
        });
        jPanel3.add(cmbCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        cmbLlenaManual.setBackground(new java.awt.Color(0, 0, 0));
        cmbLlenaManual.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbLlenaManual.setForeground(new java.awt.Color(255, 255, 255));
        cmbLlenaManual.setText("Llenar Manual");
        cmbLlenaManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbLlenaManualActionPerformed(evt);
            }
        });
        jPanel3.add(cmbLlenaManual, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        cmbAutomatico.setBackground(new java.awt.Color(0, 0, 0));
        cmbAutomatico.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbAutomatico.setForeground(new java.awt.Color(255, 255, 255));
        cmbAutomatico.setText("Llenar Autumatico");
        cmbAutomatico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbAutomaticoActionPerformed(evt);
            }
        });
        jPanel3.add(cmbAutomatico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        cmbMostrar.setBackground(new java.awt.Color(0, 0, 0));
        cmbMostrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbMostrar.setForeground(new java.awt.Color(255, 255, 255));
        cmbMostrar.setText("Mostrar");
        cmbMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbMostrarActionPerformed(evt);
            }
        });
        jPanel3.add(cmbMostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        cmbBorrar.setBackground(new java.awt.Color(0, 0, 0));
        cmbBorrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cmbBorrar.setForeground(new java.awt.Color(255, 255, 255));
        cmbBorrar.setText("Borrar");
        cmbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBorrarActionPerformed(evt);
            }
        });
        jPanel3.add(cmbBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 170, 260));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Resultado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 0, 0))); // NOI18N

        txtResultado.setEditable(false);
        txtResultado.setColumns(20);
        txtResultado.setRows(5);
        jScrollPane1.setViewportView(txtResultado);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 240, 160));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCrearActionPerformed
        int longitud;
        if(txtLongitud.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(this,"Digite La Longitud","Error",JOptionPane.ERROR_MESSAGE);
            txtLongitud.requestFocusInWindow();
        }else if (Integer.parseInt(txtLongitud.getText().trim())==0) {
            JOptionPane.showMessageDialog(this, "La longitud no puede ser cero", "Error", JOptionPane.ERROR_MESSAGE);
            txtLongitud.requestFocusInWindow();
             txtLongitud.selectAll();}
        else{
            longitud=Integer.parseInt(txtLongitud.getText().trim());
            v=new double[longitud];
            JOptionPane.showMessageDialog(this, "Vector Creado Exitosamente");
        }
        cmbCrear.setEnabled(false);
        cmbLlenaManual.setEnabled(true);
         cmbAutomatico.setEnabled(true);
         cmbMostrar.setEnabled(false);
         cmbBorrar.setEnabled(true);
        txtLongitud.setEditable(false);
        
    }//GEN-LAST:event_cmbCrearActionPerformed

    private void txtLongitudKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLongitudKeyTyped
       char c=evt.getKeyChar(); 

           if(!Character.isDigit(c)) { 
               getToolkit().beep(); 
               evt.consume();}
           
    }//GEN-LAST:event_txtLongitudKeyTyped

    private void cmbLlenaManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbLlenaManualActionPerformed
        double n;
        int sw;
        for (int i=0;i<v.length;i++){
          do {
                 sw=1;
                 try {
                     n = Double.parseDouble(JOptionPane.showInputDialog(this, "Digite el elmento en la posición " + i));
                     v[i] = n;
                 } catch (NumberFormatException e) {
                     JOptionPane.showMessageDialog(this, "Digite un número válido","Error",JOptionPane.ERROR_MESSAGE);
                     sw=0;
                 } catch (NullPointerException e) {
                     JOptionPane.showMessageDialog(this, "No puedes salir","Error",JOptionPane.ERROR_MESSAGE);
                     sw=0;
                 }
             } while (sw==0);
        }
        
    cmbCrear.setEnabled(false);
        cmbLlenaManual.setEnabled(false);
         cmbAutomatico.setEnabled(false);
         cmbMostrar.setEnabled(true);
         cmbBorrar.setEnabled(true);
    }//GEN-LAST:event_cmbLlenaManualActionPerformed

    private void cmbMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbMostrarActionPerformed
        for (int i = 0; i < v.length; i++) {
         txtResultado.append(v[i]+" \n ");
        
        }
        cmbCrear.setEnabled(false);
        cmbLlenaManual.setEnabled(false);
         cmbAutomatico.setEnabled(false);
         cmbMostrar.setEnabled(false);
         cmbBorrar.setEnabled(true);
    }//GEN-LAST:event_cmbMostrarActionPerformed

    private void cmbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBorrarActionPerformed
       txtLongitud.setText("");
       txtResultado.setText("");
       v=null;
       txtLongitud.requestFocusInWindow();
       
      cmbCrear.setEnabled(true);
        cmbLlenaManual.setEnabled(false);
         cmbAutomatico.setEnabled(false);
         cmbMostrar.setEnabled(false);
         cmbBorrar.setEnabled(true);
         txtLongitud.setEditable(true);
    }//GEN-LAST:event_cmbBorrarActionPerformed

    private void cmbAutomaticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbAutomaticoActionPerformed
        double n;
        for (int i = 0; i < v.length; i++) {
        n= (int)(Math.random()*50+1);
        v[i]=n;
         }
        JOptionPane.showMessageDialog(this, "Vector Creado Exitosamente");
        cmbCrear.setEnabled(false);
        cmbLlenaManual.setEnabled(false);
         cmbAutomatico.setEnabled(false);
         cmbMostrar.setEnabled(true);
         cmbBorrar.setEnabled(true);
    }//GEN-LAST:event_cmbAutomaticoActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmbAutomatico;
    private javax.swing.JButton cmbBorrar;
    private javax.swing.JButton cmbCrear;
    private javax.swing.JButton cmbLlenaManual;
    private javax.swing.JButton cmbMostrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtLongitud;
    private javax.swing.JTextArea txtResultado;
    // End of variables declaration//GEN-END:variables
}
