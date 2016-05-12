/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mujib.entity;

import com.mujib.db.Koneksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mujibur
 */
public class PaketManajer {
    private List <Paket> daftarPaket;
    private List <Paket> daftarPaket1;
    private List <Paket> daftarPaket2;
    private List <Paket> daftarPaket3;
    Connection dbCon;
    
    
    public PaketManajer() {
        daftarPaket = new ArrayList<Paket>();
        daftarPaket1 = new ArrayList<Paket>();
        daftarPaket2 = new ArrayList<Paket>();
        daftarPaket3 = new ArrayList<Paket>();
        try {
            this.populatePaket();
        } catch (SQLException ex) {
            Logger.getLogger(PaketManajer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void populatePaket() throws SQLException {
        dbCon = new Koneksi().getKoneksi();
        
        String sql="select * from paket";
        Statement st=dbCon.createStatement();
        ResultSet rs=st.executeQuery(sql);
        
        while(rs.next()){            
            //System.out.print("id_paket = " + rs.getInt("id_paket"));
            // System.out.print("kategori = " + rs.getInt("kategori"));
            //System.out.print("nama_item = " + rs.getString("nama_item"));
            //System.out.print("harga_satuan = " + rs.getInt("harga_satuan"));
            
            
            Paket paket = new Paket(rs.getInt("id_paket"),rs.getInt("kategori"),rs.getString("nama_item"),rs.getInt("harga_satuan"));
            daftarPaket.add(paket);
            
            if (rs.getInt("kategori") == 1) {
                daftarPaket1.add(paket);
            } else if (rs.getInt("kategori") == 2) {
                daftarPaket2.add(paket);
            } else {
                daftarPaket3.add(paket);
            }
        }
    }
    
    public int getHargaPaketByNamaItemAndCategory(String nama_item, int kategori){
        int harga = 0;
        
        for(Paket pkt : daftarPaket) {
            if(pkt.getNama_item().equals(nama_item)) {
                if(pkt.getKategori() == kategori) {
                    harga = pkt.getHarga_satuan();
                }
            }
        }
        
        return harga;
    }

    /**
     * @return the daftarPaket
     */
    public List <Paket> getDaftarPaket() {
        return daftarPaket;
    }

    /**
     * @param daftarPaket the daftarPaket to set
     */
    public void setDaftarPaket(List <Paket> daftarPaket) {
        this.daftarPaket = daftarPaket;
    }

    /**
     * @return the daftarPaket1
     */
    public List <Paket> getDaftarPaket1() {
        return daftarPaket1;
    }

    /**
     * @param daftarPaket1 the daftarPaket1 to set
     */
    public void setDaftarPaket1(List <Paket> daftarPaket1) {
        this.daftarPaket1 = daftarPaket1;
    }

    /**
     * @return the daftarPaket2
     */
    public List <Paket> getDaftarPaket2() {
        return daftarPaket2;
    }

    /**
     * @param daftarPaket2 the daftarPaket2 to set
     */
    public void setDaftarPaket2(List <Paket> daftarPaket2) {
        this.daftarPaket2 = daftarPaket2;
    }

    /**
     * @return the daftarPaket3
     */
    public List <Paket> getDaftarPaket3() {
        return daftarPaket3;
    }

    /**
     * @param daftarPaket3 the daftarPaket3 to set
     */
    public void setDaftarPaket3(List <Paket> daftarPaket3) {
        this.daftarPaket3 = daftarPaket3;
    }
    
}
