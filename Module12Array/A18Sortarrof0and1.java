package Module12Array;

public class A18Sortarrof0and1 {
    public static void main(String[] args) {
        int[] arr = {1,1,0,0};
        int n = arr.length;

        int noOfZero = 0;
        for(int i=0; i<=n-1; i++){
            if (arr[i] == 0) {
                noOfZero++;
            }
        }
        for(int i=0; i<=n-1; i++){
            if (i<noOfZero) {
                arr[i] = 0;
            }else{
                arr[i] = 1;
            }
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
