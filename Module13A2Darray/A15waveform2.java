package Module13A2Darray;

public class A15waveform2 {

    public static void print(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] a = { { 3, 5, 7 }, { 1, 2, 4 }, { 7, 9, 8 } };
        int n = a.length;
        int m = a[0].length;

        print(a);
        System.out.println();
        
        for (int i = 0; i<n; i++) {
            if (i%2 != 0) {
                for (int j = 0; j < m; j++) {
                    System.out.print(a[i][j]);
                }
            }else{
                for (int j = m-1; j >= 0; j--) {
                    System.out.print(a[i][j]);
                }
            }
        }
    }
}
