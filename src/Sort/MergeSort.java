package Sort;

public class MergeSort implements Sort {
    private void mergeSort(int[] arr, int p, int r) {
        if (p < r) {
            int q = (p + r) / 2;
            mergeSort(arr, p, q);
            mergeSort(arr, q + 1, r);
            merge(arr, p, q, r);
        }
    }

    private void merge(int[] arr, int p, int q, int r) {
        int i = p;
        int j = q + 1;
        int t = 0;

        int[] tmp = arr.clone();

        while (i <= q && j <= r) {
            if (arr[i] < arr[j]) {
                tmp[t++] = arr[i++];
            } else {
                tmp[t++] = arr[j++];
            }
        }

        while (i <= q) {
            tmp[t++] = arr[i++];
        }

        while (j <= r) {
            tmp[t++] = arr[j++];
        }

        i = p;
        t = 0;
        while (i <= r) {
            arr[i++] = tmp[t++];
        }
    }

    @Override
    public int[] sort(int[] arr) {
        int[] a = arr.clone();
        int n = a.length;
        mergeSort(a, 0, n - 1);
        return a;
    }
}
