package Module33DP;

public class A13countsquaresubmatriceswithallones {
    public static void main(String[] args) {
        int[][] arr = {
            {1, 1, 1},
            {1, 1, 1},
            {1, 1, 1}
        };
        int result = countsqures(arr);
        System.out.println("Total square submatrices with all ones: " + result);
    }
    public static int countsqures(int[][] arr){
        int m = arr.length, n = arr[0].length,count =0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if (arr[i][j]==0) {
                    continue;
                }
                if (i>0 && j>0) {
                    arr[i][j] += min(arr[i-1][j],arr[i][j-1],arr[i-1][j-1]);
                }
                count += arr[i][j];
            }
        }
        return count;
    }
    public static int min(int a,int b,int c){
        return Math.min(a, Math.min(b, c));
    }
}