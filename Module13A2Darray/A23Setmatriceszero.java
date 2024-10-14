package Module13A2Darray;

public class A23Setmatriceszero {
    public static void main(String[] args) {
        int[][] arr = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        int m = arr.length;
        int n = arr[0].length;
        
        int[][] helper = new int[m][n]; 
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                helper[i][j] = arr[i][j];
            }
        }
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (helper[i][j] == 0) {
                    
                    for (int b = 0; b < n; b++) {
                        arr[i][b] = 0;
                    }
                    
                    for (int a = 0; a < m; a++) {
                        arr[a][j] = 0;
                    }
                }
            }
        }

        System.out.println("The modified matrix is: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}

