package Praktikum05;

import java.util.Scanner;

public class DosenDemo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen04 listDosen = new DataDosen04();
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Sorting ASC (Termuda ke Tertua)");
            System.out.println("4. Sorting DESC (Tertua ke Termuda)");
            System.out.println("5. Pencarian Data berdasarkan Nama");
            System.out.println("6. Pencarian Data berdasarkan Usia");
            System.out.println("7. Keluar");

            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    if (listDosen.index < 10) {
                        System.out.print("Masukkan Kode Dosen: ");
                        String kode = sc.nextLine();
                        System.out.print("Masukkan Nama Dosen: ");
                        String nama = sc.nextLine();
                        System.out.print("Masukkan Jenis Kelamin (L/P): ");
                        char jk = sc.next().charAt(0);
                        System.out.print("Masukkan Usia: ");
                        int usia = sc.nextInt();
                        sc.nextLine();

                        Dosen04 dsn = new Dosen04(kode, nama, ((jk == 'L' || jk == 'l') ? true : false), usia);
                        listDosen.tambahDosen(dsn);
                    } else {
                        System.out.println("Data dosen sudah penuh!");
                    }
                    break;
                case 2:
                    listDosen.tampilDosen();
                    break;
                case 3:
                    listDosen.sortingAscending();
                    listDosen.tampilDosen();
                    break;
                case 4:
                    listDosen.sortingDescending();
                    listDosen.tampilDosen();
                    break;
                case 5:
                    System.out.print("Masukkan Nama Dosen yang dicari: ");
                    String cariNama = sc.nextLine();
                    listDosen.pencarianDataSequential(cariNama);
                    break;
                case 6:
                    listDosen.sortingAscending();
                    System.out.print("Masukkan Usia Dosen yang dicari: ");
                    int cariUsia = sc.nextInt();
                    sc.nextLine();
                    listDosen.pencarianDataBinary(cariUsia);
                    break;
                case 7:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);

        sc.close();
    }
}
