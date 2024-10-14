package Module9Loops;

public class A11Gpquest {
    public static void main(String[] args) {
        //1,2,4,8,16....
        int n = 9;
        int a = 1;
        int d = 2;
        for(int i=1; i<=n ;i++){
            System.out.println(a);
            a = a*2;
        }
    }
}
