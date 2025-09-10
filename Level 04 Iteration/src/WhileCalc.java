import java.util.*;
public class WhileCalc {
    public WhileCalc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Calculator!\n" +
                "What is your Name?");
        String name = sc.nextLine();
        //true or false
        boolean running = true;
        while (running) {

            //First number
            System.out.println("Okay " + name + ", What is your First Number?");
            int N1 = sc.nextInt();
            //second number
            System.out.println("Okay! What's your Second Number?: ");
            int N2 = sc.nextInt();
            //choice for operator
            Scanner bit = new Scanner(System.in);
            System.out.println("Anddd What do we do with it? (add/sub/mul)");
            String Op = bit.nextLine();

            //different answer for each operator
            if (Op.equals("add")) {
                int add = N1 + N2;
                System.out.println("Calculating....\n" +
                        N1 + " + " + N2 + " = ....\n" +
                        "Your Total is " + add + "!");

            } else if (Op.equals("sub")) {
                int sub = N1 - N2;
                System.out.println("Calculating....\n" +
                        N1 + " - " + N2 + " = ....\n" +
                        "Your Total is " + sub + "!");

            } else if (Op.equals("mul")) {
                int mul = N1 * N2;
                System.out.println("Calculating....\n" +
                        N1 + " * " + N2 + " = ....\n" +
                        "Your Total is " + mul + "!");
                //ask to retry
            }
            System.out.println("Alright!, would you like to calculate again? (Yes/No)");
            Scanner sc2 = new Scanner(System.in);
            String answer = bit.nextLine();
            if (answer.toLowerCase().equals("no")||(answer.equalsIgnoreCase("n"))){
                System.out.println("Alright! Goodbye!");
                running = false;
            }

        }//END OF WHILE LOOP
    }//END CONSTRUCTOR
}//END CLASS