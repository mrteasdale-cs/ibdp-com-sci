import java.util.Random;
public class Main {
    public static void main(String[] args) {
        //create an instance of the object
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


        /*
        Person grandparent = new Person("Grandparent");
        Person parent1 = new Person("Parent1");
        Person parent2 = new Person("Parent2");
        Person child1 = new Person("Child1");
        Person child2 = new Person("Child2");
        Person child3 = new Person("Child3");

        // Build the tree
        grandparent.children.add(parent1);
        grandparent.children.add(parent2);
        parent1.children.add(child1);
        parent2.children.add(child2);
        parent2.children.add(child3);

        // Count descendants
        System.out.println(grandparent.name + " has " + grandparent.countDescendants() + " descendants."); // Output: 4
        System.out.println(parent2.name + " has " + parent2.countDescendants() + " descendants."); // Output: 1
        System.out.println(child1.name + " has " + child1.countDescendants() + " descendants."); // Output: 0
        */

    }
}