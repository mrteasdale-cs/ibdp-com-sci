import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Iteration Level 4");
        new WhileCalc();
        new NumberPrinter().begin();

        Scanner scanner = new Scanner(System.in);

        // Array of ages
        int[] ages = {15, 16, 18};
        int total = 0;
        for (int age : ages) {
            total = age;
        }
        System.out.println((double) total / ages.length);

        // Height input and conversion
        System.out.println("Enter height");
        int height = scanner.nextInt();
        double inchHeight = height / 2.54;
        System.out.println(inchHeight);

        // Array of colours
        String[] colours = {"blue", "red"};
        for (int i = 0; i < colours.length; i++) {
            System.out.println(colours[i]);
        }

        scanner.close();//hi
    }
}