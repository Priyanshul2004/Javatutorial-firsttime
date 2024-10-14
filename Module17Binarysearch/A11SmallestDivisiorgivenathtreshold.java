package Module17Binarysearch;

public class A11SmallestDivisiorgivenathtreshold {
    public static void main(String[] args) {
        int[] arr = { 5, 1, 9, 2 };
        int threshold = 6;
        int n = arr.length;

        int mx = Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++){
           mx = Math.max(mx, arr[i]);
        }

        int d;
        for(d=1; d<=mx ; d++){
            int sum = 0;
            for(int i=0;i<n;i++){
                if (arr[i]%d == 0) {
                    sum += arr[i]/d;
                }else{
                    sum += arr[i]/d+1;
                }
            }
            if (sum<=threshold) {
                System.out.println(d);
                return;
            }
        }
    }
}
