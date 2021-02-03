package main.SortingAlgorithms;

import java.util.Random;

public class ArrayCreator{
    public int[] makeArray(int length, int bound){
        Random rd = new Random();
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(bound);
        }
        return arr;
    }
}
