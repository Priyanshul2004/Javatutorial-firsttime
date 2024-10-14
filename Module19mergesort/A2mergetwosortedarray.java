package Module19mergesort;

public class A2mergetwosortedarray {
    public static void printans(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static void merged(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;

        while (i<a.length && j<b.length) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                i++;
                k++;
            }else{
                c[k] = b[j];
                j++;
                k++;
            }
        }
        if (i==a.length) {
            while (j<b.length) {
                c[k++] = b[j++];
            }
        }
        if (j==b.length) {
            while (i<a.length) {
                c[k++] = a[i++];
            }
        }
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        int[] b = { 4, 5, 6 };

        printans(a);
        printans(b);

        int[] c = new int[a.length + b.length];
        merged(a, b, c);

        printans(c);
    }
}
