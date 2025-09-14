import java.util.Random;
public class Main {
    public static void main(String[] args) {

        //create an instance of the random object
        Random rand = new Random();
        System.out.println(rand.nextInt(100));

        Dog spot = new Dog("Spot",9);
        spot.bark();
        Dog max = new Dog("Max",4);
        max.bark();
        System.out.println(spot.getName());
        spot.setName("SpotTheSecond");
        System.out.println(spot.getAge());
        spot.addAge();
        System.out.println("It's my birthday! " + spot.getAge());


    }
}