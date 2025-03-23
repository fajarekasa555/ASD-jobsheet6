package Praktikum05;

public class DataDosen04 {
    Dosen04[] dosen = new Dosen04[10];
    int index = 0;

    void tambahDosen(Dosen04 d){
        if (index < dosen.length) {
            dosen[index] = d;
            index++;
        }else{
            System.out.println("Data dosen sudah penuh");
        }
    }

    void tampilDosen(){
        if (index == 0) {
            System.out.println("Data dosen belum ditambahkan");

        }else{
            for (int i = 0; i < index; i++) {
                dosen[i].tampil();
            }
        }
    }

    void sortingAscending(){
        for(int i = 0; i < index - 1; i++){
            for(int j = 0; j < index - i - 1; j++){
                if (dosen[j].usia > dosen[j + 1].usia) {
                    Dosen04 tmp = dosen[j];
                    dosen[j] = dosen[j + 1];
                    dosen[j + 1] = tmp;
                }
            }
        }
    }

    void sortingDescending(){
        for(int i = 0; i < index - 1; i++){
            int maxIndex = i;
            for(int j = i + 1; j < index; j++){
                if(dosen[j].usia > dosen[maxIndex].usia){
                    maxIndex = j;
                }
            }
            Dosen04 tmp = dosen[maxIndex];
            dosen[maxIndex] = dosen[i];
            dosen[i] = tmp;
        }
    }

    void insertionSort(){
        for(int i = 1; i < index; i++){
            Dosen04 tmp = dosen[i];
            int j = i;
            while (j > 0 && dosen[j - 1].usia < tmp.usia) {
                dosen[j] = dosen[j - 1];
                j--;
            }
            dosen[j] = tmp;
        }
    }
}
