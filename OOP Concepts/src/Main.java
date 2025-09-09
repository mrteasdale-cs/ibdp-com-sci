public class Main {
    public static void main(String[] args) {

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


    }
}