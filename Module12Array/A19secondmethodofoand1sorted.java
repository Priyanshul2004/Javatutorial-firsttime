package Module12Array;

public class A19secondmethodofoand1sorted {
    public static void main(String[] args) {
        int[] arr = { 1,0, 0,1,1 };

        int i = 0;
        int n = arr.length - 1;
       
        while (i<n) {
            if (arr[i] == 1 && arr[n] == 0) {
                int temp = arr[i];
                arr[i] = arr[n];
                arr[n] = temp;
            }

            if (arr[i] == 0) {
                i++;
            }

            if (arr[n] == 1) {
                n--;
            }
        }

        for(int num: arr){
            System.out.print(num+" ");
        }
    }
}
