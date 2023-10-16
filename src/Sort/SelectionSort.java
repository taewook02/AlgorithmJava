package Sort;

public class SelectionSort implements Sort {
    @Override
    public int[] sort(int[] arr) {
        int[] a = arr.clone();
        int n = a.length;

        for (int i = n - 1; i >= 1; i--) {
            int maxIndex = findMax(a, i);
            changeElement(a, i, maxIndex);
        }

        return a;
    }

    private int findMax(int[] arr, int endIndex) {
        int maxIndex = 0;
        for (int i = 1; i <= endIndex; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private void changeElement(int[] arr, int indexA, int indexB) {
        int tmp = arr[indexB];
        arr[indexB] = arr[indexA];
        arr[indexA] = tmp;
    }
}
