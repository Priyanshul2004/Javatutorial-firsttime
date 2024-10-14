package Module12Array;

public class A22Mergetwosortedarray {
    public static void main(String[] args) {
        int[] a = { 2, 34, 55, 67, 68 };
        int[] b = { 3, 44,55, 57 };
        int[] c = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k] = a[i];
                i++;
                k++;
            } else {
                c[k] = b[j];
                j++;
                k++;
            }
        }
        if (i == a.length) {
            while (j < b.length) {
                c[k] = b[j];
                k++;
                j++;
            }
        } 
        if (j == b.length) {
            while (i < a.length) {
                c[k] = a[i];
                i++;
                k++;
            }
        }

        for (int num : c) {
            System.out.print(num + " ");
        }
    }
}
