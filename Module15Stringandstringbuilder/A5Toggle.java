package Module15Stringandstringbuilder;

public class A5Toggle {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("SahIl TiwArI");

        for (int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            int ascii = (int) ch;
            if (ascii >= 65 && ascii <= 90) {
                ascii += 32;
                ch = (char) ascii;
                sb.setCharAt(i, ch);
            }else{
                ascii -= 32;
                ch = (char) ascii;
                sb.setCharAt(i, ch);
            }
        }
        System.out.println(sb);
    }
}
