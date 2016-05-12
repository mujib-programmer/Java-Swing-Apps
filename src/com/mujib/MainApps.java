/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mujib;

import com.mujib.entity.PaketManajer;
import com.mujib.entity.PesananManajer;
import com.mujib.gui.FormPembayaran;
import com.mujib.gui.FormPesanan;

/**
 *
 * @author mujibur
 */
public class MainApps {
    
    FormPesanan fPesanan;
    FormPembayaran fPembayaran;
    PaketManajer paketManajer;
    private PesananManajer pesananManajer;
    
    public MainApps() {
        this.fPesanan = new FormPesanan();
        this.fPembayaran = new FormPembayaran();
        this.paketManajer = this.fPesanan.getPaketManajer();
        this.pesananManajer = this.fPesanan.getPesananManajer();
        
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
        this.fPesanan.setVisible(true);
        this.fPembayaran.setVisible(false);
    }
    
    public void showFormPembayaran() {
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
