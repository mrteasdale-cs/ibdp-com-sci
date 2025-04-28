import java.util.LinkedList;

public class linkedlistmain {

        public static void main(String[] args) {
            // Create a new LinkedList of Strings
            LinkedList<String> fruits = new LinkedList<>();

            // Add 5 fruits to the linked list
            fruits.add("Apple");
            fruits.add("Banana");
            fruits.add("Orange");
            fruits.add("Mango");
            fruits.add("Strawberry");

            // Print the linked list
            System.out.println("Fruit LinkedList:");
            for (String fruit : fruits) {
                System.out.println(fruit);
            }

            // Print the size of the linked list
            System.out.println("\nNumber of fruits: " + fruits.size());

            // Demonstrate some LinkedList operations
            System.out.println("\nFirst fruit: " + fruits.getFirst());
            System.out.println("Last fruit: " + fruits.getLast());

            // Remove a fruit and add a new one
            fruits.remove("Orange");
            fruits.addLast("Grapes");

            // Print the updated linked list
            System.out.println("\nUpdated Fruit LinkedList:");
            for (String fruit : fruits) {
                System.out.println(fruit);
            }
        }
    }

