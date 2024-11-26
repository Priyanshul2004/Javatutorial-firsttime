package Module20oopsbyyoutube;

public class A4basic4 {

    public static class Student {
        String name;
        int roll;
        final int schoolcode;
        // default constructor 
        public Student(){
            this.schoolcode = 222;
        }

        // constructor 
        public Student(String name , int roll){
            this.name = name;
            this.roll = roll;
            this.schoolcode = 222;
        }
    }
    public static void main(String[] args) {
        Student s1 = new Student("priyanshul", 33);
        System.out.println(s1.name);
    }
}
