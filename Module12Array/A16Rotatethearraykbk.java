package Module12Array;

public class A16Rotatethearraykbk {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        int k = 2;

        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        int n = arr.length;
        int i = 0;
        int j = n-1;
        while (i<=j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        int a = 2;
        int b = n-1;

        while (a<=b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;

            a++;
            b--;
        }

        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        
    }
}
