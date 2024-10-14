package Module12Array.Arraylist;
import java.util.*;

public class A1basic {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(6);
        arr.add(0,10);
        arr.add(1,20);
        arr.add(2,30);
        arr.add(3,40);
        arr.add(4,50);
        arr.add(5,60);
        System.out.println(arr.get(0));
        for(int i=0;i<=arr.size()-1; i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();
        System.out.println(arr);
        System.out.println();
        arr.set(2, 44);
        System.out.print(arr);
        arr.add(6,99);
        System.out.println();
        System.out.print(arr);
        System.out.println();
        System.out.println(arr.size());
        arr.remove(0);
        System.out.println(arr);
    }
}
