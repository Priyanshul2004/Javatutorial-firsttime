package Module16Sorting;

public class A5optimizedA4 {
    public static void main(String[] args) {
        int[] nums = { 3, 4, 20, 7, 0, 9, 0, 0, 04, 0 };

        int noz = 0;

        for (int ele : nums) {
            if (ele == 0) {
                noz++;
            }
        }

        for (int x = 0; x < noz; x++) {
            for (int i = 0; i < nums.length - 1 - x ; i++) {
                if (nums[i] == 0) {
                    int temp = nums[i+1];
                    nums[i+1] = nums[i];
                    nums[i] = temp;
                }
            }
        }

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
