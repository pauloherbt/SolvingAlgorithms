package recursiveSortAlgorithms;

public class QuickSort {
    public static int[] sort(int[] array) {
        quickSort(array,0, array.length-1);
        return array;

    }
    public static void quickSort(int[] array, int startIndex, int endIndex){
        int pivot = array[(endIndex+startIndex)/2];
        int leftIndex = startIndex;
        int rightIndex = endIndex;

        while (leftIndex <= rightIndex) {
            for (; array[leftIndex] < pivot;leftIndex++);
            for (; array[rightIndex] >pivot &&rightIndex>0; rightIndex--) ;
            if (leftIndex <= rightIndex) {
                int aux = array[rightIndex];
                array[rightIndex] = array[leftIndex];
                array[leftIndex] = aux;
                leftIndex++;
                rightIndex--;
            }
        }
        if(startIndex<rightIndex) quickSort(array,startIndex,rightIndex);
        if(leftIndex<endIndex) quickSort(array,leftIndex,endIndex);
    }
}
