import java.util.*;
public class BiggestNumber {
    //Constructor
    public BiggestNumber(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        String num1 = sc.nextLine();
        System.out.println("Enter number: ");
        String num2 = sc.nextLine();
        System.out.println("Enter number: ");
        String num3 = sc.nextLine();

        if ((Integer.parseInt(num1) > Integer.parseInt(num2))
            && (Integer.parseInt(num1) > Integer.parseInt(num3))){
            System.out.println("Number 1 ("+num1+") is bigger.");
        } else if ((Integer.parseInt(num2) > Integer.parseInt(num1))
                && (Integer.parseInt(num2) > Integer.parseInt(num3))){
            System.out.println("Number 2 ("+num2+") is bigger.");
        } else {
            System.out.println("Number 3 ("+num3+") is bigger.");;
        }

    }

}
