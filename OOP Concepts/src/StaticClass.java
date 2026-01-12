public class StaticClass {
    private static int x = 5;
    private static int y = 0;
    //interest rate


    public static void addNumbers(){
        try {
            System.out.println(x / y);
        } catch (ArithmeticException e) {
            //rest of you code
            System.out.println(e);
        }
        sayHi();
    }

    public static void sayHi(){
        System.out.println("Hi");
    }

    //create static getter method

}
