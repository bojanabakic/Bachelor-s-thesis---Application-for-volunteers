/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme.macka;

import domen.Macka;
import domen.Rasa;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import klijentKontroler.KlijentKontroler;
import transfer.ServerskiTransferObjekat;

/**
 *
 * @author CJ931WT
 */
public class UnesiMackuForma extends javax.swing.JFrame {

    /**
     * Creates new form UnesiMackuForma
     */
    public UnesiMackuForma() {
        initComponents();
        srediKombo();
        srediFormu();
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
        txtImeMacke = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtStarost = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        radioZenski = new javax.swing.JRadioButton();
        radioMuski = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        cmbRasa = new javax.swing.JComboBox();
        btnUnesi = new javax.swing.JButton();
        btnOtkazi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Unos mačke");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText("Ime mačke:");

        jLabel2.setText("Starost (godine):");

        jLabel3.setText("Pol:");

        radioZenski.setText("Ženski");
        radioZenski.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioZenskiActionPerformed(evt);
            }
        });

        radioMuski.setText("Muški");

        jLabel4.setText("Rasa:");

        cmbRasa.setMaximumRowCount(10);
        cmbRasa.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnUnesi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/save.png"))); // NOI18N
        btnUnesi.setText("Unesi mačku");
        btnUnesi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnesiActionPerformed(evt);
            }
        });

        btnOtkazi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/cancel.png"))); // NOI18N
        btnOtkazi.setText("Otkaži unos");
        btnOtkazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtkaziActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(radioZenski)
                        .addGap(18, 18, 18)
                        .addComponent(radioMuski)
                        .addGap(0, 127, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtImeMacke)
                            .addComponent(txtStarost)
                            .addComponent(cmbRasa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnOtkazi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUnesi)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtImeMacke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtStarost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(radioZenski)
                    .addComponent(radioMuski))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbRasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUnesi)
                    .addComponent(btnOtkazi))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void radioZenskiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioZenskiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioZenskiActionPerformed

    private void btnUnesiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnesiActionPerformed
        if (txtImeMacke.getText().isEmpty() || txtStarost.getText().isEmpty() || (!radioMuski.isSelected() && !radioZenski.isSelected())) {
            JOptionPane.showMessageDialog(this, "Sva polja su obavezna", "Informacija", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        String imeMacke = txtImeMacke.getText().trim();

        boolean format = provjeriFormat(imeMacke);
        if (!format) {
            JOptionPane.showMessageDialog(this, "Ime mačke se sastoji samo od slova i razmaka, ispraviti unijeto ime", "Informacija", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        boolean pol = false;
        Rasa r = (Rasa) cmbRasa.getSelectedItem();
        int starost = Integer.parseInt(txtStarost.getText().trim());

        if (radioZenski.isSelected()) {
            pol = true;
        }

        if (starost <= 0) {
            JOptionPane.showMessageDialog(this, "Unijeti validnu vrijednost za starost mačke", "Informacija", JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        Macka m = new Macka(0, imeMacke, starost, pol, r, new String());
        ServerskiTransferObjekat sto = KlijentKontroler.getInstance().sacuvajMacka(m);

        JOptionPane.showMessageDialog(this, sto.getPoruka(), "Informacija", JOptionPane.INFORMATION_MESSAGE);

        txtImeMacke.setText("");
        txtStarost.setText("");

        ButtonGroup bgroup = new ButtonGroup();
        bgroup.add(radioMuski);
        bgroup.add(radioZenski);
        bgroup.clearSelection();

        cmbRasa.setSelectedIndex(0);
    }//GEN-LAST:event_btnUnesiActionPerformed

    private void btnOtkaziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtkaziActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnOtkaziActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.setVisible(false);
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.setVisible(false);
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(UnesiMackuForma.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UnesiMackuForma.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UnesiMackuForma.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UnesiMackuForma.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UnesiMackuForma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOtkazi;
    private javax.swing.JButton btnUnesi;
    private javax.swing.JComboBox cmbRasa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton radioMuski;
    private javax.swing.JRadioButton radioZenski;
    private javax.swing.JTextField txtImeMacke;
    private javax.swing.JTextField txtStarost;
    // End of variables declaration//GEN-END:variables

    private void srediFormu() {
        this.setLocationRelativeTo(null);
    }

    private void srediKombo() {
        ArrayList<Rasa> listaRasa = KlijentKontroler.getInstance().vratiRase();

        cmbRasa.removeAllItems();
        for (Rasa r : listaRasa) {
            cmbRasa.addItem(r);
        }
    }

    private boolean provjeriFormat(String imeMacke) {
        for (int i = 0; i < imeMacke.length(); i++) {
            char c = imeMacke.charAt(i);
            if (Character.isLetter(c) || c == ' ') {
                continue;
            }
            return false;
        }
        return true;
    }
}