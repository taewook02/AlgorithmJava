package Sort;

public class InsertionSort implements Sort {
    @Override
    public int[] sort(int[] arr) {
        int[] a = arr.clone();
        int n = a.length;

        for (int i = 1; i <= n - 1; i++) {
            int loc = i - 1;
            int newItem = a[i];
            while (loc >= 0 && newItem < a[loc]) {
                a[loc + 1] = a[loc];
                loc--;
            }
            a[loc + 1] = newItem;
        }

        return a;
    }
}
