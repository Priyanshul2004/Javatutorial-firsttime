package Module18Recursion;
import java.util.Arrays;

public class A19subsetofarr {

    public static void printsubset(int i, int[] arr, int[] ans) {
        if (i == arr.length) {
            System.out.println(Arrays.toString(ans));
            return;
        }

        int num = arr[i];

        int[] newAnsWithNum = Arrays.copyOf(ans, ans.length + 1);
        newAnsWithNum[newAnsWithNum.length - 1] = num;

        printsubset(i + 1, arr, newAnsWithNum);
        printsubset(i + 1, arr, ans);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] ans = {};
        printsubset(0, arr, ans);
    }
}

