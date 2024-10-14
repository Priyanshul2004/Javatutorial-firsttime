package Module17Binarysearch;

public class A2Lowerbound {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        int n = arr.length;
        int target = 5;
        int lb = n;
        int low = 0;
        int high = n-1;

        while (low<=high) {
            int mid = ((low+high)/2);
            if (arr[mid]>=target) {
                lb = Math.min(lb, mid);
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        System.out.println(lb);
    }
}
