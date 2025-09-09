import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //Simpsons Usage
        Scanner sc = new Scanner(System.in);
        System.out.println("Simpson Checker: ");
        System.out.println("Please enter a name: ");
        String name = sc.nextLine();
        System.out.println("Please enter an age: ");
        String age = sc.nextLine();
        System.out.println("Please enter a gender: ");
        String gender = sc.nextLine();
        //cast to an integer first
        int ageInt = Integer.parseInt(age);
        Simpsons simp1 = new Simpsons(name, ageInt, gender); //create object
        //check which simpsons
        System.out.println(simp1.checkWho());


    }
}
