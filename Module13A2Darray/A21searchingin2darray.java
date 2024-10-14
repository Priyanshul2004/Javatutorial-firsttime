package Module13A2Darray;

public class A21searchingin2darray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int target = 5;
        int n = arr.length;
        int m = arr[0].length;

        boolean found = false;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == target) {
                    found = true;
                    break;
                }else{
                    found = false;
                    break;
                }
            }
        }

        if (found == true) {
            System.out.println("Target found ");
        }else{
            System.out.println("Target not found ");
        }
    }
}
