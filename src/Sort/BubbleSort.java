package Sort;

public class BubbleSort implements Sort {
    @Override
    public int[] sort(int[] arr) {
        int[] a = arr.clone();
        int n = a.length;

        for (int i = n - 1; i >= 1; i--) {
            for (int j = 0; j <= i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    changeElement(a, j, j + 1);
                }
            }
        }

        return a;
    }

    private void changeElement(int[] arr, int indexA, int indexB) {
        int tmp = arr[indexB];
        arr[indexB] = arr[indexA];
        arr[indexA] = tmp;
    }
}
