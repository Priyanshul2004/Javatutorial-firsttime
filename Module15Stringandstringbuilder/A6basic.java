package Module15Stringandstringbuilder;

public class A6basic {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Priyanshul");
        sb.append(" Tiwari");
        System.out.println(sb);
        
        char[] ch = {'q','s'};
        System.out.println(sb.append(ch));

        StringBuilder stb = new StringBuilder("Tiwari ji");
        System.out.println(sb.append(stb));
    }
}
