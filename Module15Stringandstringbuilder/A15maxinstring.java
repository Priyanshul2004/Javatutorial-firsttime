package Module15Stringandstringbuilder;

public class A15maxinstring {
    public static void main(String[] args) {
        String[] str = {"123","4242","2413","5555555"};

        int mx = Integer.MIN_VALUE;

        for(int i=0;i<str.length;i++){
            int n = Integer.parseInt(str[i]);
            mx = Math.max(mx, n);
        }

        System.out.println(mx);
    }
}
