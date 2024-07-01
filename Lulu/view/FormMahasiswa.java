/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lulu.view;

import javax.swing.JComboBox;
import javax.swing.JTextField;
import Lulu.controller.MahasiswaControllerDb;
import javax.swing.JTable;

/**
 * 
 *
 * @author ASUS
 */
public class FormMahasiswa extends javax.swing.JFrame {

    /**
     * Creates new form FormAnggota : Generate
     */
    MahasiswaControllerDb controller;
    public FormMahasiswa() {
        initComponents();
        controller = new MahasiswaControllerDb(this);
        controller.cancel();
        controller.viewData();
    }

    public JComboBox<String> getCboJenisKelamin() {
        return cboJenisKelamin;
    }

    public JTextField getTxtAlamat() {
        return txtAlamat;
    }

    public JTextField getTxtNama() {
        return txtNama;
    }

    public JTextField getTxtNobp() {
        return txtNobp;
    }

    public JTextField getTxtTanggalLahir() {
        return txtTanggalLahir;
    }

    public JTable getTabelMahasiswa() {
        return tabelMahasiswa;
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
        txtNobp = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtAlamat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cboJenisKelamin = new javax.swing.JComboBox<>();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtTanggalLahir = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelMahasiswa = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("No BP");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 20, 130, 16);

        jLabel2.setText("Nama");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 60, 60, 16);

        jLabel3.setText("Alamat");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 100, 38, 16);

        txtNobp.setText("jTextField1");
        getContentPane().add(txtNobp);
        txtNobp.setBounds(120, 20, 410, 30);

        txtNama.setText("jTextField2");
        getContentPane().add(txtNama);
        txtNama.setBounds(120, 60, 410, 30);

        txtAlamat.setText("jTextField3");
        getContentPane().add(txtAlamat);
        txtAlamat.setBounds(120, 100, 410, 30);

        jLabel4.setText("Jenis Kelamin");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 140, 90, 16);

        cboJenisKelamin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki-laki", "Perempuan" }));
        getContentPane().add(cboJenisKelamin);
        cboJenisKelamin.setBounds(120, 140, 160, 30);

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        getContentPane().add(btnInsert);
        btnInsert.setBounds(20, 230, 80, 30);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(110, 230, 90, 30);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btnDelete);
        btnDelete.setBounds(210, 230, 90, 30);

        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancel);
        btnCancel.setBounds(310, 230, 90, 30);

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(410, 230, 100, 30);

        jLabel5.setText("Tanggal Lahir");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 180, 90, 16);

        txtTanggalLahir.setText("jTextField1");
        getContentPane().add(txtTanggalLahir);
        txtTanggalLahir.setBounds(120, 180, 160, 30);

        tabelMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "No BP", "Nama", "Alamat", "Jekel", "Tgl Lahir"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabelMahasiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMahasiswaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelMahasiswa);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(20, 280, 550, 290);

        setSize(new java.awt.Dimension(611, 632));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        controller.insert();
        controller.viewData();
        controller.cancel();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        controller.update();
        controller.viewData();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        controller.delete();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void tabelMahasiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMahasiswaMouseClicked
        // TODO add your handling code here:
        controller.actionClickTabel();
    }//GEN-LAST:event_tabelMahasiswaMouseClicked

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
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMahasiswa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cboJenisKelamin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelMahasiswa;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNobp;
    private javax.swing.JTextField txtTanggalLahir;
    // End of variables declaration//GEN-END:variables
}
