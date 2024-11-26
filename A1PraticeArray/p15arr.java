package A1Pratice;

public class p15arr {
    public static void main(String[] args) {
        int[] a = { 2, 34, 55, 67, 68 };
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= a.length-1; i++) {
            max = Math.max(max, a[i]);
        }
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < max) {
                secondMax = Math.max(secondMax, a[i]);
            }
        }
        System.out.println(max);
        System.out.println(secondMax);
    }
}
