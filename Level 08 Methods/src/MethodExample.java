import java.util.Scanner;
public class MethodExample {

    //contructor method
    public MethodExample(){

    }

    //user defined method
    public double calcArea(double h, double w){ //method signature
        double result = (Math.round(h * w));
        return result;
    }

    public double getInput(String message){
        Scanner sc = new Scanner(System.in);
        System.out.println(message);
        double input = sc.nextDouble();
        sc.close();//resource management
        return input;
    }
}

