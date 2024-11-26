package Module31heap;

import java.util.ArrayList;
import java.util.Collections;

public class A11aAlaststoneweight {
    public static void main(String[] args) {
        int[] stones = {2, 7, 4, 1, 8, 1};
        System.out.println(laststoneweight(stones));
    }
    public static int laststoneweight(int[] stone){
        ArrayList <Integer> arr = new ArrayList<>();
        for(int ele:stone){
            arr.add(ele);
        }
        while (arr.size()>1) {
            Collections.sort(arr);
            int y = arr.remove(arr.size()-1);
            int x = arr.remove(arr.size()-1);
            if (y!=x) {
                arr.add(y-x);
            }
        }
        if (arr.size() == 0) {
            return 0;
        }else{
            return arr.get(0);
        }
    }
}
