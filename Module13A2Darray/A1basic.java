package Module13A2Darray;

public class A1basic {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];
        arr[1][1] = 2;
        arr[0][1] = 3;
        System.out.println(arr[0][1]);
        for(int i=0; i<=arr.length-1; i++){
            for(int j=0; j<=arr.length-1; j++){
                System.out.print(arr[i][j]+" ");
            }
        }
    }
}
