package main.utils;

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
    public int[] makeSortedArray(int length, int start){
        int[] arr = new int[length];
        int step = 0;
        for (int i = start; step < arr.length-1; i++) {
            arr[step] = i;
            step = step + 1;
        }
        return arr;
    }
}
