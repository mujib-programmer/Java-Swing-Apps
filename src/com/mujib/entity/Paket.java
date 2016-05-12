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
public class Paket {
    private int id_paket;
    private int kategori;
    private String nama_item;
    private int harga_satuan;
    
    public Paket(int id_paket, int kategori, String nama_item, int harga_satuan) {
        this.id_paket = id_paket;
        this.kategori = kategori;
        this.nama_item = nama_item;
        this.harga_satuan = harga_satuan;
    }

    /**
     * @return the id_paket
     */
    public int getId_paket() {
        return id_paket;
    }

    /**
     * @param id_paket the id_paket to set
     */
    public void setId_paket(int id_paket) {
        this.id_paket = id_paket;
    }

    /**
     * @return the kategori
     */
    public int getKategori() {
        return kategori;
    }

    /**
     * @param kategori the kategori to set
     */
    public void setKategori(int kategori) {
        this.kategori = kategori;
    }

    /**
     * @return the nama_item
     */
    public String getNama_item() {
        return nama_item;
    }

    /**
     * @param nama_item the nama_item to set
     */
    public void setNama_item(String nama_item) {
        this.nama_item = nama_item;
    }

    /**
     * @return the harga_satuan
     */
    public int getHarga_satuan() {
        return harga_satuan;
    }

    /**
     * @param harga_satuan the harga_satuan to set
     */
    public void setHarga_satuan(int harga_satuan) {
        this.harga_satuan = harga_satuan;
    }
    
}
