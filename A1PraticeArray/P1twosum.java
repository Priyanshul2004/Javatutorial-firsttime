package Pratice;

public class P1twosum {
    public static void main(String[] args) {
        int[] arr= {2,3,4,5};
        int target = 7;

        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length-1; j++){
                if (arr[i]+arr[j] == target) {
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
}
