package Module17Binarysearch;

public class A9secondmethodofA8 {
    public static void main(String[] args) {
        int[] arr = { 7, 8, 9, 1, 2, 3, 4, 5, 6 };

        int n = arr.length - 1;
        int low = 0;
        int high = n - 1;
        int target = 5;

        boolean flag = false;
        while (low <= high) {
            int mid = ((low + high) / 2);
            if (arr[mid] == target) {
                flag = true;
                break;
            } else if (arr[mid] <= arr[high]) {
                if (arr[mid] <= target && target <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } else if (arr[mid] > arr[high]) {
                if (arr[mid] <= target && target <= arr[mid]) {
                    low = mid+1;
                }
            }
        }
        if (flag == true) {
            System.out.println("FOund");
        }else{
            System.out.println("not found");
        }
    }
}
