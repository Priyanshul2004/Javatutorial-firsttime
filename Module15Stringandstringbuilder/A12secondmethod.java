package Module15Stringandstringbuilder;

import java.util.Arrays;

public class A12secondmethod {
    public static void main(String[] args) {
        String st1 = "anagram";
        String st2 = "nagrama";

        int n = st1.length();
        int m = st2.length();
        if (n != m) {
            System.out.println("NOT VALID");  
        }

        char[] ch1 = st1.toCharArray();
        char[] ch2 = st2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for(int i=0;i<n;i++){
            if (ch1[i] != ch2[i]) {
                System.out.println("NOT VALID");
                break;
            }else{
                System.out.println("VALID ANAGRAM");
                break;
            }
        }

    }
}
