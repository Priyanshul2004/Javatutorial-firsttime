package Module13A2Darray;

public class A9anothermethodofA8 {
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{1,2,3},{1,2,3}};
        int[][] b = {{1,2,3},{1,2,3},{1,2,3}};
        int n = a.length;
        int m = b[0].length;

        for(int i=0; i<=n-1; i++){
            for(int j=0; j<=m-1; j++){
                a[i][j] = a[i][j]+b[i][j];
            }
        }
        System.out.println();

        for(int i=0; i<=a.length-1;i++){
            for(int j=0;j<=a[0].length-1;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
