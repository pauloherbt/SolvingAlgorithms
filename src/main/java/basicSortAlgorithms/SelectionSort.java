package basicSortAlgorithms;

public class SelectionSort {
    /* It consists in do partitions, which iterate in array
    to find the minimum element to trade with current element*/
    public static int[] sort(int[] array) {
        for (int i=0;i<array.length-1;i++) {
            /*find the minimum element*/
            int currentMin=i;
            for (int current=i+1;current<array.length;current++){
                if(array[currentMin]>array[current]){
                    currentMin=current;
                }
            }
            /*replace the current element with the minor element forming a partition sorted*/
            int trade = array[i];
            array[i]=array[currentMin];
            array[currentMin] = trade;
        }
        return array;
    }
}
