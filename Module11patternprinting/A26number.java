package Module11patternprinting;

public class A26number {
    public static void main(String[] args) {
        int n=4;
        int a=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if (i+j >= n+1) {
                    System.out.print(a+" ");
                    a++;
                }else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }
}
