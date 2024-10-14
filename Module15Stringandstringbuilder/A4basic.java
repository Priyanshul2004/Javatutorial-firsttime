package Module15Stringandstringbuilder;
import java.util.*;

public class A4basic {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Priyanshul");
        System.out.println(sb);
        StringBuilder x = new StringBuilder("x");
        System.out.println(x);
        StringBuilder y = new StringBuilder("");
        System.out.println(y.capacity());
        System.out.println(sb.length());
        System.out.println(sb.equals(y));
        System.out.println(sb.reverse());

        Scanner sc = new Scanner(System.in);
        System.out.println("PUT THE INPUT ");
        StringBuilder sct = new StringBuilder(sc.nextLine());
        System.out.println(sct);
        
        StringBuilder str = new StringBuilder("Heloji");
        str.setCharAt(2, 'k');
        System.out.println(str);
    }
}
