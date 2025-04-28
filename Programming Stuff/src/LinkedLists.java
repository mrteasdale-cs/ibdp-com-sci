
import java.util.LinkedList;
public class LinkedLists {

        public static void main(String[] args) {
            // Create a new LinkedList of Strings
            LinkedList<String> fruits = new LinkedList<>();

            // Add 5 fruits to the linked list
            fruits.add("Apple");
            fruits.add("Banana");
            fruits.add("Orange");
            fruits.add("Pear");

            // Print the linked list
            System.out.println("Fruit LinkedList:");
            outputList(fruits);

            // Print the size of the linked list using the size method
            System.out.println("\nNumber of fruits: " + fruits.size());

            // Demonstrate some LinkedList operations - getFirst and getLast
            System.out.println("\nFirst fruit: " + fruits.getFirst());
            System.out.println("Last fruit: " + fruits.getLast());

            // Remove a fruit and add a new one using remove and addLast
            fruits.remove(1);
            fruits.add(1,"Mango");
            fruits.removeLast();

            // Print the updated linked list
            System.out.println("\nUpdated Fruit LinkedList:");
            outputList(fruits);
        }

        public static void outputList(LinkedList<String> fruits) {
            for (String fruit : fruits) {
                System.out.println(fruit); //make this print each fruit
            }
        }
    }
