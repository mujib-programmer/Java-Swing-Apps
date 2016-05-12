/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mujib.entity;

/**
 *
 * @author mujibur
 */
public class Pembayaran {
    private int id_pembayaran;
    private int id_pesanan;
    private int no_meja;
    private int total_pesanan;
    private int ppn;
    private int uang_pembayaran;
    private int uang_kembali;
    private String struk;

    /**
     * @return the id_pembayaran
     */
    public int getId_pembayaran() {
        return id_pembayaran;
    }

    /**
     * @param id_pembayaran the id_pembayaran to set
     */
    public void setId_pembayaran(int id_pembayaran) {
        this.id_pembayaran = id_pembayaran;
    }

    /**
     * @return the id_pesanan
     */
    public int getId_pesanan() {
        return id_pesanan;
    }

    /**
     * @param id_pesanan the id_pesanan to set
     */
    public void setId_pesanan(int id_pesanan) {
        this.id_pesanan = id_pesanan;
    }

    /**
     * @return the total_pesanan
     */
    public int getTotal_pesanan() {
        return total_pesanan;
    }

    /**
     * @param total_pesanan the total_pesanan to set
     */
    public void setTotal_pesanan(int total_pesanan) {
        this.total_pesanan = total_pesanan;
    }

    /**
     * @return the ppn
     */
    public int getPpn() {
        return ppn;
    }

    /**
     * @param ppn the ppn to set
     */
    public void setPpn(int ppn) {
        this.ppn = ppn;
    }

    /**
     * @return the uang_pembayaran
     */
    public int getUang_pembayaran() {
        return uang_pembayaran;
    }

    /**
     * @param uang_pembayaran the uang_pembayaran to set
     */
    public void setUang_pembayaran(int uang_pembayaran) {
        this.uang_pembayaran = uang_pembayaran;
    }

    /**
     * @return the uang_kembali
     */
    public int getUang_kembali() {
        return uang_kembali;
    }

    /**
     * @param uang_kembali the uang_kembali to set
     */
    public void setUang_kembali(int uang_kembali) {
        this.uang_kembali = uang_kembali;
    }

    /**
     * @return the struk
     */
    public String getStruk() {
        return struk;
    }

    /**
     * @param struk the struk to set
     */
    public void setStruk(String struk) {
        this.struk = struk;
    }
    
    /**
     * @return the no_meja
     */
    public int getNo_meja() {
        return no_meja;
    }

    /**
     * @param no_meja the no_meja to set
     */
    public void setNo_meja(int no_meja) {
        this.no_meja = no_meja;
    }
    
}
