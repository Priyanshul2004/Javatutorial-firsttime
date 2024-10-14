package Module9Loops;

public class A4divisivalby3and5 {
    public static void main(String[] args) {
        int n = 100;
        for(int i=1 ;i<=n; i++){
            if ((i%3) ==0 || (i%5) == 0) {
                System.out.println(i);
            }
        }
    }
}
