package Module15Stringandstringbuilder;

import java.lang.reflect.Array;
import java.util.Arrays;

public class A11Validanagram {
    public static void main(String[] args) {
        String st1 = "anagram";
        String st2 = "nagrama";

        int n = st1.length();
        int m = st2.length();

        for(int i=0; i<n; i++){
            if (n != m) {
                System.out.println("NOT valid anagram ");
                break;
            }else{
                char[] ch1 = st1.toCharArray();
                char[] ch2 = st2.toCharArray();

                Arrays.sort(ch1);
                Arrays.sort(ch2);

                if (Arrays.equals(ch1, ch2)) {
                    System.out.println("valid anagram");
                    break;
                }else{
                    System.out.println("NOT VALID ANAGRAM");
                    break;
                }
                
            }
        }
    }
}
