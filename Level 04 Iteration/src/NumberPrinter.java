import java.util.*;
public class NumberPrinter {
        public void begin() {
            Scanner scanner = new Scanner(System.in);
            String anotherGo = "Yes";

            System.out.println("This program prints selected numbers in a given range.");

            while (anotherGo.equals("Yes")) {
                System.out.print("Enter low number: ");
                int lowNumber = scanner.nextInt();

                System.out.print("Enter high number: ");
                int highNumber = scanner.nextInt();

                int x = 0;
                for (int i = lowNumber; i <= highNumber; i++) {
                    if (i % 5 != 0 && i % 7 != 0) {
                        System.out.println(i);
                        x++;
                    }
                }

                System.out.println(x + " numbers");
                System.out.print("Enter 'Yes' for another go: ");
                anotherGo = scanner.next();
            }

            scanner.close();
        }
}
