package main.SearchAlgorihtms;

import main.utils.ArrayCreator;

public class Solution {
    public static void main(String[] args) {
        ArrayCreator arrayCreator = new ArrayCreator();
        int[] array = arrayCreator.makeSortedArray(100, 2);

        for (int i : array) {
            System.out.print(i + " ");
        }

        run(array.clone(), 10, new BinarySearch());
    }

    private static void run(int[] array, int key, BaseSearch searchMethod) {
        int findedValue = searchMethod.search(array, key);
        System.out.println("\n" + searchMethod.getClass().getName() + " " + findedValue);
    }
}
