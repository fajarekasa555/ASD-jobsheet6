package Praktikum05;

public class Sorting04 {

    int[] data;
    int jumData;

    Sorting04(int Data[], int jmlData){
        jumData = jmlData;
        data = new int[jmlData];
        for(int i = 0; i < jmlData; i++){
            data[i] = Data[i];
        }
    }

    void bubbleSort(){
        int temp = 0;
        for(int i = 0; i < jumData - 1; i++){
            for(int j = 1; j < jumData - i; j++){
                if(data[j - 1] > data[j]){
                    temp = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = temp;
                }
            }
        }
    }

    void insertionSort(){
        for(int i = 0; i<= data.length; i++){
            int temp = data[i];
            int j = i  - 1;
            while (j >= 0 && data[j] > temp) {
                data[j + 1] = data[j];
                j--;
            }
            data[j + 1] = temp;
        }
    }

    void tampil(){
        for(int value : data){
            System.out.print(value + " ");
        }
        System.out.println();
    }
}