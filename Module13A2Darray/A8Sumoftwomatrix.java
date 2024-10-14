package Module13A2Darray;

public class A8Sumoftwomatrix {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{1,2,3},{1,2,3}};
        int[][] b = {{1,2,3},{1,2,3},{1,2,3}};
        int n = a.length;
        int m = b[0].length;

        int[][] c = new int[n][m];
        
        for(int i=0; i<=n-1;i++){
            for(int j=0;j<=m-1;j++){
                c[i][j] = a[i][j]+b[i][j];
            }
        }

         System.out.println();

        for(int i=0; i<=c.length-1;i++){
            for(int j=0;j<=c[0].length-1;j++){
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
