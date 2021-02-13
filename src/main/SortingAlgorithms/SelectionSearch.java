package main.SortingAlgorithms;

public class SelectionSearch implements BaseSort{
    private int[] selectionSearch(int[] array){
        int n = array.length;

        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (array[j] < array[min_idx])
                    min_idx = j;

            int min_value = array[min_idx];
            array[min_idx] = array[i];
            array[i] = min_value;
        }
        return array;
    }
    @Override
    public int[] sort(int[] array) {
        return selectionSearch(array);
    }
}
