package Module12Array;

public class A6quest4 {
    public static void main(String[] args) {
        // sum of array
        int[] array = {3,4,3,5,6};

        int sum = 0;
        for(int i=0; i<= array.length-1; i++){
            sum = sum+array[i];  
        }
        System.out.println(sum);
    }
}
