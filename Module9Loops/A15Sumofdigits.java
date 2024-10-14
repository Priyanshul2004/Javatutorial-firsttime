package Module9Loops;

public class A15Sumofdigits {
    public static void main(String[] args) {
        int n = 123;
        int sum = 0;
        while (n!=0) {
            int md = n%10;
            sum += md;
            n /= 10;
        }
        System.out.println(sum);
    }
}
