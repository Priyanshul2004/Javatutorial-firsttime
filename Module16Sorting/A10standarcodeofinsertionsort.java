package Module16Sorting;

public class A10standarcodeofinsertionsort {

    public static void swap(int[] arr , int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = { 3, 4, 20, 7, -9, 9, 8 }; 
        int n = arr.length;

        System.out.println("Before sorting ");
        print(arr);

        for(int i=0;i<n;i++){
            int j = i;
            while (j>=1 && arr[j] < arr[j-1]) {
                swap(arr, j, j-1);
                j--;
            }
        }

        System.out.println("After sorting");
        print(arr);
    }
}