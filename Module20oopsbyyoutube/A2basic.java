package Module20oopsbyyoutube;

public class A2basic {

    public static class Student {
        String name;
    }

    public static void fun1(Student s){
          s.name = "priyanshul";
    }
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "priyanshul";
        System.out.println();
        // class are passed by refferance 
        fun1(s1);
        System.out.println(s1.name);
    }
}
