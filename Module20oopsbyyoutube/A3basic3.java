package Module20oopsbyyoutube;

public class A3basic3 {

    public static class Student {
        String name;
        private int roll;
        private int pin;

        // getter
        public int getrol() {
            return roll;
        }

        // setter
        public void setRoll(int roll) {
            this.roll = roll;
        }

        //setter
        public void setpin(int currpin){
            pin = currpin;
        }

        public int getpin() {
            return pin;
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "priyanshul";
        System.out.println(s1.getrol());
        s1.setRoll(33);
        System.out.println(s1.getrol());
        // s1.setpin(44);
        // System.out.println(s1.getpin());
    }
}

// we can access the value of private using getter and setter