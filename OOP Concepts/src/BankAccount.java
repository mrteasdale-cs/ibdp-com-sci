public class BankAccount {
    // Shared, hidden
    private static double interestRate = 0.05;
    // Individual, hidden
    private double balance;

    // Controlled access to shared resource
    public static double getInterestRate() {
        return interestRate;
    }
}

