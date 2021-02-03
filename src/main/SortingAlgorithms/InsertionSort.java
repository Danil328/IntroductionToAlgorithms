package main.SortingAlgorithms;


public class InsertionSort extends BaseSort{
    public String name = "InsertionSort";

    public int[] sort(int[] array){
        for (int i = 1; i<array.length; i++){
            int key = array[i];
            int j = i - 1;
            while ((j >= 0) && (array[j] > key)){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
        return array;
    }
}

