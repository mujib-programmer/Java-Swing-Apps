/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mujib.gui;

import com.mujib.MainApps;
import com.mujib.entity.Paket;
import com.mujib.entity.PaketManajer;
import com.mujib.entity.Pembayaran;
import com.mujib.entity.PembayaranManajer;
import com.mujib.entity.Pesanan;
import com.mujib.entity.PesananManajer;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author mujibur
 */
public class FormPesanan extends javax.swing.JFrame {
    
    private MainApps apps;
    private PaketManajer paketManajer;
    private PesananManajer pesananManajer;

    DefaultTableModel daftarPesananTableModel;
    int idPesananTerpilih = 0;
        
    /**
     * Creates new form FormPesanan
     */
    public FormPesanan() {
        initComponents();
        buildAllPaketComboBox();
        
        try {
            populateDaftarPesananJTable();
        } catch (SQLException ex) {
            Logger.getLogger(FormPesanan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        paketMakanJComboBox = new javax.swing.JComboBox();
        paketMinumJComboBox = new javax.swing.JComboBox();
        paketTambahanJComboBox = new javax.swing.JComboBox();
        hargaPaketMakanJTextField = new javax.swing.JTextField();
        hargaPaketMinumJTextField = new javax.swing.JTextField();
        hargaPaketTambahanJTextField = new javax.swing.JTextField();
        jmlBeliPaketMakanJTextField = new javax.swing.JTextField();
        jmlBeliPaketMinumJTextField = new javax.swing.JTextField();
        jmlBeliPaketTambahanJTextField = new javax.swing.JTextField();
        bayarPaketMakanJTextField = new javax.swing.JTextField();
        bayarPaketMinumJTextField = new javax.swing.JTextField();
        bayarPaketTambahanJTextField = new javax.swing.JTextField();
        noMejaJTextField = new javax.swing.JTextField();
        hapusJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        totalPesananJTextField = new javax.swing.JTextField();
        simpanJButton = new javax.swing.JButton();
        infoJLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        daftarPesananJTable = new javax.swing.JTable();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        closeJMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        pesananJMenuItem = new javax.swing.JMenuItem();
        pembayaranJMenuItem = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("PESANAN");

        jLabel2.setText("NO MEJA");

        paketMakanJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Paket 1--" }));
        paketMakanJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paketMakanJComboBoxActionPerformed(evt);
            }
        });

        paketMinumJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Paket 2--" }));
        paketMinumJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paketMinumJComboBoxActionPerformed(evt);
            }
        });

        paketTambahanJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Paket 3--" }));
        paketTambahanJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paketTambahanJComboBoxActionPerformed(evt);
            }
        });

        hargaPaketMinumJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hargaPaketMinumJTextFieldActionPerformed(evt);
            }
        });

        jmlBeliPaketMakanJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmlBeliPaketMakanJTextFieldActionPerformed(evt);
            }
        });

        jmlBeliPaketMinumJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmlBeliPaketMinumJTextFieldActionPerformed(evt);
            }
        });

        jmlBeliPaketTambahanJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmlBeliPaketTambahanJTextFieldActionPerformed(evt);
            }
        });

        bayarPaketMakanJTextField.setText("0");

        bayarPaketMinumJTextField.setText("0");

        bayarPaketTambahanJTextField.setText("0");

        hapusJButton.setText("HAPUS");
        hapusJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusJButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("HARGA");

        jLabel4.setText("JML. BELI");

        jLabel5.setText("BAYAR");

        jLabel6.setText("TOTAL PESANAN");

        totalPesananJTextField.setText("0");

        simpanJButton.setText("SIMPAN");
        simpanJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanJButtonActionPerformed(evt);
            }
        });

        daftarPesananJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jScrollPane2.setViewportView(daftarPesananJTable);

        jMenu1.setText("File");

        closeJMenuItem.setText("Close");
        closeJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeJMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(closeJMenuItem);

        jMenuBar2.add(jMenu1);

        jMenu2.setText("Transaksi");

        pesananJMenuItem.setText("Pesanan");
        pesananJMenuItem.setEnabled(false);
        jMenu2.add(pesananJMenuItem);

        pembayaranJMenuItem.setText("Pembayaran");
        pembayaranJMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pembayaranJMenuItemActionPerformed(evt);
            }
        });
        jMenu2.add(pembayaranJMenuItem);

        jMenuBar2.add(jMenu2);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(paketMakanJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(hargaPaketMakanJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jmlBeliPaketMakanJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addComponent(jLabel3)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(bayarPaketMakanJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(noMejaJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(infoJLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(paketTambahanJComboBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paketMinumJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(hargaPaketMinumJTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(hargaPaketTambahanJTextField))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jmlBeliPaketMinumJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(bayarPaketMinumJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jmlBeliPaketTambahanJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(hapusJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(simpanJButton, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                            .addComponent(totalPesananJTextField)
                                            .addComponent(bayarPaketTambahanJTextField))))))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(infoJLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(noMejaJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(paketMakanJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hargaPaketMakanJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jmlBeliPaketMakanJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bayarPaketMakanJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(paketMinumJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hargaPaketMinumJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jmlBeliPaketMinumJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bayarPaketMinumJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(paketTambahanJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(hargaPaketTambahanJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jmlBeliPaketTambahanJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bayarPaketTambahanJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(totalPesananJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(simpanJButton)
                .addGap(18, 18, 18)
                .addComponent(hapusJButton)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmlBeliPaketMinumJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmlBeliPaketMinumJTextFieldActionPerformed
        // TODO add your handling code here:
        int jmlBeliPaketMinum = Integer.parseInt(jmlBeliPaketMinumJTextField.getText());
        int bayarPaketMinum = jmlBeliPaketMinum * (Integer.parseInt(hargaPaketMinumJTextField.getText()));
        bayarPaketMinumJTextField.setText( Integer.toString(bayarPaketMinum) );
        
        setTotalPesanan();
    }//GEN-LAST:event_jmlBeliPaketMinumJTextFieldActionPerformed

    private void hargaPaketMinumJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hargaPaketMinumJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hargaPaketMinumJTextFieldActionPerformed

    private void hapusJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusJButtonActionPerformed
        // TODO add your handling code here:
        if (idPesananTerpilih == 0) {
            infoJLabel.setText("Pilih pesanan pada tabel yang ingin dihapus!");
            infoJLabel.setForeground(Color.red);
        } else {
            
            //System.out.println("idPesananTerpilih : " + idPesananTerpilih);
            
            boolean hapusPesananSukses = false;
            
            try {
                hapusPesananSukses = this.pesananManajer.hapusPesanan(idPesananTerpilih);
            } catch (SQLException ex) {
                Logger.getLogger(FormPesanan.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            if (hapusPesananSukses) {
                infoJLabel.setText("Data pesanan berhasil dihapus");
                infoJLabel.setForeground(Color.blue);
                
                try {
                    this.populateDaftarPesananJTable();
                } catch (SQLException ex) {
                    Logger.getLogger(FormPesanan.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            } else {
                infoJLabel.setText("Data pesanan gagal dihapus!");
                infoJLabel.setForeground(Color.red);
            }
        }
        
    }//GEN-LAST:event_hapusJButtonActionPerformed

    private void closeJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeJMenuItemActionPerformed
        // TODO add your handling code here:
        this.apps.closeApps();
    }//GEN-LAST:event_closeJMenuItemActionPerformed

    private void pembayaranJMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pembayaranJMenuItemActionPerformed
        // TODO add your handling code here:
        this.apps.showFormPembayaran();
    }//GEN-LAST:event_pembayaranJMenuItemActionPerformed

    private void paketMakanJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paketMakanJComboBoxActionPerformed
        // TODO add your handling code here:
        String paketMakanTerpilih = paketMakanJComboBox.getSelectedItem().toString();
        int harga = paketManajer.getHargaPaketByNamaItemAndCategory(paketMakanTerpilih, 1);
        
        hargaPaketMakanJTextField.setText(Integer.toString(harga));
        
    }//GEN-LAST:event_paketMakanJComboBoxActionPerformed

    private void paketMinumJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paketMinumJComboBoxActionPerformed
        // TODO add your handling code here:
        String paketMinumTerpilih = paketMinumJComboBox.getSelectedItem().toString();
        int harga = paketManajer.getHargaPaketByNamaItemAndCategory(paketMinumTerpilih, 2);
        
        hargaPaketMinumJTextField.setText(Integer.toString(harga));
    }//GEN-LAST:event_paketMinumJComboBoxActionPerformed

    private void paketTambahanJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paketTambahanJComboBoxActionPerformed
        // TODO add your handling code here:
        String paketTambahanTerpilih = paketTambahanJComboBox.getSelectedItem().toString();
        int harga = paketManajer.getHargaPaketByNamaItemAndCategory(paketTambahanTerpilih, 3);
        
        hargaPaketTambahanJTextField.setText(Integer.toString(harga));
    }//GEN-LAST:event_paketTambahanJComboBoxActionPerformed

    private void simpanJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanJButtonActionPerformed
        // TODO add your handling code here:
        Pesanan pesanan = new Pesanan();
        int no_meja = Integer.parseInt(noMejaJTextField.getText());
        String item_paket_1 = paketMakanJComboBox.getSelectedItem().toString();
        int jml_paket_1 = Integer.parseInt(jmlBeliPaketMakanJTextField.getText());
        String item_paket_2 = paketMinumJComboBox.getSelectedItem().toString();
        int jml_paket_2 = Integer.parseInt(jmlBeliPaketMinumJTextField.getText());        
        String item_paket_3 = paketTambahanJComboBox.getSelectedItem().toString();
        int jml_paket_3 = Integer.parseInt(jmlBeliPaketTambahanJTextField.getText());
        int total_pesanan = Integer.parseInt(totalPesananJTextField.getText());
        int telah_dibayar = 0;
        
        pesanan.setNo_meja(no_meja);
        pesanan.setItem_paket_1(item_paket_1);
        pesanan.setJml_paket_1(jml_paket_1);
        pesanan.setItem_paket_2(item_paket_2);
        pesanan.setJml_paket_2(jml_paket_2);
        pesanan.setItem_paket_3(item_paket_3);
        pesanan.setJml_paket_3(jml_paket_3);
        pesanan.setTotal_pesanan(total_pesanan);
        pesanan.setTelah_dibayar(telah_dibayar);
        
        try {
            this.pesananManajer.savePesananToDb(pesanan);
            
            // beri pesan jika simpan database berhasil
            infoJLabel.setText("Data pesanan berhasil disimpan.");
            infoJLabel.setForeground(Color.blue);
            this.resetForm();
            
            try {
                populateDaftarPesananJTable();
            } catch (SQLException ex) {
                Logger.getLogger(FormPesanan.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } catch (SQLException ex) {
            infoJLabel.setText("Data pesanan GAGAL disimpan.");
            infoJLabel.setForeground(Color.red);
            
            Logger.getLogger(FormPesanan.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_simpanJButtonActionPerformed

    private void jmlBeliPaketMakanJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmlBeliPaketMakanJTextFieldActionPerformed
        // TODO add your handling code here:
        int jmlBeliPaketMakan = Integer.parseInt(jmlBeliPaketMakanJTextField.getText());
        int bayarPaketMakan = jmlBeliPaketMakan * (Integer.parseInt(hargaPaketMakanJTextField.getText()));
        bayarPaketMakanJTextField.setText( Integer.toString(bayarPaketMakan) );
        
        setTotalPesanan();
    }//GEN-LAST:event_jmlBeliPaketMakanJTextFieldActionPerformed

    private void jmlBeliPaketTambahanJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmlBeliPaketTambahanJTextFieldActionPerformed
        // TODO add your handling code here:
        int jmlBeliPaketTambahan = Integer.parseInt(jmlBeliPaketTambahanJTextField.getText());
        int bayarPaketTambahan = jmlBeliPaketTambahan * (Integer.parseInt(hargaPaketTambahanJTextField.getText()));
        
        bayarPaketTambahanJTextField.setText( Integer.toString(bayarPaketTambahan) );
        
        setTotalPesanan();
    }//GEN-LAST:event_jmlBeliPaketTambahanJTextFieldActionPerformed

    private void setTotalPesanan() {
        int bayarPaketMakan = Integer.parseInt( bayarPaketMakanJTextField.getText() );
        int bayarPaketMinum = Integer.parseInt( bayarPaketMinumJTextField.getText() );
        int bayarPaketTambahan = Integer.parseInt( bayarPaketTambahanJTextField.getText() );
        
        totalPesananJTextField.setText(Integer.toString(bayarPaketMakan + bayarPaketMinum + bayarPaketTambahan));

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
            java.util.logging.Logger.getLogger(FormPesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPesanan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPesanan().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bayarPaketMakanJTextField;
    private javax.swing.JTextField bayarPaketMinumJTextField;
    private javax.swing.JTextField bayarPaketTambahanJTextField;
    private javax.swing.JMenuItem closeJMenuItem;
    private javax.swing.JTable daftarPesananJTable;
    private javax.swing.JButton hapusJButton;
    private javax.swing.JTextField hargaPaketMakanJTextField;
    private javax.swing.JTextField hargaPaketMinumJTextField;
    private javax.swing.JTextField hargaPaketTambahanJTextField;
    private javax.swing.JLabel infoJLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jmlBeliPaketMakanJTextField;
    private javax.swing.JTextField jmlBeliPaketMinumJTextField;
    private javax.swing.JTextField jmlBeliPaketTambahanJTextField;
    private javax.swing.JTextField noMejaJTextField;
    private javax.swing.JComboBox paketMakanJComboBox;
    private javax.swing.JComboBox paketMinumJComboBox;
    private javax.swing.JComboBox paketTambahanJComboBox;
    private javax.swing.JMenuItem pembayaranJMenuItem;
    private javax.swing.JMenuItem pesananJMenuItem;
    private javax.swing.JButton simpanJButton;
    private javax.swing.JTextField totalPesananJTextField;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the apps
     */
    public MainApps getApps() {
        return apps;
    }

    /**
     * @param apps the apps to set
     */
    public void setApps(MainApps apps) {
        this.apps = apps;
    }
    
    public void buildAllPaketComboBox() {  
        PaketManajer paketMan = new PaketManajer();
        
        String paket1[] = new String[4];
        paket1[0] = "--Paket 1--";
        int i = 1;
        for(Paket pkt : paketMan.getDaftarPaket1()) { 
            paket1[i] = pkt.getNama_item();
            i++;
        }
                
        DefaultComboBoxModel paketMakanComboBoxModel = new DefaultComboBoxModel(paket1);
        this.paketMakanJComboBox.setModel(paketMakanComboBoxModel);
        
        String paket2[] = new String[4];
        paket2[0] = "--Paket 2--";
        i = 1;
        for(Paket pkt : paketMan.getDaftarPaket2()) { 
            paket2[i] = pkt.getNama_item();
            i++;
        }
                
        DefaultComboBoxModel paketMinumComboBoxModel = new DefaultComboBoxModel(paket2);
        this.paketMinumJComboBox.setModel(paketMinumComboBoxModel);
        
        String paket3[] = new String[4];
        paket3[0] = "--Paket 3--";
        i = 1;
        for(Paket pkt : paketMan.getDaftarPaket3()) { 
            paket3[i] = pkt.getNama_item();
            i++;
        }
        
        DefaultComboBoxModel paketTambahanComboBoxModel = new DefaultComboBoxModel(paket3);
        this.paketTambahanJComboBox.setModel(paketTambahanComboBoxModel);
                
    }

    /**
     * @return the paketManajer
     */
    public PaketManajer getPaketManajer() {
        return paketManajer;
    }

    /**
     * @param paketManajer the paketManajer to set
     */
    public void setPaketManajer(PaketManajer paketManajer) {
        this.paketManajer = paketManajer;
    }

    /**
     * @return the pesananManajer
     */
    public PesananManajer getPesananManajer() {
        return pesananManajer;
    }

    /**
     * @param pesananManajer the pesananManajer to set
     */
    public void setPesananManajer(PesananManajer pesananManajer) {
        this.pesananManajer = pesananManajer;
    }
    
    public void resetForm() {
        noMejaJTextField.setText("");
        hargaPaketMakanJTextField.setText("");
        hargaPaketMinumJTextField.setText("");
        hargaPaketTambahanJTextField.setText("");
        jmlBeliPaketMakanJTextField.setText("");
        jmlBeliPaketMinumJTextField.setText("");
        jmlBeliPaketTambahanJTextField.setText("");
        bayarPaketMakanJTextField.setText("");
        bayarPaketMinumJTextField.setText("");
        bayarPaketTambahanJTextField.setText("");
        totalPesananJTextField.setText("");
        paketMakanJComboBox.setSelectedIndex(0);
        paketMinumJComboBox.setSelectedIndex(0);
        paketTambahanJComboBox.setSelectedIndex(0);
    }
    
    public void populateDaftarPesananJTable() throws SQLException {
        PesananManajer pesananMan = new PesananManajer();
        
        daftarPesananTableModel = new DefaultTableModel();
        daftarPesananTableModel.addColumn("Id Pesanan");
        daftarPesananTableModel.addColumn("No Meja");
        daftarPesananTableModel.addColumn("Pil.Paket 1");
        daftarPesananTableModel.addColumn("Pil.Paket 2");
        daftarPesananTableModel.addColumn("Pil.Paket 3");
        daftarPesananTableModel.addColumn("Total Pesanan");
        daftarPesananTableModel.addColumn("Bayar");
        
        daftarPesananJTable.setModel(daftarPesananTableModel);
        
        pesananMan.populatePesanan();
        
        for(Pesanan pesanan : pesananMan.getDaftarPesanan()) {
            Object[] daftarPesanan = new Object[7];
            daftarPesanan[0] = pesanan.getId_pesanan();
            daftarPesanan[1] = pesanan.getNo_meja();
            daftarPesanan[2] = pesanan.getItem_paket_1();
            daftarPesanan[3] = pesanan.getItem_paket_2();
            daftarPesanan[4] = pesanan.getItem_paket_3();
            daftarPesanan[5] = pesanan.getTotal_pesanan();
            
            String telahDibayar = "";
            if ( pesanan.getTelah_dibayar() == 1 ) {
                telahDibayar = "OK";
            }
            
            daftarPesanan[6] = telahDibayar;
            
            daftarPesananTableModel.addRow(daftarPesanan);
            
        }
        
        // sembunyikan row ID Pesanan
        //daftarPesananJTable.removeColumn(daftarPesananJTable.getColumnModel().getColumn(0));
        
        // add selection listener
        daftarPesananJTable.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
            @Override
            public void valueChanged(ListSelectionEvent e) {
                
                try  {
                    idPesananTerpilih = Integer.parseInt( daftarPesananJTable.getValueAt(daftarPesananJTable.getSelectedRow(), 0).toString() );
                    
                } catch (java.lang.ArrayIndexOutOfBoundsException ex) {
                    idPesananTerpilih = 0;
                }
            }
        });
        
    }
    
}

