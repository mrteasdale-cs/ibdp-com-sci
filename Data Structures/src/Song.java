// Song class with ENCAPSULATION
class Song {
    // TODO: Add private fields for title and artist
    private String title;
    private String artist;

    // Constructor
    public Song(String title, String artist) {
        // TODO: Initialise the private fields
        this.title = title;
        this.artist = artist;
    }

    // TODO: Create public getter methods (encapsulation)
    public String getTitle() {
        return this.title;
    }

    public String getArtist() {
        return this.artist;
    }
    // Override toString for easy display
    @Override
    public String toString() {
        return this.title + " by " + this.artist;
    }
}


public class Starter {
    static String greet(String name) {
        return "Hello, " + name + "!";
    }

    public static void main(String[] args) {
        System.out.println(greet("Ada"));
    }
}

public class PricesNoMethod {
    public static void main(String[] args) {
        double p1 = 19.99;
        double p2 = 5.50;
        double p3 = 12.00;

        double total1 = p1 * 1.08;
        System.out.println(total1);

        double total2 = p2 * 1.08;
        System.out.println(total2);

        double total3 = p3 * 1.08;
        System.out.println(total3);
    }
}


public class PricesWithMethod {
    static double withTax(double price) {
        return price * 1.08;
    }

    public static void main(String[] args) {
        System.out.println(withTax(19.99));
        System.out.println(withTax(5.50));
        System.out.println(withTax(12.00));
    }
}