package Module17Binarysearch;

public class A1Binarysearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 55;

        boolean flag = false;
        int low = 0;
        int high = arr.length-1;

        while (low <= high) {
            int mid = ((low + high) / 2);
            if (arr[mid] == target) {
                flag = true;
                break;
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else if (target < arr[mid]) {
                high = mid - 1;
            }
        }

        if (flag == true) {
            System.out.println("Target found");
        } else {
            System.out.println("Target not found");
        }
    }
}
