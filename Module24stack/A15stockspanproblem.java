package Module24stack;
import java.util.Arrays;

public class A15stockspanproblem {

    public static void calculatespan(int[] prize , int n , int[] s){
        s[0] = 1;
        for(int i=1;i<n;i++){
            s[i] = 1;
            for(int j =i-1; j>= 0 && (prize[i]>= prize[j] );j--){
                s[i]++;
            }
        }
    }

    public static void printArray(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] prize = {10,4,5,90,120,80};
        int n = prize.length;
        int s[] = new int[n];

        calculatespan(prize,n,s);
        printArray(s);
    }
}
