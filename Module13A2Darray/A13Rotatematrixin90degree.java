package Module13A2Darray;

public class A13Rotatematrixin90degree {

    public static void print(int[][] a) {
        int n = a.length;
        int m = a[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[][] a = { { 3, 5, 7 }, { 1, 2, 4 }, { 7, 9, 8 } };
        int n = a.length;

        print(a);

        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= i; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        print(a);

        for (int i = 0; i < a.length; i++) {
            int ab = 0;
            int b = n - 1;

            while (ab < b) {
                int temp = a[i][ab];
                a[i][ab] = a[i][b];
                a[i][b] = temp;
                ab++;
                b--;
            }
        }

        print(a);
    }
}
