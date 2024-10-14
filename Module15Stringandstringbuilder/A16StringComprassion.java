package Module15Stringandstringbuilder;

public class A16StringComprassion {
    public static void main(String[] args) {
        String s = "aaaaabbbbbbcccccddeee";
        char[] arr = s.toCharArray();

        String ans = "";

        int i = 0;
        int j = 0;

        while (j < arr.length) {
            if (arr[i] == arr[j]) {
                j++;
            } else {
                ans += arr[i];
                int length = j - i;
                if (length > 1) {
                    ans += length;
                    i = j;
                }
            }
        }
        ans += arr[i];
        int length = j - i;
        if (length > 1) {
            ans += length;
            i = j;
        }
        System.out.println(ans);
    }
}
