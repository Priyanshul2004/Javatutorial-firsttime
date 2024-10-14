package Module14String;

public class A5conatinsandstartswith {
    public static void main(String[] args) {
        String str = "Priyanshul";
        String str1 = "Tiwari";
        System.out.println(str.contains("Priyansh"));

        System.out.println(str.startsWith("Pr"));
        System.out.println(str.endsWith("l"));

        // tolowercase()
        System.out.println(str.trim());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        // concat
        System.out.println(str.concat(str1));
    }
}
