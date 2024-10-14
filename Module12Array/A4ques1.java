package Module12Array;

public class A4ques1 {
    public static void main(String[] args) {
        int[] marks = {30,44,44,55,66,24,80,90};

        for(int i=0; i<= marks.length-1; i++){
            if (marks[i] < 35) {
                System.out.print(i+" ");
            }else{
                System.out.print("");
            }
        }
    }
}
