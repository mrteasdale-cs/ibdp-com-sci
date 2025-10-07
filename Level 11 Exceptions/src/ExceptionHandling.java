import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public ExceptionHandling() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        try {
            int num = scan.nextInt();
            // add code to divide 10 by num and print result
        } catch (InputMismatchException e) {
            // your code here
        } catch (ArithmeticException e) {
            // your code here
        } finally {
            // your code here
        }
    }

}




