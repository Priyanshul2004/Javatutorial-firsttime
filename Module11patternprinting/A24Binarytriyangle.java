package Module11patternprinting;

public class A24Binarytriyangle {
    public static void main(String[] args) {
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if (i%2 != 0) {
                    if (j%2 != 0) {
                        System.out.print("1");
                    }else{
                        System.out.print("0");
                    }
                }else{
                    if (i%2 == 0) {
                        if (j%2 == 0) {
                            System.out.print("1");
                        }else{
                            System.out.print("0");
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}