package Praktikum05;

public class Sorting04Main {
    public static void main(String[] args) {
        
        int a[] = {20, 10, 2, 7, 12};
        int c[] = {40, 10, 4, 9, 3};

        Sorting04 dataUrirt1 = new Sorting04(a, a.length);

        System.out.println("Data awal 1");
        dataUrirt1.tampil();
        dataUrirt1.bubbleSort();
        System.out.println("Data sudah di sorting ASC");
        dataUrirt1.tampil();

        System.out.println("Data awal 1");
        dataUrirt1.tampil();
        dataUrirt1.insertionSort();
        System.out.println("Data sudah di sorting ASC");
        dataUrirt1.tampil();
    }
}
