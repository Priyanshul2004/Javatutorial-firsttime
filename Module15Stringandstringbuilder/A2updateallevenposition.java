package Module15Stringandstringbuilder;

public class A2updateallevenposition {
    public static void main(String[] args) {
        String str = "Physic wallah skill";

        String newstr = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                newstr += 'a';
            } else {
                newstr += str.charAt(i);
            }
        }
        str = newstr;
        System.out.println(str);
    }
}
