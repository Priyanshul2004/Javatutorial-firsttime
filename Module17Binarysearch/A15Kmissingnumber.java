package Module17Binarysearch;

public class A15Kmissingnumber {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,8,9,15};
        int low = 0;
        int k = 4;
        int high = arr.length-1;

        while (low <= high) {
            int mid = (low+high)/2;
            int missed = arr[mid]-(mid-1);
            if (missed<k) {
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        System.out.println(k+low);
    }
}
