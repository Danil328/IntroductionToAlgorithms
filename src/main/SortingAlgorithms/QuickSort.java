package main.SortingAlgorithms;

public class QuickSort implements BaseSort {

    private void quickSort(int[] array, int low, int high){
        int length = array.length;
        if (length < 2) return;
        if (low >= high) return;

        int middle = low + (high - low) / 2;
        int k = array[middle];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < k) {
                i++;
            }

            while (array[j] > k) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }

    @Override
    public int[] sort(int[] array) {
        quickSort(array, 0, array.length - 1);
        return array;
    }
}
