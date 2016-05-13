/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mujib;

import com.mujib.entity.PaketManajer;
import com.mujib.entity.PembayaranManajer;
import com.mujib.entity.PesananManajer;
import com.mujib.gui.FormPembayaran;
import com.mujib.gui.FormPesanan;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mujibur
 */
public class MainApps {
    
    FormPesanan fPesanan;
    FormPembayaran fPembayaran;
    PaketManajer paketManajer;
    PembayaranManajer pembayaranManajer;
    private PesananManajer pesananManajer;
    
    public MainApps() {
        this.fPesanan = new FormPesanan();
        this.fPembayaran = new FormPembayaran();
        
        paketManajer = new PaketManajer();
        pesananManajer = new PesananManajer();
        pembayaranManajer = new PembayaranManajer();
        
        this.fPesanan.setPaketManajer(paketManajer);
        this.fPesanan.setPesananManajer(pesananManajer);
                
        this.fPembayaran.setPesananManajer(pesananManajer);
        this.fPembayaran.setPaketManajer(paketManajer);
        this.fPembayaran.setPembayaranManajer(pembayaranManajer);
        
    }
    
    public static void main(String args[]) { 
        MainApps apps = new MainApps();
        
        // menghubungkan mainapps dengan form gui
        apps.fPesanan.setApps(apps);
        apps.fPembayaran.setApps(apps);
        
        // show form pesanan at first time
        apps.showFormPesanan();
        
        
    }
    
    public void showFormPesanan() {
        try {
            this.fPembayaran.populateDaftarPesananJTable();
        } catch (SQLException ex) {
            Logger.getLogger(MainApps.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.fPesanan.setVisible(true);
        this.fPembayaran.setVisible(false);
    }
    
    public void showFormPembayaran() {
        try {
            this.fPesanan.populateDaftarPesananJTable();
        } catch (SQLException ex) {
            Logger.getLogger(MainApps.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.fPesanan.setVisible(false);
        this.fPembayaran.setVisible(true);
    }
    
    public void closeApps(){
        this.fPesanan.dispose();
        this.fPembayaran.dispose();
        System.exit(0);
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
    
    
}
