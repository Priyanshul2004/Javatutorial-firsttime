package A1Pratice;

public class UniqueNumberFinder {
    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};

        for (int i = 0; i < arr.length; i++) {
            boolean foundDuplicate = false;

            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    foundDuplicate = true;
                    break; 
                }
            }

            if (!foundDuplicate) {
                System.out.println("The unique number is: " + arr[i]);
                return; 
            }
        }
        System.out.println("No unique number found."); 
    }
}
