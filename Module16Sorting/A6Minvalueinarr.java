package Module16Sorting;

public class A6Minvalueinarr {
    public static void main(String[] args) {
        int[] arr = {3, 4, 20, 7, -9, 9, 8};
        
        int mididx = -1;

        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if (arr[i] < min) {
                min = arr[i];
                mididx = i;
            }
        }
        System.out.println(min+" "+" "+"idex "+mididx);
    }
}
