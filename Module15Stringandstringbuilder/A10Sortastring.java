package Module15Stringandstringbuilder;
import java.lang.reflect.Array;

import java.util.*;
public class A10Sortastring {
    public static void main(String[] args) {
        String s = "sahil";
        char[] ch = s.toCharArray();

        for(char eleL:ch){
            System.out.print(eleL);
        }

        System.out.println();
        Arrays.sort(ch);
        System.out.println(ch);

        StringBuilder sb = new StringBuilder("dca");
        char[] ch2 = sb.toString().toCharArray();
        
        Arrays.sort(ch2);
        System.out.println(ch2);
    }
}