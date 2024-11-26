package Module34dp2;

public class A3targetsum {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1};
        int target = 3;
        int result = findtargetsunways(arr, target);
        System.out.println("Number of ways to achieve the target sum: " + result);
    }
    public static int ways(int i,int[] arr,int target){
        if (i==arr.length) {
            if (target == 0) {
                return 1;
            }else{
                return 0;
            }
        }
        int add = ways(i+1, arr, target-arr[i]);
        int sub = ways(i+1, arr, target+arr[i]);
        return add+sub;
    }
    public static int findtargetsunways(int[] arr,int target){
        return  ways(0, arr, target);
    }
}