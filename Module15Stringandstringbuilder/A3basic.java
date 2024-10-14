package Module15Stringandstringbuilder;

public class A3basic {
    public static void main(String[] args) {
        // interning padhna hai 
        String st = "priyanshul";
        String st1 = "priyanshul";
        String st2 = "priy";
        st2 += "anshul";
        System.out.println(st2);
        
        System.out.println(st2 == st1);
        System.out.println(st.equals(st1));
        
    }
}
