package Module12Array;

public class A9Maxelement {
    public static void main(String[] args) {
        int[] array = {3,4,5,6,7,8,77};

        int max = array[0];
        for(int i=0; i<= array.length-1; i++){
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max+" Is grater in the array ");
    }
}
