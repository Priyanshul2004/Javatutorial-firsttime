package Module16Sorting;

import java.util.*;

public class A4pushZeroattheend {
    public static void main(String[] args) {
        int[] nums = {3,4,20,7,0,9,0,0,04,0};
        ArrayList<Integer> arr = new ArrayList<>();

        int noz = 0;

        for(int ele : nums){
            if (ele != 0) {
                arr.add(ele);
            }else{
                noz++;
            }
        }

        for(int i=1; i<=noz;i++){
            arr.add(0);
        }

        for(int i=0; i<nums.length;i++){
            nums[i] = arr.get(i);
        }

        System.out.println("ZERO ADDED IN LAST");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
