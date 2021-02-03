package main.SortingAlgorithms;

public class Solution{
    public static void main(String[] args) {
        ArrayCreator arrayCreator = new ArrayCreator();
        int[] array = arrayCreator.makeArray(100, 1000);

        for (int i : array) {
            System.out.print(i + " ");
        }

        run(array.clone(), new InsertionSort());
        run(array.clone(), new MergeSort());
    }

    private static void run(int[] array, BaseSort sortMethod) {
        int[] sorterArray = sortMethod.sort(array);
        System.out.println("\n" + sortMethod.name);
        for (int i : sorterArray) {
            System.out.print(i + " ");
        }
    }
}
