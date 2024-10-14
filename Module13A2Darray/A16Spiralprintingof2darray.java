package Module13A2Darray;

public class A16Spiralprintingof2darray {

    public static void print(int[][] a) {
        int n = a.length;
        int m = a[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        int n = a.length;
        int m = a[0].length;

        int minr = 0;
        int maxr = n - 1;
        int minc = 0;
        int maxc = m - 1;

        print(a);
        System.out.println();

        while (minr <= maxr && minc <= maxc) {

            for (int j = minc; j <= maxc; j++) {
                System.out.print(a[minr][j] + " ");
            }
            minr++;

            if(minr > maxr || minc > maxc) break;
            for (int i = minr; i <= maxr; i++) {
                System.out.print(a[i][maxc] + " ");

            }
            maxc--;

            if(minr > maxr || minc > maxc) break;
            for (int j = maxc; j >= minc; j--) {
                System.out.print(a[maxr][j] + " ");

            }
            maxr--;

            if(minr > maxr || minc > maxc) break;
            for (int i = maxr; i >= minr; i--) {
                System.out.print(a[i][minc] + " ");

            }
            minc++;
        }
    }
}
