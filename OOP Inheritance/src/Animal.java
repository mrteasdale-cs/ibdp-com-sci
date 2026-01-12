// 1. Superclass (Parent)
class Animal {
    String name;

    public void eat() {
        System.out.println("I can eat");
    }

    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

// 2. Subclass (Child)
class Dog extends Animal {
    // Overriding the parent method
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

// 3. Subclass (Child)
class Cat extends Animal {
    // Overriding the parent method
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}