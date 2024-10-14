package Module16Sorting;

public class A12Sortingbynumberofindex {

    public static void print(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]*(-1)+" ");
        }
        System.out.println();
    }
        public static void main(String[] args) {
        int[] arr = {40,12,78,34,100,57,23};

        int n = arr.length;
        int x = 0;
        for(int i=0;i<n;i++){
            int min = Integer.MAX_VALUE;
            int midx = -1;
            for(int j=0;j<n;j++){
                if (arr[j] < min && arr[j]>0) {
                    min = arr[j];
                    midx = j;
                }
            }
            arr[midx] = x;
            x--;
        }
        print(arr);
    }
}

