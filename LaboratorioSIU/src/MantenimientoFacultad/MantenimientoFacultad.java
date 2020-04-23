/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MantenimientoFacultad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Diana
 */
public class MantenimientoFacultad extends javax.swing.JFrame {

    /**
     * Creates new form MantenimientoFacultad
     */
    public MantenimientoFacultad() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtcodigo = new javax.swing.JTextField();
        txtnombrefacultad = new javax.swing.JTextField();
        txtestado = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        MODIFICAR = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        Label_status = new javax.swing.JLabel();
        label_status = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("MANTENIMIENTO FACULTAD");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 25, -1, -1));

        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(56, 72, -1, -1));

        jLabel3.setText("Codigo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 112, -1, -1));

        jLabel4.setText("Nombre de Facultad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 161, -1, -1));

        jLabel5.setText("Estado");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(47, 204, -1, -1));
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 69, 93, -1));
        getContentPane().add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 112, 93, -1));
        getContentPane().add(txtnombrefacultad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 161, 93, -1));
        getContentPane().add(txtestado, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 199, 93, -1));

        jButton1.setText("REGISTRAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 68, -1, -1));

        MODIFICAR.setText("MODIFICAR");
        MODIFICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MODIFICARActionPerformed(evt);
            }
        });
        getContentPane().add(MODIFICAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 120, -1, -1));

        jButton3.setText("ELIMINAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 171, 90, -1));

        jButton4.setText("BUSCAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 269, -1, -1));
        getContentPane().add(Label_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(429, 261, -1, -1));

        label_status.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        getContentPane().add(label_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conectar = DriverManager.getConnection("jdbc:mysql://localhost/LaboratorySIU4","root","");

            Connection cn= DriverManager.getConnection("jdbc:mysql://localhost/LaboratorySIU4","root","");
            java.sql.PreparedStatement pst = cn.prepareStatement("insert into facultad4 values(?,?,?,?)");

            pst.setString(1, "0");
            pst.setString(2, txtcodigo.getText().trim());
            pst.setString(3, txtnombrefacultad.getText().trim());   
            pst.setString(4, txtestado.getText().trim());
           

            pst.executeUpdate();

            
            txtcodigo.setText("");
            txtnombrefacultad.setText("");
            txtestado.setText(""); 
            

            label_status.setText("Registro exitoso");

        } catch (Exception e) {

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void MODIFICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MODIFICARActionPerformed
        // TODO add your handling code here:
        
        try {
            String ID = txtid.getText().trim();

            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/LaboratorySIU4", "root", "");
            PreparedStatement pst = cn.prepareStatement("update facultad4 set Codigo_Facultad=?, nombreFacultad=?, Estado_Facultad=? where ID = " + ID);

            
            pst.setString(1, txtcodigo.getText().trim());
            pst.setString(2, txtnombrefacultad.getText().trim());
            pst.setString(3, txtestado.getText().trim());
           
            pst.executeUpdate();

            label_status.setText("Modificación exitosa.");

        } catch (Exception e) {
        }
        
        
        
        
    }//GEN-LAST:event_MODIFICARActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/LaboratorySIU4", "root", "");
            PreparedStatement pst = cn.prepareStatement("delete from facultad4 where ID = ?");

            pst.setString(1, txtid.getText().trim());
            pst.executeUpdate();
            
            txtcodigo.setText("");
            txtnombrefacultad.setText("");
            txtestado.setText("");
            
            

            label_status.setText("Registro eliminado.");

        } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        try{
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/LaboratorySIU4", "root", "");
            PreparedStatement pst = cn.prepareStatement("select * from facultad4 where ID = ?");
            pst.setString(1, txtid.getText().trim());

            ResultSet rs = pst.executeQuery();

            if(rs.next()){
                
                txtcodigo.setText(rs.getString("Codigo_Facultad"));
                txtnombrefacultad.setText(rs.getString("nombreFacultad"));
                txtestado.setText(rs.getString("Estado_Facultad"));
                
               

            } else {
                JOptionPane.showMessageDialog(null, "Persona no registrada.");
            }

        }catch (Exception e){

    }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(MantenimientoFacultad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MantenimientoFacultad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MantenimientoFacultad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MantenimientoFacultad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MantenimientoFacultad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label_status;
    private javax.swing.JButton MODIFICAR;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel label_status;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtestado;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombrefacultad;
    // End of variables declaration//GEN-END:variables
}
