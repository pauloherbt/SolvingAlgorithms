package basicSortAlgorithms;

public class InsertionSort {
    /*insertion sort works from left to right,
     comparing the element with the left item, after place it on its right position*/
    public static int[] insertionSort(int[] array){
        for(int i=1,aux=i;i<array.length;i++,aux=i){
            while(aux>0 && array[aux]<array[aux-1] ){
                int trade = array[aux-1];
                array[aux-1]= array[aux];
                array[aux] = trade;
                aux--;
            }
        }
        return array;
    }
    /* the average and worst case your complexity is O(n²) but in your best case is O(n)
        which the array is already sorted*/
}
