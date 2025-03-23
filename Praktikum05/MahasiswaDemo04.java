package Praktikum05;

import java.util.Scanner;

public class MahasiswaDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlIndex;
        double ipk;
        String nama, nim, kls;

        System.out.print("Masukkan jumlah mahasiswa : ");
        jmlIndex = sc.nextInt();
        sc.nextLine();
        MahasiswaBerprestasi04 list = new MahasiswaBerprestasi04(jmlIndex);

        for(int i = 0; i < jmlIndex; i++){
            System.out.println("Masukkan Informasi Mahasiswa ke-" + (i + 1) + " : ");
            System.out.print("NIM\t: ");
            nim = sc.nextLine();
            System.out.print("Nama\t: ");
            nama = sc.nextLine();
            System.out.print("Kelas\t: ");
            kls = sc.nextLine();
            System.out.print("IPK\t: ");
            ipk = sc.nextDouble();
            sc.nextLine();

            Mahasiswa04 m = new Mahasiswa04(nim, nama, kls, ipk);
            list.tambah(m);
        }
        
        System.out.println("Data mahasiswa Sebelum Sorting : ");
        list.tampil();
        
        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        list.bubbleSort();
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting selection sort berdasarkan IPK (ASC) : ");
        list.selectionSort();
        list.tampil();
        
        System.out.println("Data Mahasiswa setelah sorting insertion sort berdasarkan IPK (ASC) : ");
        list.insertionSort();
        list.tampil();
    }
}
