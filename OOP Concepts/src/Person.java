import java.util.ArrayList;
//This class demonstrates the use of recursion
public class Person {
    String name;
    ArrayList<Person> children = new ArrayList<>();

    public Person(String name) {
        this.name = name;
    }

    public int countDescendants() {
        int count = children.size();
        for (Person child : children) {
            count += child.countDescendants(); //recursive function call
        }
        return count;
    }
}