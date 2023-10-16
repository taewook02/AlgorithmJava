package SortTest;

import Sort.MergeSort;
import Sort.SortTest;
import org.junit.jupiter.api.Test;

class MergeSortTest {
    @Test
    void testMergeSort() {
        MergeSort sorter = new MergeSort();
        SortTest sortTest = new SortTest();

        sortTest.testSort(sorter);
    }
}
