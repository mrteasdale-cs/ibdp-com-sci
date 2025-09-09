import java.util.*;
import java.lang.Math;
public class Inputs {
    //constructor method
    public Inputs(){
        //create a new scanner object
        System.out.println("Enter something: ");
        Scanner sc = new Scanner(System.in);

        String s = "I love hats.";
        //OR
        String intputS = sc.nextLine();
        String snip = s.substring(0,8);//like 0-7
        snip = snip.toUpperCase();
        System.out.println(snip);
        System.out.println(snip.length());

        final double PI = 3.14;

        System.out.println("Hi there , type a word: ");
        String word =  sc.nextLine();
        int length = word.length();
        System.out.println("There are a total of " + length + " letters in "  + word);
        System.out.println("The first letter of " + word + " is " + word.charAt(0));
        System.out.println("The last letter of " + word + " is " + word.charAt(length-1));



        System.out.println("Area of a circle");
        System.out.println("Enter radius: ");
        String radius = sc.nextLine(); //assign sc to string s
        double radiusD = Double.parseDouble(radius);
        double result = Math.round(PI * Math.pow(radiusD, 2));
        System.out.println("Area is " + result + "CM2");


        int num = sc.nextInt();
        switch (num){
            case 1:
                System.out.println("Hi");
                break;
            case 5:
                System.out.println("Hi5");
                break;
            default:
                System.out.println("default");
        }

    }
    public void getInput(){
        System.out.println("input something!");
    }
    public static void getName() {
        System.out.println("static method!");
    }
}
