package Module13A2Darray;

public class A22Searchingin2darrayanothermethod {
    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int target = 5;
        int n = arr.length;
        int m = arr[0].length;

        int i = 0;
        int j = m - 1;

        boolean found = false;

        while (i <= n && j >= m) {
            if (arr[i][j] == target) {
                found = true;
            } else if (arr[i][j] > target) {
                j--;
            } else {
                i++;
            }
        }
        found = true;

        if (found == true) {
            System.out.println("Target found ");
        }else{
            System.out.println("Target not found ");
        }
    }
}
