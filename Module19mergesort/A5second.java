package Module19mergesort;

public class A5second {

    public static int count = 0;

    public static void printa(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
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

    public static void inversion(int[] a,int[] b){
        int i = 0;
        int j =0;
        while (i<a.length && j<b.length) {
            if (a[i]>b[j]) {
                count += (a.length-1);
                j++;
            }else{
                i++;
            }
        }
    }

    public static void mergesort(int[] arr){
        int n = arr.length;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];

        if (n==1) {
            return;
        }

        for (int i = 0; i < n/2; i++) {
            a[i] = arr[i];
        }
        for (int i = 0; i < n-n/2; i++) {
            b[i] = arr[i+n/2];
        }

        mergesort(a);
        mergesort(b);
        inversion(a,b);
        merged(a, b, arr);

    }
    public static void main(String[] args) {
        int[] arr = { 80, 39, 30, 40, 10, 20, 60, 45, 90 };
        printa(arr);

        mergesort(arr);

        System.out.println("Sorted array:");
        printa(arr);
        System.out.println(count);
    }
}
