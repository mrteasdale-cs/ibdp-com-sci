/**
 * The Person class represents a person with a name and age.
 * It provides methods to get and set the name, as well as a method to say hi.
 */
public class Person {

    private String name;
    private final int age;

    /**
     * Constructor for the Person class.
     * Initializes a new Person object with the specified name and age.
     *
     * @param name the name of the person
     * @param age  the age of the person
     */
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * Sets a new name for the person.
     *
     * @param newName the new name to be set
     */
    public void setName(String newName) {
        name = newName;
    }

    /** Retrieves the current name of the person.
     *
     * @return the current name of the person
     */
    public String getName() {
        return name;
    }

    /** Makes the person say "Hi!" by printing it to the console.*/
    void sayHi() {
        System.out.println("Hi!");
    }
}
