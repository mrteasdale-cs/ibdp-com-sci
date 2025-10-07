import java.util.InputMismatchException;

public class ThrowException {
    public ThrowException() {
    }

    public void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - must be at least 18!");
        }
        System.out.println("Access granted.");
    }

    public void checkAgeType(Object age) {
        if (!(age instanceof Integer)) {
            throw new InputMismatchException("Must be a number!");
        }
        System.out.println("Type is Okay.");
    }

}
