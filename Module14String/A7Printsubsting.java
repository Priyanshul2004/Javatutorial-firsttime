package Module14String;

public class A7Printsubsting {
    public static void main(String[] args) {
        String str = "abcde";
        for (int i = 0; i <= str.length(); i++) {
            System.out.println(str.substring(0, i));
        }
    }
}