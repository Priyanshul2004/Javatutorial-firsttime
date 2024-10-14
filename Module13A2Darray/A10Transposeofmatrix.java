package Module13A2Darray;

public class A10Transposeofmatrix {
    public static void main(String[] args) {
        int[][] a = { { 3, 5, 7 }, { 1, 2, 4 } };
        int n = a.length;
        int m = a[0].length;

        int[][] c = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }
    }
}
