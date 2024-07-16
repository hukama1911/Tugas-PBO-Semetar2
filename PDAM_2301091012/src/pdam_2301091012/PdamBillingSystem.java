/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pdam_2301091012;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author WINDOWS
 */
public class PdamBillingSystem extends javax.swing.JFrame {

    /**
     * Creates new form PdamBillingSystem
     */
    public PdamBillingSystem() {
        initComponents();
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculateBill();
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanelPDAM = new javax.swing.JPanel();
        JLabelPDAM = new javax.swing.JLabel();
        kodePembayaranField = new javax.swing.JTextField();
        namaPelangganField = new javax.swing.JTextField();
        tanggalField = new javax.swing.JTextField();
        meterBulanLaluField = new javax.swing.JTextField();
        meterBulanIniField = new javax.swing.JTextField();
        kodePembayaranLabel = new javax.swing.JLabel();
        namaPelangganLabel = new javax.swing.JLabel();
        jenisPelangganLabel = new javax.swing.JLabel();
        tanggalLabel = new javax.swing.JLabel();
        meterBulanIniLabel = new javax.swing.JLabel();
        meterBulanLaluLabel = new javax.swing.JLabel();
        totalBayarLabel = new javax.swing.JLabel();
        totalBayarField = new javax.swing.JTextField();
        calculateButton = new javax.swing.JButton();
        jenisPelangganComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JLabelPDAM.setText("Pembayaran PDAM");
        JLabelPDAM.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        kodePembayaranLabel.setText("Kode Pembayaran");

        namaPelangganLabel.setText("Nama Pelanggan");

        jenisPelangganLabel.setText("Jenis Pelanggan");

        tanggalLabel.setText("Tanggal");

        meterBulanIniLabel.setText("Meter Bulan Ini");

        meterBulanLaluLabel.setText("Meter Bulan Lalu");

        totalBayarLabel.setText("Total Bayar");

        totalBayarField.setEnabled(false);

        calculateButton.setText("Calculate");

        jenisPelangganComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GOLD", "SILVER", "UMUM" }));

        javax.swing.GroupLayout JPanelPDAMLayout = new javax.swing.GroupLayout(JPanelPDAM);
        JPanelPDAM.setLayout(JPanelPDAMLayout);
        JPanelPDAMLayout.setHorizontalGroup(
            JPanelPDAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelPDAMLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(JLabelPDAM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(80, 80, 80))
            .addGroup(JPanelPDAMLayout.createSequentialGroup()
                .addGroup(JPanelPDAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelPDAMLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(JPanelPDAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jenisPelangganLabel)
                            .addComponent(kodePembayaranLabel)
                            .addComponent(kodePembayaranField)
                            .addComponent(namaPelangganLabel)
                            .addComponent(namaPelangganField, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(totalBayarField, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(totalBayarLabel)
                            .addComponent(tanggalLabel)
                            .addComponent(tanggalField, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(jenisPelangganComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(JPanelPDAMLayout.createSequentialGroup()
                                .addGroup(JPanelPDAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(meterBulanLaluLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(meterBulanLaluField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(JPanelPDAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(JPanelPDAMLayout.createSequentialGroup()
                                        .addComponent(meterBulanIniLabel)
                                        .addGap(13, 13, 13))
                                    .addComponent(meterBulanIniField)))))
                    .addGroup(JPanelPDAMLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(calculateButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPanelPDAMLayout.setVerticalGroup(
            JPanelPDAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelPDAMLayout.createSequentialGroup()
                .addComponent(JLabelPDAM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kodePembayaranLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kodePembayaranField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(namaPelangganLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(namaPelangganField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jenisPelangganLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jenisPelangganComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tanggalLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tanggalField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPanelPDAMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelPDAMLayout.createSequentialGroup()
                        .addComponent(meterBulanLaluLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(meterBulanLaluField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanelPDAMLayout.createSequentialGroup()
                        .addComponent(meterBulanIniLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(meterBulanIniField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(totalBayarLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalBayarField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(calculateButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JPanelPDAM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JPanelPDAM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void calculateBill() {
        try {
            int meterBulanIni = Integer.parseInt(meterBulanIniField.getText());
            int meterBulanLalu = Integer.parseInt(meterBulanLaluField.getText());
            String jenisPelanggan = (String) jenisPelangganComboBox.getSelectedItem();
            
            int meterPakai = meterBulanIni - meterBulanLalu;
            int totalBayar = 0;

            if (meterPakai <= 10) {
                totalBayar = meterPakai * getBiayaPerMeter(jenisPelanggan, 1);
            } else if (meterPakai <= 20) {
                totalBayar = (10 * getBiayaPerMeter(jenisPelanggan, 1)) + 
                             ((meterPakai - 10) * getBiayaPerMeter(jenisPelanggan, 11));
            } else {
                totalBayar = (10 * getBiayaPerMeter(jenisPelanggan, 1)) + 
                             (10 * getBiayaPerMeter(jenisPelanggan, 11)) + 
                             ((meterPakai - 20) * getBiayaPerMeter(jenisPelanggan, 21));
            }

            totalBayarField.setText(String.valueOf(totalBayar));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Please enter valid numbers for meter readings.");
        }
    }

    private int getBiayaPerMeter(String jenisPelanggan, int range) {
        if (jenisPelanggan.equalsIgnoreCase("GOLD")) {
            if (range == 1) return 5000;
            else if (range == 11) return 10000;
            else if (range == 21) return 20000;
        } else if (jenisPelanggan.equalsIgnoreCase("SILVER")) {
            if (range == 1) return 4000;
            else if (range == 11) return 8000;
            else if (range == 21) return 10000;
        } else if (jenisPelanggan.equalsIgnoreCase("UMUM")) {
            if (range == 1) return 2000;
            else if (range == 11) return 3000;
            else if (range == 21) return 5000;
        }
        return 0;
    }
    
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
            java.util.logging.Logger.getLogger(PdamBillingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PdamBillingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PdamBillingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PdamBillingSystem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PdamBillingSystem().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelPDAM;
    private javax.swing.JPanel JPanelPDAM;
    private javax.swing.JButton calculateButton;
    private javax.swing.JComboBox<String> jenisPelangganComboBox;
    private javax.swing.JLabel jenisPelangganLabel;
    private javax.swing.JTextField kodePembayaranField;
    private javax.swing.JLabel kodePembayaranLabel;
    private javax.swing.JTextField meterBulanIniField;
    private javax.swing.JLabel meterBulanIniLabel;
    private javax.swing.JTextField meterBulanLaluField;
    private javax.swing.JLabel meterBulanLaluLabel;
    private javax.swing.JTextField namaPelangganField;
    private javax.swing.JLabel namaPelangganLabel;
    private javax.swing.JTextField tanggalField;
    private javax.swing.JLabel tanggalLabel;
    private javax.swing.JTextField totalBayarField;
    private javax.swing.JLabel totalBayarLabel;
    // End of variables declaration//GEN-END:variables
}
