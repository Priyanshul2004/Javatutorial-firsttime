package A1Pratice;

public class P13arr {
    public static void main(String[] args) {
        int[] arr = {1,1,0,0,2,2,1,2,0,2,1,0};
        int n = arr.length-1;

        int zero = 0;
        int one = 0;
        int two = 0;

        for (int i = 0; i <= n; i++) {
            if (arr[i] == 0) {
                zero++;
            }else if (arr[i] == 1) {
                one++;
            }else if (arr[i] == 2) {
                two++;
            }
        }

        for (int i = 0; i <= n; i++) {
            if (i < zero) {
                arr[i] = 0;
            }else if (i < zero+one) {
                arr[i] = 1;
            }else if (i < zero+one+two) {
                arr[i] = 2;
            }
        }

        for (int i = 0; i <= n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
