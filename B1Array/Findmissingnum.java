package B1Array;

public class Findmissingnum {
    public static void main(String[] args) {
        int[] arr = {3,0,1};

        int expectedsum = 0;
        for (int i = 0; i < arr.length; i++) {
            expectedsum = expectedsum+i;
        }

        int actualsum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualsum = actualsum+arr[i];
        }

        int missingnum = actualsum-expectedsum;
        System.out.println(missingnum);
    }
}