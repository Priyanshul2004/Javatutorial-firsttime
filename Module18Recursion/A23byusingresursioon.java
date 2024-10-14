package Module18Recursion;

public class A23byusingresursioon {
    public static int hcf(int a,int b){
        if (b%a == 0) {
            return a;
        }
        return hcf(b%a, a);
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 12;
        System.out.println(hcf(a,b));
    }
}
