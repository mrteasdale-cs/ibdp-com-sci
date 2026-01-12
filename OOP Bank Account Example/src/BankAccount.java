public class BankAccount {
    //instance vars
    private String name;
    private double balance;
    private String accountNumber;

    public BankAccount(String newName) {
        this.name = newName;
    }
    public BankAccount() {
        this.name = "Default";
        this.balance = 0.0;
    }
    //Constructor overloading - different parameters
    public BankAccount(String newName,
                       double initialBalance) {
        this.name = newName;
        this.balance = initialBalance;
    }

    public String toString(){
        String heading = "====== BANK ACCOUNT =======\n";
        String content = "Name: " + this.name + "\n" + "Balance: " + this.balance + "\n";
        String footer = "____________________________";
        return heading + content + footer;
    }
    //getters and setters
    //mutators and accessors
    public void deposit (double amount){
        balance += amount;
    }
    public void withdraw (double amount){
        balance -= amount;
    }
    public double getBalance(){
        return this.balance;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }

}
