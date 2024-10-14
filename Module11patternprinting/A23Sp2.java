package Module11patternprinting;

public class A23Sp2 {
    public static void main(String[] args) {
        int n=11;
        int mid = (n/2)+1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if (j == i || i+j == n+1) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
