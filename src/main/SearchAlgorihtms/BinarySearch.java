package main.SearchAlgorihtms;

public class BinarySearch implements BaseSearch{
    private int binary_search(int[] array, int key){
        int n = array.length;
        int left = 0;
        int right = n-1;
        int middle = (left + right) / 2;

        while (left < right){
            if (key == array[middle]) return middle;
            if (key > array[middle]){
                left = middle;
                middle = (left + right) / 2;
            } else {
                right = middle;
                middle = (left + right) / 2;
            }
        }
        return -1;
    }
    @Override
    public int search(int[] array, int key) {
        return this.binary_search(array, key);
    }
}
