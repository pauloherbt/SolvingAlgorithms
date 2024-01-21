import basicSortAlgorithms.BubbleSort;
import basicSortAlgorithms.InsertionSort;
import basicSortAlgorithms.SelectionSort;
import org.junit.Assert;
import org.junit.Test;
import java.util.*;

public class AlgorithmsTests {
    int[] arrayUnordered = {2,8,5,3,9,4};
    int[] arrayOrdered = {2,3,4,5,8,9};
    @Test
    public void insertionShouldSortArray(){
        Assert.assertArrayEquals(arrayOrdered,InsertionSort.insertionSort(arrayUnordered));
    }
    @Test
    public void bubbleSortShouldSortArray(){
        Assert.assertArrayEquals(arrayOrdered, BubbleSort.bubbleSort(arrayUnordered));
    }
    @Test
    public void SelectionSortShouldSortArray(){
        arrayUnordered = new int[]{2, 8, 5, 3, 9, 4,1};
        Assert.assertArrayEquals(new int[]{1,2,3,4,5,8,9},SelectionSort.sort(arrayUnordered));
    }

}
