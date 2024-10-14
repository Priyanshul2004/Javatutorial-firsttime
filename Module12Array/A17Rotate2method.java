package Module12Array;

public class A17Rotate2method {
    public static void reverse(int[] nums, int i, int j){
        while (i<=j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;

            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8};
        int n = nums.length;
        int k = 2;
        k = k%n;

        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
