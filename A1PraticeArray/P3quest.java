package A1Pratice;

public class P3quest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int l = arr.length-1;

        for (int i = 0; i < l; i++) {
            int temp = arr[i];
            arr[i] = arr[l];
            arr[l] = temp;
            l--;
        }
        System.out.println("Orignal Answer");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
