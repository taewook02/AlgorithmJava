package Sort;

import org.junit.jupiter.api.Test;

public class SelectionSortTest {
    @Test
    public void testSelectionSort() {
        SelectionSort sorter = new SelectionSort();
        SortTest sortTest = new SortTest();

        sortTest.testSort(sorter);
    }
}
