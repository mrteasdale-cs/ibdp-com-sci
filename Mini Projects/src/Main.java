
public class Main {
    public static void main(String[] args) {

        Account acc1 = new Account("12345", "Myran", 9999999.99);

        System.out.println("$"+acc1.getBalance());

        acc1.printAccountDetails();

        System.out.println(acc1.calculateInterest(12));

        Account acc2 = new Account("98765", "Tommy");
        acc2.printAccountDetails();


    }
}