package A1Pratice;

public class P16arr {
    public static void main(String[] args) {
        int[] arr = {8,2,4,95,88,44};

        int max = Integer.MIN_VALUE;
        int sndmax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        System.out.println("farst largest " + max);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < max) {
                sndmax = Math.max(sndmax, arr[i]);
            }
        }
        System.out.println("second largest "+sndmax);
    }
}
