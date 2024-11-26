package A1Pratice;

public class P17arr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4, 5,6};
        
        int key = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                key++;
            }
        }
        System.out.println("Smallest missing positive integer: " + key);
    }
}
