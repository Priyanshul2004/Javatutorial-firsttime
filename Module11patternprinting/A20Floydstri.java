package Module11patternprinting;

public class A20Floydstri {
    public static void main(String[] args) {
        int n=4;
        int a=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i ;j++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
    }
}
