package main.SortingAlgorithms;


public class MergeSort extends BaseSort{
    public String name = "MergeSort";

    private int[] mergeSort(int[] array){
        int length = array.length;

        if (length < 2) {
            return array;
        }

        int middle = length / 2;
        int[] left = new int[middle];
        int[] right = new int[length - middle];

        for (int i = 0; i < length; i++) {
            if (i < middle){
                left[i] = array[i];
            }
            else {
                right[i - middle] = array[i];
            }
        }
        left = mergeSort(left);
        right = mergeSort(right);
        return mergeArray(left, right);
    }

    private int[] mergeArray(int[] left, int[] right) {
        int [] result = new int[left.length + right.length];
        int positionLeft = 0, positionRight = 0;

        for (int i = 0; i < result.length; i++) {
            if ((positionLeft == left.length) && (positionRight == right.length)){
                return result;
            } else if (positionLeft == left.length){
                result[i] = right[positionRight];
                positionRight++;
            } else if (positionRight == right.length) {
                result[i] = left[positionLeft];
                positionLeft++;
            } else if (left[positionLeft] < right[positionRight]) {
                result[i] = left[positionLeft];
                positionLeft++;
            } else {
                result[i] = right[positionRight];
                positionRight++;
            }
        }
        return result;
    }

    public int[] sort(int[] array){
        return mergeSort(array);
    }
}
