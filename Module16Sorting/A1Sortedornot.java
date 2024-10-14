package Module16Sorting;

public class A1Sortedornot {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 4, 7, 2, 4, 66};

        boolean flag = false;
        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] > arr[i+1]) {
                flag = true;
                break;
            }
        }
        if (flag == true) {
            System.out.println("not sorted");
        }else{
            System.out.println("sorted");
        }
    }
}
