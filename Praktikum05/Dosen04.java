package Praktikum05;

public class Dosen04 {
    String kode, nama;
    boolean jenisKelamin;
    int usia;

    Dosen04(){

    }

    Dosen04(String id, String nm, boolean jk, int us){
        kode = id;
        nama = nm;
        jenisKelamin = jk;
        usia = us;
    }

    void tampil(){
        System.out.println("Kode Dosen : " + kode);
        System.out.println("Nama\t: " + nama);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia\t: " + usia + " Tahun");
        System.out.println("----------------------------------------------------");
    }
}
