import Sort.BubbleSort;
import Sort.SelectionSort;
import Sort.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sort selectionSort = new SelectionSort();
        Sort bubbleSort = new BubbleSort();

        int[] arr = {7, 4, 3, 9, 1, 6, 10, 2, 5, 8};

        printResult("원본 배열", arr);
        printResult("선택 정렬", selectionSort.sort(arr));
        printResult("버블 정렬", bubbleSort.sort(arr));
    }

    private static void printResult(String name, int[] arr) {
        System.out.println(name + " : " + Arrays.toString(arr));
    }
}
