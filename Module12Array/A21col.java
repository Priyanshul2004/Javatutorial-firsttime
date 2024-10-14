package Module12Array;

public class A21col {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 1, 2, 1, 2, 0, 0, 2, 1 };
        int n = arr.length;
        int mid = 0;
        int hi = n - 1;
        int lo = 0;

        while (mid <= hi) {
            if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[lo];
                arr[lo] = temp;
                lo++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            }else{
                int temp = arr[mid];
                arr[mid] = arr[hi];
                arr[hi] = temp;
                hi--;
            }
        }

        for(int num: arr){
            System.out.print(num+" ");
        }

    }
}
