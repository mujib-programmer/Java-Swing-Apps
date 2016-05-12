/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mujib.entity;

import com.mujib.db.Koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
public class PesananManajer {
    private List <Pesanan> daftarPesanan;
    Connection dbCon;
    
    public PesananManajer() {
        daftarPesanan = new ArrayList<Pesanan>();
        try {
            getDbConnection();
        } catch (SQLException ex) {
            Logger.getLogger(PesananManajer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            populatePesanan();
        } catch (SQLException ex) {
            Logger.getLogger(PesananManajer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void getDbConnection() throws SQLException {
        dbCon = new Koneksi().getKoneksi();
    }
    
    public void savePesananToDb(Pesanan pesanan) throws SQLException {
               
        PreparedStatement ps = dbCon.prepareStatement("insert into pesanan (no_meja, item_paket_1, jml_paket_1, item_paket_2, jml_paket_2, item_paket_3, jml_paket_3, total_pesanan, telah_dibayar)" + " value (?,?,?,?,?,?,?,?,?)");            
        ps.setInt(1, pesanan.getNo_meja());
        ps.setString(2, pesanan.getItem_paket_1());
        ps.setInt(3, pesanan.getJml_paket_1());
        ps.setString(4, pesanan.getItem_paket_2());
        ps.setInt(5, pesanan.getJml_paket_2());
        ps.setString(6, pesanan.getItem_paket_3());
        ps.setInt(7, pesanan.getJml_paket_3());
        ps.setInt(8, pesanan.getTotal_pesanan());
        ps.setInt(9, 0);

        // simpan ke database
        ps.executeUpdate();
    }
    
    public void populatePesanan() throws SQLException {
        
        String sql="select * from pesanan";
        Statement st=dbCon.createStatement();
        ResultSet rs=st.executeQuery(sql);
        
        while(rs.next()){            
            
            //rs.getInt("id_paket"),rs.getInt("kategori"),rs.getString("nama_item"),rs.getInt("harga_satuan")
            Pesanan pesanan = new Pesanan();
            
            pesanan.setId_pesanan( rs.getInt("id_pesanan") );
            pesanan.setNo_meja( rs.getInt("no_meja") );
            pesanan.setItem_paket_1( rs.getString("item_paket_1") );
            pesanan.setJml_paket_1( rs.getInt("jml_paket_1") );
            pesanan.setItem_paket_1( rs.getString("item_paket_2") );
            pesanan.setJml_paket_1( rs.getInt("jml_paket_2") );
            pesanan.setItem_paket_1( rs.getString("item_paket_3") );
            pesanan.setJml_paket_1( rs.getInt("jml_paket_3") );
            pesanan.setTotal_pesanan(rs.getInt("total_pesanan") );
            pesanan.setTelah_dibayar(rs.getInt("telah_dibayar") );
            
            daftarPesanan.add(pesanan);
            
        }
    }
    
    public int getTotalPesananByNoMeja(int noMeja){
        int totalPesanan = 0;
        
        for(Pesanan pesanan : daftarPesanan) {
            if( pesanan.getTelah_dibayar() == 0) {
                if(pesanan.getNo_meja() == noMeja) {
                    totalPesanan = pesanan.getTotal_pesanan();
                }
            }
        }
        
        return totalPesanan;
    }
    
    public Pesanan getPesananByNoMeja(int noMeja){
        Pesanan pesananDicari = null;
        
        for(Pesanan pesanan : daftarPesanan) {
            if( pesanan.getTelah_dibayar() == 0) {
                if(pesanan.getNo_meja() == noMeja) {
                    pesananDicari = pesanan;
                }
            }
        }
        
        return pesananDicari;
    }
    
    public void pesananTelahDibayar(Pesanan pesanan) throws SQLException {
        System.out.println("DEBUGGING pesananTelahDibayar!!!!");
        System.out.println("id pesanan: " + pesanan.getId_pesanan());
        
        PreparedStatement ps = dbCon.prepareStatement("update pesanan set telah_dibayar=? where id_pesanan=?");            
        ps.setInt(1, 1);
        ps.setInt(2, pesanan.getId_pesanan());

        // simpan ke database
        ps.executeUpdate();
        
    }
    
}


