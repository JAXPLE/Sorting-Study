import sort.Sort;
import sort.SortingType;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] tempArray = {3,1,5,6,9,2,4};

        int[] bubbleSort = SortingType.BUBBLE.sort(tempArray);
        System.out.println(Arrays.toString(bubbleSort));

        int[] selectionSort = SortingType.SELECTION.sort(tempArray);
        System.out.println(Arrays.toString(selectionSort));

    }
}