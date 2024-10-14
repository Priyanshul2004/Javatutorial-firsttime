package Module15Stringandstringbuilder;
import java.util.*;
public class A8Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("GIVE ME YOUR NAME = ");
        StringBuilder sb = new StringBuilder(sc.nextLine());

        int n = sb.length();
        for(int i=0;i<n/2;i++){

            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(n - i - 1));
            sb.setCharAt(n - i - 1, temp);
        }

        System.out.println(sb);
    }
}
