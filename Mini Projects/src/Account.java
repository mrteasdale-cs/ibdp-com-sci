public class Account{
    //declare variables - accountNumber String, accountHolder String, balance double
    private String accountNumber;
    private String accountHolder;
    private double balance;
    //Constructor to open an account with a specific transferred balance
    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }
    //Constructor overloading - using a second constructor to open a brand new account with 0 balance
    public Account(String accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
    }

    //Getter methods:
    public String getAccountNumber() {
        return accountNumber;
    }
    public String getAccountHolder() {
        return accountHolder;
    }
    public double getBalance() {
        return balance;
    }

    //Setter method (for account holder only)
    public void setAccountHolder(String newAccountHolder) {
        this.accountHolder = newAccountHolder;
    }

    //Deposit method - returns void with amount as parameter
    public void deposit(double amount) {
        this.balance += amount;
    }

    //Withdraw method - returns boolean with amount as parameter
    public boolean withdraw(double amount) {
        if(this.getBalance() > amount) {
            this.balance -= amount;
            return true;
        } else {
            return false;
        }
    }

    //Transfer method - returns boolean with recipient and amount as parameter
    public boolean transfer(Account recipient, double amount) {
        if (this.getBalance() < amount || amount < 0) {
            return false;
        }
        this.withdraw(amount);
        recipient.deposit(amount);
        return true;
    }

    //Print account details method - void
    public void printAccountDetails() {
        System.out.println("Account Details: ");
        System.out.println("----------------------");
        System.out.println("Acc. Number: " + this.getAccountNumber());
        System.out.println("Acc. Holder: " + this.getAccountHolder());
        System.out.println("Balance:     " + this.getBalance());
        System.out.println("----------------------");
    }

    //Calculate interest method - void with rate parameter
    public double calculateInterest(double rate) {
        return (this.getBalance() * rate) / 100;
    }
}

