package Module18Recursion;
// hcf
public class A21Greatestcommendivisior {
    public static int hcf(int a,int b){
        for(int i=Math.min(a, b);i>=1;i--){
            if (a%i == 0 && b%i == 0) {
                return i;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 12;
        System.out.println(hcf(a,b));
    }
}
