package Module8Condition;
import java.util.*;

public class A11gradeofstudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the percentage of student = ");
        int per = sc.nextInt();
        if (per >= 80 && per <= 100) {
            System.out.println("Very good");
        }else if (per >= 60 && per <= 80) {
            System.out.println("good marks");
        }else if (per >= 40 && per <= 60) {
            System.out.println("Average marks");
        }else{
            System.out.println("Fail");
        }
    }
}
