package Sort;

import org.junit.jupiter.api.Test;

public class BubbleSortTest {
    @Test
    public void testBubbleSort() {
        BubbleSort sorter = new BubbleSort();
        SortTest sortTest = new SortTest();

        sortTest.testSort(sorter);
    }
}
