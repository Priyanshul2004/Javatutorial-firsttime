package Module12Array;

public class A11secondmax {
    public static void main(String[] args) {
        int[] array = {3,4,5,6,7,8,77};

        int max = Integer.MIN_VALUE;
        for(int i=0; i<= array.length-1; i++){
           max = Math.max(max, array[i]);
        }

        int smax = Integer.MIN_VALUE;
        for(int i=0; i<=array.length-1; i++){
            if (array[i] != max) {
                smax = Math.max(smax, array[i]);
            }
        }
        System.out.println(max);
        System.out.println(smax);
    }
}
