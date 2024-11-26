package A1Pratice;

public class P11arr {

    public static void findDuplicates(int[] arr) {
        boolean duplicateFound = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    duplicateFound = true;
                }
            }
        }

        if (!duplicateFound) {
            System.out.print("No duplicates found");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 2, 5, 1, 2 };

        System.out.print("Duplicates: ");
        findDuplicates(arr);
    }
}
