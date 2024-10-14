package Module14String;

import java.util.Scanner;

public class A3countvovels {

    public static boolean isVovel(char ch){
       if (ch == 'a' || ch == 'A') return true;
       if (ch == 'e' || ch == 'E') return true;
       if (ch == 'i' || ch == 'I') return true;
       if (ch == 'o' || ch == 'O') return true;
       if (ch == 'u' || ch == 'U') return true;
       return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string = ");
        String str = sc.nextLine();
        
        int count = 0;
        for(int i=0;i<str.length()-1;i++){
          char ch = str.charAt(i);
          if (isVovel(ch) == true) {
            count++;
          }
        }
        System.out.println("Total num of vovel = "+count);
        
    }
}
