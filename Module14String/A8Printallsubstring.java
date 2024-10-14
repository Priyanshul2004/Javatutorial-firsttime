package Module14String;

public class A8Printallsubstring {
    public static void main(String[] args) {
        String str = "abcde";
        for (int i = 0; i <= str.length()-1; i++) {
            for(int j=i+1 ; j<= str.length()-1;j++){
                System.out.println(str.substring(i, j));
            }
        }
    }
}
