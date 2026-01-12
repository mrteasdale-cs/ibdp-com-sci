public class Vehicle {
    // Attributes (- means private)
    private int wheels;
    private Engine powerSource;
    private String brand;
    private String model;
    private int year;

    // Constructor
    public Vehicle(int wheels, Engine powerSource, String brand, String model, int year) {
        this.wheels = wheels;
        this.powerSource = powerSource;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Methods (behaviors that the class can "do")
    public void goForward(int d) {
        System.out.println(brand + " " + model + " is moving forward " + d + " meters");
    }
    public void goBackward(int d) {
        System.out.println(brand + " " + model + " is moving backward " + d + " meters");
    }
    public boolean stopMoving() {
        System.out.println(brand + " " + model + " has stopped");
        return true;
    }
    public void turn(int r) {
        System.out.println(brand + " " + model + " is turning " + r + " degrees");
    }
    public void soundHorn() {
        System.out.println("Beep beep!");
    }
    public void changeGear(int g) {
        System.out.println(brand + " " + model + " changed to gear " + g);
    }
    // Getters for private attributes
    public int getWheels() {
        return wheels;
    }
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}
