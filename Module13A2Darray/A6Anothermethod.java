package Module13A2Darray;

public class A6Anothermethod {
    public static void main(String[] args) {
        int[][] arr = {{1,3,4},{4,5,6},{7,6,99}};

        int mx = Integer.MIN_VALUE;
        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<=arr[0].length-1;j++){
                mx = Math.max(mx, arr[i][j]);
            }
        }
        System.out.println(mx);
    }
}
