package Sort;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortTest {
    public void testSort(Sort sorter) {

        // 테스트용 입력 배열 생성
        int[] inputArray = {64, 25, 12, 22, 11};

        // 정렬된 결과를 기대하는 배열 생성
        int[] expectedArray = {11, 12, 22, 25, 64};

        // 정렬
        int[] sortedArray = sorter.sort(inputArray);

        System.out.println("예상 결과 : " + Arrays.toString(expectedArray));
        System.out.println("실제 결과 : " + Arrays.toString(sortedArray));

        // 정렬된 배열과 예상 결과를 비교하여 테스트 수행
        assertArrayEquals(expectedArray, sortedArray);
    }
}
