package Module19mergesort;

public class A6Quicksort {
    public static void printa(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int pivotidx = low;
        int smallercount = 0;
        for (int i = low + 1; i <= high; i++) {
            if (arr[i] <= pivot) {
                smallercount++;
            }
        }
        int correctIdx = pivotidx + smallercount;
        swap(arr, pivotidx, correctIdx);

        int i = low;
        int j = high;

        while (i<correctIdx && j>correctIdx) {
            if (arr[i] <= pivot) {
               i++; 
            }else if (arr[j]>pivot) {
                j--;
            }else if (arr[i] > pivot && arr[j] <= pivot) {
                swap(arr, i, j);
            }
        }
        return correctIdx;
    }

    public static void quicksort(int[] arr, int low, int high) {
        
        if(low >= high){
            return;
        }

        int idx = partition(arr, low, high);
        quicksort(arr, low, idx-1);
        quicksort(arr, idx+1, high);
    }

    public static void main(String[] args) {
        int[] arr = { 4, 9, 7, 1, 2, 3, 6, 5, 8 };
        int n = arr.length;
        System.out.println("Orignal arr");
        printa(arr);
        System.out.println("Answered arr");
        quicksort(arr, 0, n - 1);
        printa(arr);
    }
}
