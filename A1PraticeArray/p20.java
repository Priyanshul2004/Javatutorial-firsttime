package A1Pratice;

public class p20 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        
        int sumofeven = 0;
        int sumofodd = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i%2 == 0) {
                sumofeven = sumofeven+arr[i];
            }else{
                sumofodd = sumofodd+arr[i];
            }
        }

        int diff = sumofeven-sumofodd;

        System.out.println("difference of sum of even and odd is = "+diff);
    }
}
