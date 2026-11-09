/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kelas.data;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import kelas.model.Produk;

public class DataProduk {
    private final ObservableList<Produk> daftar = FXCollections.observableArrayList();
    private int urutan = 1;

    public ObservableList<Produk> getDaftar() {
        return FXCollections.unmodifiableObservableList(daftar);
    }

    public Produk tambah(String nama, String kategori, long harga) {
        // Generate kode otomatis, misal: PRD001
        Produk p = new Produk(String.format("PRD%03d", urutan), nama, kategori, harga);
        daftar.add(p);
        urutan++;
        return p;
    }
}
