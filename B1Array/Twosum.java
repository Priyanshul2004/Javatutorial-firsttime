package B1Array;

public class Twosum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4};

        int target = 8;

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j] == target) {
                    System.out.println("index is "+i+","+j);
                }
            }
        }
    }
}
