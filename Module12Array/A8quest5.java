package Module12Array;
import java.util.*;

public class A8quest5 {
    public static void main(String[] args) {
        // Linear search
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.print("Enter the values of array : ");
        for(int i=0; i<= array.length-1; i++){
            array[i] = sc.nextInt();
        }

        System.out.print("Enter the value for search x : ");
        int x = sc.nextInt();

        boolean flag = false;

        for(int i=0; i<= array.length-1; i++){
            if (array[i] == x){
                 flag = true;
                 break;
            }
        }
        if (flag == true) {
            System.out.println("Element found ");
        }else{
            System.out.println("Element Not Found ");
        }
    }
}
