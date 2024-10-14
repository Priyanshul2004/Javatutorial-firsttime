package Module11patternprinting;

public class A7Abcd {
    public static void main(String[] args) {
        int n = 5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print((char)(i+64)+" ");
                // 96 for small latter
            }
            System.out.println();
        }
    }
}
