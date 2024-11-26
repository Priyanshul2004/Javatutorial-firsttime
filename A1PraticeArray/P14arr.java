package A1Pratice;

public class P14arr {
    public static void main(String[] args) {
        int[] a = { 2, 34, 55, 67, 68 };
        int[] b = { 3, 44, 55, 57 };
        int[] c = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] > b[j]) {
                c[k] = b[j];
                k++;
                k++;
            } else {
                c[k] = a[i];
                k++;
                i++;
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
                k++;
                i++;
            }
        }

        for (int k2 = 0; k2 < c.length; k2++) {
            System.out.println(c[k2] + " ");
        }
    }
}
