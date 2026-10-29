package id.ac.univpancasila.perpustakaan.service;

import java.util.ArrayList;

import id.ac.univpancasila.perpustakaan.model.Buku;

public class PerpustakaanService {
    // TODO 1: tentukan bagaimana layanan ini menyimpan koleksi dan anggota.
    //         Agregasi atau komposisi? Tuliskan alasannya di analisis.md,
    //         lalu wujudkan keputusan itu di sini.
    private ArrayList<Buku> buku = new ArrayList<>();

    public void tambahKoleksi(Buku buku) {
        // TODO 2
        this.buku.add(buku);
    }

    public Buku cariKoleksi(String nomorInduk) {
        // TODO 3
        for (Buku buku : this.buku) {
            if (buku.getNomorInduk().equals(nomorInduk)) {
                return buku;
            }
        }
        return null;
    }

    public void pinjam(String nomorAnggota, String nomorInduk) {
        // TODO 4: terapkan aturan bisnis dari deskripsi-kebutuhan.md.
        //         Aturan lengkapnya akan disempurnakan pada sesi 10.
        System.out.println("Anggota " + nomorAnggota + " meminjam buku " + nomorInduk);
    }

    public void kembalikan(String nomorAnggota, String nomorInduk) {
        // TODO 5
        System.out.println("Anggota " + nomorAnggota + " mengembalikan buku " + nomorInduk);
    }

}
