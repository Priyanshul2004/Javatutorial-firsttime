package Module18Recursion;

public class A14arraytravelial {
    public static void printa(int i, int[] arr){
        if (i==arr.length) {
           return; 
        }
        System.out.println(arr[i]+" ");
        printa(i+1, arr);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,55,6,77,8,9};
        printa(1,arr);
        System.out.println("second");
        int[] arr2 = {2,3,8,4,4,4,4,4,4};
        printa(1, arr2);
    }
}
