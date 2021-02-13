package main.SortingAlgorithms;

import main.utils.ArrayCreator;

public class Solution{
    public static void main(String[] args) {
        ArrayCreator arrayCreator = new ArrayCreator();
        int[] array = arrayCreator.makeArray(100, 1000);

        for (int i : array) {
            System.out.print(i + " ");
        }

        run(array.clone(), new InsertionSort());
        run(array.clone(), new MergeSort());
        run(array.clone(), new QuickSort());
        run(array.clone(), new HeapSort());
        run(array.clone(), new SelectionSearch());
    }

    private static void run(int[] array, BaseSort sortMethod) {
        int[] sorterArray = sortMethod.sort(array);
        System.out.println("\n" + sortMethod.getClass().getName());
        for (int i : sorterArray) {
            System.out.print(i + " ");
        }
    }
}
