package Module13A2Darray;

public class A20Scoreafterflippingmatrix {
    public static void main(String[] args) {
        int[][] arr = {{0, 0, 1, 1}, {1, 0, 1, 0}, {1, 1, 0, 0}};
        int m = arr.length;
        int n = arr[0].length;
        
        // Put 1 at the 0th position of every row
        for (int i = 0; i < m; i++) {
            if (arr[i][0] == 0) {
                for (int j = 0; j < n; j++) {
                    if (arr[i][j] == 0) {
                        arr[i][j] = 1;
                    } else {
                        arr[i][j] = 0;
                    }
                }
            }
        }
        
        // Flip those columns where number of 0s > number of 1s
        for (int j = 1; j < n; j++) {
            int noofzero = 0;
            int noofones = 0;
            
            for (int i = 0; i < m; i++) {
                if (arr[i][j] == 0) {
                    noofzero++;
                } else {
                    noofones++;
                }
            }
            
            if (noofzero > noofones) {
                for (int i = 0; i < m; i++) {
                    if (arr[i][j] == 0) {
                        arr[i][j] = 1;
                    } else {
                        arr[i][j] = 0;
                    }
                }
            }
        }
        
        // Calculate the score
        int score = 0;
        for (int i = 0; i < m; i++) {
            int rowValue = 0;
            for (int j = 0; j < n; j++) {
                rowValue = rowValue * 2 + arr[i][j];
            }
            score += rowValue;
        }
        
        // Output the score
        System.out.println("The final score after flipping the matrix is: " + score);
    }
}

// ye wala quest nhi krna hai 