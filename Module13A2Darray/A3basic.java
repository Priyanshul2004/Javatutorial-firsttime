package Module13A2Darray;

public class A3basic {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}};

        int n= arr.length;
        System.out.println(n);
        int m = arr[1].length;
        System.out.println(m);
        for(int i=0; i<=arr.length-1; i++){
            for(int j=0; j<=arr.length-1; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
