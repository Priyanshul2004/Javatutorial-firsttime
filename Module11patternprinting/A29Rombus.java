package Module11patternprinting;

public class A29Rombus {
    public static void main(String[] args) {
        int n=7;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" "+" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
