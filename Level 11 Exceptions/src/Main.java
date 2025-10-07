import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //new ExceptionHandling2();
        //new ExceptionHandling();

        ThrowException throwE = new ThrowException();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int getAge = sc.nextInt();

        // call from within main method
        try {
            throwE.checkAgeType(getAge);
            throwE.checkAge(getAge);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("Enter your age again: ");
            getAge = sc.nextInt();
        } catch (InputMismatchException e){
            System.out.println(e.getMessage());
            System.out.println("Enter your age again: ");
            getAge = sc.nextInt();
        }

    }
}