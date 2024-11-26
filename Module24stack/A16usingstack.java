package Module24stack;
import java.util.Arrays;
import java.util.Stack;

public class A16usingstack {

    public static int[] calculatespan(int[] prize , int n){
        int[] arr = new int[n];

        Stack <Integer> st = new Stack<>();
        st.push(0);

        for(int i=0; i<n; i++){
            while (!st.isEmpty() && prize[i] >= prize[st.peek()]) {
                st.pop();
            }
            if (st.isEmpty()) {
                arr[i] = i+1;
            }else{
                arr[i] = i-st.peek();
                st.push(i);
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] price = {100, 80, 60, 70, 60, 75, 85};
        int n = price.length;
        
        int[] span = calculatespan(price, n);
        
        System.out.println("Stock prices: " + Arrays.toString(price));
        System.out.println("Span values: " + Arrays.toString(span));
    }
}