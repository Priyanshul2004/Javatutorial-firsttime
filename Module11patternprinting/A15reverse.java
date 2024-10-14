package Module11patternprinting;

public class A15reverse {
    public static void main(String[] args) {
        // for(int i=5; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(" *");
        //     }
        //     System.out.println();
        // }

        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n+1-i; j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
