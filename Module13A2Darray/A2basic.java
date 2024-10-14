package Module13A2Darray;

import java.util.Scanner;

public class A2basic {
    public static void main(String[] args) {
        int[][] arr = new int[4][5];

        Scanner sc = new Scanner(System.in);
        int n = arr.length;
        System.out.println(n);
        int m = arr[0].length;
        System.out.println(m);
        System.out.println("Enter the input : ");
        // this is input 
        // for(int i=0; i<=arr.length-1; i++){
        //     for(int j=0; j<=arr.length-1; j++){
        //         arr[i][j] = sc.nextInt();
        //     }
        // }


        // This is out put 
        for(int i=0; i<=arr.length-1; i++){
            for(int j=0; j<=arr.length-1; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
