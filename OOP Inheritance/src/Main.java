// 4. Main Class to run the program
public class Main {
    public static void main(String[] args) {
        // Create a Dog object
        Dog myDog = new Dog();
        myDog.name = "Buddy";  // Inherited field

        // Create a Cat object
        Cat myCat = new Cat();
        myCat.name = "Whiskers"; // Inherited field

        // Call inherited methods
        System.out.println(myDog.name + ":");
        myDog.eat();        // Inherited from Animal
        myDog.makeSound();  // Overridden in Dog

        System.out.println("\n" + myCat.name + ":");
        myCat.eat();        // Inherited from Animal
        myCat.makeSound();  // Overridden in Cat
    }
}
