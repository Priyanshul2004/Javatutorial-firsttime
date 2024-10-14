package Module15Stringandstringbuilder;

public class A7Basic {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hellow");
        System.out.println(sb.deleteCharAt(0));
        System.out.println(sb.delete(0, 2));
        System.out.println(sb);
        sb.setCharAt(1, 'b');
        System.out.println(sb);
        sb.insert(1, 'd');
        System.out.println(sb);
    }
}
