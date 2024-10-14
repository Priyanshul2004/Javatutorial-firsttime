package Module13A2Darray;

import java.util.Scanner;

public class A4Quest1 {
    public static void main(String[] args) {
        int[][] arr = new int[4][2];
       

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num of marks : ");
        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<=arr[0].length-1;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<=arr.length-1;i++){
            for(int j=0;j<=arr[0].length-1;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
