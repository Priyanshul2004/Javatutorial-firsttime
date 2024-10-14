package Module17Binarysearch;

public class A8Searchinroaratedsortedarray {

    public static void binrarysearch(int[] arr, int target, int low, int high) {
        boolean flag = false;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                flag = true;
                break;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (flag) {
            System.out.println("Target " + target + " found");
        } else {
            System.out.println("Target " + target + " not found");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 6, 7, 0, 1, 2 };

        int n = arr.length;
        int pivot = -1;

        int target = 7;

        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (mid > 0 && mid < n - 1) {
                if (arr[mid] > arr[mid + 1]) {
                    pivot = mid;
                    break;
                } else if (arr[mid] < arr[mid - 1]) {
                    pivot = mid - 1;
                    break;
                }
            } else if (mid == 0 && arr[mid] > arr[mid + 1]) {
                pivot = mid;
                break;
            } else if (mid == n - 1 && arr[mid] < arr[mid - 1]) {
                pivot = mid - 1;
                break;
            }

            if (arr[mid] >= arr[low]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (pivot == -1) {
            binrarysearch(arr, target, 0, n - 1);
        } else {
            if (target >= arr[0] && target <= arr[pivot]) {
                binrarysearch(arr, target, 0, pivot);
            } else {
                binrarysearch(arr, target, pivot + 1, n - 1);
            }
        }
    }
}
