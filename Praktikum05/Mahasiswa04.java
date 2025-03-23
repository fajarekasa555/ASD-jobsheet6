package Praktikum05;

public class Mahasiswa04 {
    String nim, nama, kelas;
    double ipk;

    Mahasiswa04(){

    }

    Mahasiswa04(String nm, String nam, String kls, double ip){
        nim = nm;
        nama = nam;
        kelas = kls;
        ipk = ip;
    }

    void tampilInformasi(){
        System.out.println("Nama: "+ nama); 
        System.out.println("NIM: " + nim); 
        System.out.println("Kelas: "+ kelas);
        System.out.println("IPK: " + ipk);
    }
}
