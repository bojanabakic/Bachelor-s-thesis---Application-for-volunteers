/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forme.zaduzenje;

import domen.Korisnik;
import domen.Volonter;
import domen.Zadatak;
import domen.Zaduzenje;
import forme.GlavnaForma;
import forme.zadatak.UnosZadatkaDijalog;
import java.awt.Font;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import klijentKontroler.KlijentKontroler;
import modeli.ModelTabeleZadatak;
import transfer.ServerskiTransferObjekat;

/**
 *
 * @author CJ931WT
 */
public class PregledZaduzenjaForma extends javax.swing.JFrame {
    SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
    Korisnik korisnik;
    Zaduzenje zaduzenje;
    ModelTabeleZadatak mtz;
    GlavnaForma gf;
    
    /**
     * Creates new form PregledZaduzenjaForma
     */
    public PregledZaduzenjaForma() {
        initComponents();
        popuniKombo();
        centriraj();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableZadatak = new javax.swing.JTable();
        btnOtkazi = new javax.swing.JButton();
        btnUnesiZad = new javax.swing.JButton();
        btnIzmjeniZad = new javax.swing.JButton();
        btnObrisiZad = new javax.swing.JButton();
        dateChoserDatum = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmbVolonter = new javax.swing.JComboBox();
        btnIzmjeniZaduzenje = new javax.swing.JButton();
        radioNijeKompletirano = new javax.swing.JRadioButton();
        radioKompletirano = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pregled zaduženja");

        tableZadatak.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tableZadatak);

        btnOtkazi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/cancel.png"))); // NOI18N
        btnOtkazi.setText("Otkaži izmjenu");
        btnOtkazi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtkaziActionPerformed(evt);
            }
        });

        btnUnesiZad.setText("Dodaj zadatak");
        btnUnesiZad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnesiZadActionPerformed(evt);
            }
        });

        btnIzmjeniZad.setText("Izmjeni zadatak");
        btnIzmjeniZad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzmjeniZadActionPerformed(evt);
            }
        });

        btnObrisiZad.setText("Obriši zadatak");
        btnObrisiZad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObrisiZadActionPerformed(evt);
            }
        });

        jLabel1.setText("Volonter");

        jLabel2.setText("Datum:");

        jLabel3.setText("Status:");

        cmbVolonter.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbVolonter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbVolonterActionPerformed(evt);
            }
        });

        btnIzmjeniZaduzenje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slike/change.png"))); // NOI18N
        btnIzmjeniZaduzenje.setText("Izmjeni zaduženje");
        btnIzmjeniZaduzenje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzmjeniZaduzenjeActionPerformed(evt);
            }
        });

        buttonGroup1.add(radioNijeKompletirano);
        radioNijeKompletirano.setText("Nije kompletirano");

        buttonGroup1.add(radioKompletirano);
        radioKompletirano.setText("Kompletirano");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateChoserDatum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbVolonter, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnOtkazi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnIzmjeniZaduzenje))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(23, 23, 23)
                        .addComponent(radioKompletirano)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnObrisiZad)
                                .addGap(18, 18, 18)
                                .addComponent(btnIzmjeniZad)
                                .addGap(18, 18, 18)
                                .addComponent(btnUnesiZad, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(radioNijeKompletirano)
                                .addGap(0, 264, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbVolonter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(dateChoserDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radioKompletirano)
                        .addComponent(radioNijeKompletirano)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUnesiZad)
                    .addComponent(btnIzmjeniZad)
                    .addComponent(btnObrisiZad))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOtkazi)
                    .addComponent(btnIzmjeniZaduzenje))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void btnOtkaziActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtkaziActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnOtkaziActionPerformed

    private void btnUnesiZadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnesiZadActionPerformed
        UnosZadatkaDijalog dijalog = new UnosZadatkaDijalog(this, true);
        dijalog.setMtz(mtz);
        dijalog.srediZaUnos();
        dijalog.pack();
        dijalog.setVisible(true);
    }//GEN-LAST:event_btnUnesiZadActionPerformed

    private void btnIzmjeniZadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzmjeniZadActionPerformed
        int red = tableZadatak.getSelectedRow();

        if (red != -1) {
            ModelTabeleZadatak mtz = (ModelTabeleZadatak) tableZadatak.getModel();
            Zadatak z = mtz.vratiZadatak(red);

            UnosZadatkaDijalog dijalog = new UnosZadatkaDijalog(this, true);
            dijalog.dodajZadatak(z);
            dijalog.setMtz(mtz);
            dijalog.srediZaIzmjenu();
            dijalog.pack();
            dijalog.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Potrebno je selektovati zaduženje u tabeli koje želite da izmjenite");
            return;
        }
    }//GEN-LAST:event_btnIzmjeniZadActionPerformed

    private void btnObrisiZadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObrisiZadActionPerformed
        int red = tableZadatak.getSelectedRow();

        if (red != -1) {
            ModelTabeleZadatak mtz = (ModelTabeleZadatak) tableZadatak.getModel();
            mtz.izbrisiZadatak(red);
        } else {
            JOptionPane.showMessageDialog(this, "Potrebno je selektovati zaduženje u tabeli koju želite da obrišete");
            return;
        }
    }//GEN-LAST:event_btnObrisiZadActionPerformed

    private void btnIzmjeniZaduzenjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzmjeniZaduzenjeActionPerformed
        Date datum = new Date();
        if (dateChoserDatum.getCalendar() != null) {
            datum = dateChoserDatum.getCalendar().getTime();
        } else {
            JOptionPane.showMessageDialog(this, "Sva polja su obavezna");
            return;
        }

        Volonter volonter = (Volonter) cmbVolonter.getSelectedItem();

        int id = zaduzenje.getZaduzenjeID();
        boolean provjera = provjeriVolontera(id, volonter, datum);
        if (!provjera) {
            JOptionPane.showMessageDialog(this, "Dnevno je moguće zadati volonteru " + volonter.getIme() + " " + volonter.getPrezime() + " jedno zaduženje");
            return;
        }
        
        boolean status = false;
        if (radioKompletirano.isSelected()) {
            status = true;
        }

        Korisnik k = KlijentKontroler.getInstance().getTrenutnoUlogovanKorisnik();
        mtz = (ModelTabeleZadatak) tableZadatak.getModel();
        ArrayList<Zadatak> zadaci = mtz.getLista();
        
        Zaduzenje z = new Zaduzenje(zaduzenje.getZaduzenjeID(), status, datum, volonter, k, zadaci, 0);
        
        for (Zadatak zadatak : zadaci) {
            zadatak.setZaduzenje(z);
        }
        
        ServerskiTransferObjekat sto = KlijentKontroler.getInstance().izmjeniZaduzenje(z);
        JOptionPane.showMessageDialog(this, sto.getPoruka(), "Informacija", JOptionPane.INFORMATION_MESSAGE);
        
        dateChoserDatum.setDate(new Date());
        cmbVolonter.setSelectedIndex(0);
        dispose();
        gf.srediModel();
    }//GEN-LAST:event_btnIzmjeniZaduzenjeActionPerformed

    private void cmbVolonterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbVolonterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbVolonterActionPerformed

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
            java.util.logging.Logger.getLogger(PregledZaduzenjaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PregledZaduzenjaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PregledZaduzenjaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PregledZaduzenjaForma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PregledZaduzenjaForma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIzmjeniZad;
    private javax.swing.JButton btnIzmjeniZaduzenje;
    private javax.swing.JButton btnObrisiZad;
    private javax.swing.JButton btnOtkazi;
    private javax.swing.JButton btnUnesiZad;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox cmbVolonter;
    private com.toedter.calendar.JDateChooser dateChoserDatum;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radioKompletirano;
    private javax.swing.JRadioButton radioNijeKompletirano;
    private javax.swing.JTable tableZadatak;
    // End of variables declaration//GEN-END:variables
    
    public void srediTabelu() {
        ArrayList<Zadatak> lista = zaduzenje == null ? new ArrayList<>() : zaduzenje.getListaZadataka();
        if(!lista.isEmpty()){
            for (Zadatak zad : lista) {
                zad.setStatus(new String());
            }
        }
        mtz = new ModelTabeleZadatak(lista);

        tableZadatak.setFont(new Font("Arial", Font.PLAIN, 14));
        tableZadatak.getTableHeader().setFont(new Font("Arial", Font.PLAIN, 14));
        tableZadatak.setModel(mtz);
    }

    private void centriraj() {
        this.setLocationRelativeTo(null);
    }

    private void popuniKombo() {
        ArrayList<Volonter> lista = KlijentKontroler.getInstance().vratiSveVolontere();
        cmbVolonter.removeAllItems();
        for (Volonter volonter : lista) {
            cmbVolonter.addItem(volonter);
        }
    }

    public void dodajKorisnika(Korisnik trenutnoUlogovanKorisnik) {
        korisnik = trenutnoUlogovanKorisnik;
    }

    public void dodajZaduzenje(Zaduzenje z) {
        zaduzenje = z;
        cmbVolonter.setSelectedItem(zaduzenje.getVolonter());
        dateChoserDatum.setDate(zaduzenje.getDatum());
        
        boolean status = true;
        if (zaduzenje.isStatusZaduzenja()) {
            radioKompletirano.setSelected(status);
        } else {
            radioNijeKompletirano.setSelected(status);
        }
    }

    private boolean provjeriVolontera(int id, Volonter volonter, Date datum) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
        ArrayList<Zaduzenje> lista = KlijentKontroler.getInstance().vratiSvaZaduzenja();

        for (Zaduzenje z : lista) {
            Date dat = null;
            try {
                dat = sdf.parse(sdf.format(z.getDatum()));
            } catch (ParseException ex) {
                Logger.getLogger(IzmjeniZaduzenjeDijalog.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (dat.equals(datum) && z.getVolonter().getVolonterID() == volonter.getVolonterID() && id != z.getZaduzenjeID()) {
                return false;
            }
        }
        return true;
    }

    public void dodajGF(GlavnaForma glavnaForma) {
        gf = glavnaForma;
    }

}
