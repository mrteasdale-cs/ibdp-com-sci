import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        //instantiate a BankAccount object
        /*BankAccount newAcc1 = new BankAccount("Myran");
        System.out.println("==BANK ACCOUNT==");
        System.out.println("Name: " + newAcc1.getName());
        newAcc1.setName("Joey");
        System.out.println(newAcc1.getName());

        System.out.println(newAcc1.toString());

        BankAccount newAcc2 = new BankAccount();
        System.out.println(newAcc2.toString());

        BankAccount newAcc3 = new BankAccount("Sally", 999.99);
        System.out.println(newAcc3.toString());*/

        // Java - example using static array
        /*
        BankAccount[] accounts = new BankAccount[3];
        accounts[0] = new BankAccount("Amy");
        accounts[1] = new BankAccount("Brian");
        accounts[2] = new BankAccount("Clare");*/

        // Java - example iterating over static array

        String[] names = {"Amy", "Brian", "Clare"};
        BankAccount[] accounts = new BankAccount[3];
        for (int i=0; i<accounts.length; i++) {
            accounts[i] = new BankAccount( names[i] );
        }

        /*// Java - example using ArrayList
        // Remember to import java.util.ArrayList
        ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
        accounts.add(new BankAccount("Amy"));
        accounts.add(new BankAccount("Brian"));
        accounts.add(new BankAccount("Clare"));*/

        //output the accounts from the array
        for (int i=0; i<accounts.length; i++) {
            System.out.println(accounts[i]);
        }

    }
}