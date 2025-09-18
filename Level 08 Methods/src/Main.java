import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MethodExample me = new MethodExample();


        //double height = sc.nextDouble();
        //System.out.println("Enter width: ");
        //double width = sc.nextDouble();
        //System.out.println(me.calcArea(height, width) +"CM^2");
        double height = me.getInput("Enter height: ");
        double width = me.getInput("Enter width: ");
        System.out.println("You inputted: "+me.calcArea(height, width));
    }
}