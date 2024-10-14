package Module17Binarysearch;

public class A6ByusingBinarysearchA5 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 4, 3, 2, 1 };

        int n = arr.length;
        int low = 1;
        int high = n - 2;
        
        int idx = -1;
        while (low <= high) {
            int mid = ((low + high) / 2);

            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                idx = mid;
                break;
            }else if (arr[mid] > arr[mid-1] && arr[mid] < arr[mid+1]) {
                low = mid+1;
            }else if (arr[mid] < arr[mid-1] && arr[mid] > arr[mid+1]) {
                high = mid-1;
            }
        }

        System.out.println("This is peak : "+idx);
    }
}
