package A1PraticeArray;

public class A21arr {
    public static void main(String[] args) {
        int[] arr = {3,2,1,2,3};
        int n = arr.length-1;

        boolean palindrom = false;

        for (int i = 0; i <= n; i++) {
            if (arr[i] == arr[n]) {
                palindrom = true;
            }
            n--;
        }

        if (palindrom == true) {
            System.out.println("palindrom");
        }else{
            System.out.println("not palindrom");
        }
    }
}
