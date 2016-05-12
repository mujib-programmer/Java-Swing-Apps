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
public class PembayaranManajer {
    private List <Pembayaran> daftarPembayaran;
    Connection dbCon;
    
    public PembayaranManajer() {
        daftarPembayaran = new ArrayList<Pembayaran>();
        try {
            getDbConnection();
        } catch (SQLException ex) {
            Logger.getLogger(PembayaranManajer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            populatePembayaran();
        } catch (SQLException ex) {
            Logger.getLogger(PesananManajer.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void getDbConnection() throws SQLException {
        dbCon = new Koneksi().getKoneksi();
    }
    
    public void populatePembayaran() throws SQLException {
        daftarPembayaran = new ArrayList<Pembayaran>();
        
        String sql="select * from pembayaran";
        Statement st=dbCon.createStatement();
        ResultSet rs=st.executeQuery(sql);
        
        while(rs.next()){            
            
            Pembayaran pembayaran = new Pembayaran();
            
            pembayaran.setId_pembayaran(rs.getInt("id_pembayaran") );
            pembayaran.setId_pesanan(rs.getInt("id_pesanan") );
            pembayaran.setNo_meja(rs.getInt("no_meja") );
            pembayaran.setTotal_pesanan(rs.getInt("total_pesanan") );
            pembayaran.setPpn(rs.getInt("ppn"));
            pembayaran.setUang_pembayaran(rs.getInt("uang_pembayaran") );
            pembayaran.setUang_kembali(rs.getInt("uang_kembali") );
            pembayaran.setStruk(rs.getString("struk"));
            
            getDaftarPembayaran().add(pembayaran);
            
        }
    }
    
    public void savePembayaranToDb(Pembayaran pembayaran) throws SQLException {
               
        PreparedStatement ps = dbCon.prepareStatement("insert into pembayaran (id_pesanan, no_meja, total_pesanan, ppn, uang_pembayaran, uang_kembali, struk)" + " value (?,?,?,?,?,?,?)");            
        ps.setInt(1, pembayaran.getId_pesanan());
        ps.setInt(2, pembayaran.getNo_meja());
        ps.setInt(3, pembayaran.getTotal_pesanan());
        ps.setInt(4, pembayaran.getPpn());
        ps.setInt(5, pembayaran.getUang_pembayaran());
        ps.setInt(6, pembayaran.getUang_kembali());
        ps.setString(7, pembayaran.getStruk());

        // simpan ke database
        ps.executeUpdate();
    }

    /**
     * @return the daftarPembayaran
     */
    public List <Pembayaran> getDaftarPembayaran() {
        return daftarPembayaran;
    }

    /**
     * @param daftarPembayaran the daftarPembayaran to set
     */
    public void setDaftarPembayaran(List <Pembayaran> daftarPembayaran) {
        this.daftarPembayaran = daftarPembayaran;
    }
    
}
