
// isko asse se krna hai 
package Module15Stringandstringbuilder;

public class A14stringisisomorphicornot {
    public static void main(String[] args) {
        String s = "mod";
        String t = "abcd";

       
        if (s.length() != t.length()) {
            System.out.println("Not valid");
            return; 
        }

        char[] a = new char[128]; 
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            char dh = t.charAt(i);
            int idx = (int) ch;

            if (a[idx] == '\0') { 
                a[idx] = dh; 
            } else {
                if (a[idx] != dh) { 
                    System.out.println("Not valid");
                    return; 
                }
            }
        }

        char[] b = new char[128]; 
        for (int i = 0; i < t.length(); i++) {
            char ch = s.charAt(i);  
            char dh = t.charAt(i);  
            int idx = (int) dh;  

            if (b[idx] == '\0') {
                b[idx] = ch;  
            } else {
                if (b[idx] != ch) {  
                    System.out.println("Not valid");
                    return; 
                }
            }
        }

        System.out.println("Valid isomorphic strings");
    }
}

