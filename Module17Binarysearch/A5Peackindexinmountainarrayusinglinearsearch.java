package Module17Binarysearch;
// not use method 
public class A5Peackindexinmountainarrayusinglinearsearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,3,2,1};
        for(int i=1;i<arr.length-2;i++){
            if (arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
                System.out.println(arr[i]);
            }
        }
    }
}
