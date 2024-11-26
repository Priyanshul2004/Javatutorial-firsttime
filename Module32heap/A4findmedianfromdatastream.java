package Module32heap;

import java.util.ArrayList;
import java.util.Collections;

public class A4findmedianfromdatastream {

    public static void main(String[] args) {
        addnum(1);
        addnum(3);
        System.out.println("Median: " + findmedian()); 

        addnum(2);
        System.out.println("Median: " + findmedian()); 
        addnum(5);
        addnum(4);
        System.out.println("Median: " + findmedian()); 
    }

    static ArrayList<Integer> arr = new ArrayList<>();

    public static void addnum(int num) {
        arr.add(num);
    }

    public static double findmedian() {
        Collections.sort(arr);
        int n = arr.size();
        if (n % 2 != 0) {
            return arr.get(n / 2); 
        } else {
            return (arr.get(n / 2) + arr.get(n / 2 - 1)) / 2.0;
        }
    }
}
