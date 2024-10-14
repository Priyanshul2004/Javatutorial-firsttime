package Module12Array;

public class A20Colorproblem {
    public static void main(String[] args) {
        int[] arr = {1,1,0,0,2,2,1,2,0,2,1,0};
        int n = arr.length;

        int Zeros = 0;
        int Onses = 0;
        int Twos = 0;

        for(int i=0; i<n; i++){
            if (arr[i] == 0) {
                Zeros++;
            }else if (arr[i] == 1) {
                Onses++;
            }else if (arr[i] == 2) {
                Twos++;
            }
        }

        for(int i=0; i<n; i++){
            if (i<Zeros) {
                arr[i] = 0;
            }else if (i<Zeros+Onses) {
                arr[i] = 1;
            }else{
                arr[i] = 2;
            }
        }

        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
