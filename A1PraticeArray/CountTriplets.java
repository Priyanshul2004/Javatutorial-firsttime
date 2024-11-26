public class CountTriplets {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5}; 
        int x = 6; 
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == x) {
                        count++;
                    }
                }
            }
        }

        System.out.println("Number of triplets: " + count); 
    }
}
