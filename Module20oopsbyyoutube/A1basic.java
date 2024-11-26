package Module20oopsbyyoutube;

public class A1basic {

    // creating a new datatype 
    public static class Student {
        String name;
        int roll;
        double percent;
    }

    public static void main(String[] args) {

        // obj
        Student st = new Student();
        st.name = "priyanshul";
        st.roll = 232;
        st.percent = 44.5;
        System.out.println(st.name);

        Student st1 = new Student();
        st1.roll = 44;
        System.out.println(st1.roll);
    }
}
