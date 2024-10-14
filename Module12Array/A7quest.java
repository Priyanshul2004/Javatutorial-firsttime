package Module12Array;

public class A7quest {
    //product od array
    public static void main(String[] args) {
        int[] array = {2,3,4};

        int product = 1;
        for(int i=0; i<= array.length-1; i++){
            product = product*array[i];
        }
        System.out.println(product);
    }
}
