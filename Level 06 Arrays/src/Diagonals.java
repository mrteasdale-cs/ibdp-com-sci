import java.util.*;
public class Diagonals {
    //Constructor
    public Diagonals(){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int[][] matrix = new int[3][3];
        int diag1 = 0, diag2 = 0, total = 0;

        System.out.println("Diagonals Problem");
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                matrix[i][j] = rand.nextInt(10)+1;
            }
        }
        //prints the array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                if (i == j) {
                    diag1 = diag1 + matrix[i][j];
                }
                if (matrix.length - 1 == i + j) {
                    diag2 = diag2 + matrix[i][j];
                }
            }
        }
        System.out.println("Sum of Diagonal 1 is ");
        System.out.println(diag1);
        System.out.println("Sum of Diagonal 2 is ");
        System.out.println(diag2);
    }
}
