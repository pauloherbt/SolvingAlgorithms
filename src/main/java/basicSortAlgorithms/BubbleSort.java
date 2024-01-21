package basicSortAlgorithms;

public class BubbleSort {
    /*BubbleSort is the most basic Algorithm, all your cases are O(n²)*/
    public static int[] bubbleSort(int[] array){
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array.length-1;j++){
                boolean hasTrade = false;
                if(array[j]>array[j+1]){
                    int trade = array[j];
                    array[j]=array[j+1];
                    array[j+1]=trade;
                    hasTrade=true;
                }
                if (hasTrade) break;
            }
        }
        return array;
    }
}
