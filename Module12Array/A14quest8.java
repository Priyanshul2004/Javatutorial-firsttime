package Module12Array;

public class A14quest8 {
    public static void main(String[] args) {
        int[] arr = {3,0,8,5,4,9,2};
        int target = 9;

        for(int i=0; i<= arr.length-1; i++){
            for(int j=i+1; j<=arr.length-1; j++){
                if (arr[i]+arr[j] == target) {
                    System.out.println("["+arr[i]+" , "+arr[j]+"]");
                }
            }
        }

    }
}
