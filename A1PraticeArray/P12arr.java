package A1Pratice;
import java.util.*;
public class P12arr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int key = 6;

        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                flag = true;
            }
        }
        if (flag == true ) {
            System.out.println("Found");
        }else{
            System.out.println("not found ");
        }
    }
}
