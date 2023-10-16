package Sort;

import org.junit.jupiter.api.Test;

public class InsertionSortTest {
    @Test
    void testInsertionSort() {
        InsertionSort sorter = new InsertionSort();
        SortTest sortTest = new SortTest();

        sortTest.testSort(sorter);
    }
}
