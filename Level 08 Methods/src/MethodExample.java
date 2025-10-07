import java.util.Random;
import java.util.Scanner;
public class MethodExample {

    //contructor method
    public MethodExample(){

    }

    //user defined method
    public double calcArea(){ //method signature
        double height = getInput("Enter height");
        double width = getInput("Enter width");
        return (Math.round(height * width));
    }

    public double getInput(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        String input = sc.nextLine();
        double inputD = Double.parseDouble(input);
        return inputD;
    }

}

