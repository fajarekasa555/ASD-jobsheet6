package Praktikum05;

public class MahasiswaBerprestasi04 {
    Mahasiswa04[] listMhs;
    int index;

    MahasiswaBerprestasi04(int jmlIndex){
        listMhs = new Mahasiswa04[jmlIndex];
        index = 0;
    }

    void tambah(Mahasiswa04 m){
        if(index < listMhs.length){
            listMhs[index] = m;
            index++;
        }else{
            System.out.println("data sudah penuh");
        }
    }

    void tampil(){
        for(Mahasiswa04 m:listMhs){
            m.tampilInformasi();
            System.out.println("-------------------");
        }
    }

    void bubbleSort(){
        for (int i = 0 ; i < listMhs.length - 1; i++){
            for (int j = 1; j < listMhs.length - i; j++){
                if (listMhs[j].ipk > listMhs[j - 1].ipk){
                    Mahasiswa04 tmp = listMhs[j];
                    listMhs[j]=listMhs[j-1];
                    listMhs[j-1]=tmp;
                }
            }
        }
    }

    void selectionSort(){
        for(int i = 0; i < listMhs.length-1; i++){
            int indexMin = i;
            for(int j = (i + 1); j < listMhs.length; j++){
                if(listMhs[j].ipk < listMhs[indexMin].ipk){
                    indexMin = j;
                }
            }
            Mahasiswa04 tmp = listMhs[indexMin];
            listMhs[indexMin] = listMhs[i];
            listMhs[i] = tmp;
        }
    }

    void insertionSort(){
        for(int i = 1; i < listMhs.length; i++){
            Mahasiswa04 tmp = listMhs[i];
            int j = i;
            while(j > 0 && listMhs[j - 1].ipk < tmp.ipk){
                listMhs[j] = listMhs[j-1];
                j--;
            }
            listMhs[j] = tmp;
        }
    }
}
