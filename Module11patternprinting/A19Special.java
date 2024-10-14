package Module11patternprinting;

public class A19Special {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                // formula 2*j-1
                System.out.print(" "+(2*j-1));
            }
            System.out.println();
        }
    }
}
