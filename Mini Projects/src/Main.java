
public class Main {
    public static void main(String[] args) {

        Account acc1 = new Account("12345", "Myran", 999.99);

        System.out.println("$"+acc1.getBalance());

        acc1.printAccountDetails();

        System.out.println(acc1.calculateInterest(12));

    }
}