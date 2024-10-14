package Module13A2Darray;

public class A5Largestelementin2darray {
    public static void main(String[] args) {
        int[][] arr = {{1,3,4},{4,5,6},{7,6,99}};

        int grater = Integer.MIN_VALUE;
        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<=arr[0].length-1;j++){
                if (arr[i][j] > grater) {
                    grater = arr[i][j];
                }
            }
        }
        System.out.println(grater);
    }
}
