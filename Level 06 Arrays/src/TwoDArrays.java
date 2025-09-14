import java.util.Scanner;
public class TwoDArrays {
    public TwoDArrays() {
        //declared new 2d array
        String[][] matrix = new String[5][2];
        Scanner sc = new Scanner(System.in);

        for (int row = 0; row < 5; row++) {
            System.out.println("Enter Firstname: ");
            String firstname = sc.nextLine();
            System.out.println("Enter Surname: ");
            String surname = sc.nextLine();
            for (int col = 0; col < 2; col++) {
                matrix[row][0] = firstname;
                matrix[row][1] = surname;
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
