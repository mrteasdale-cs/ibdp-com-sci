public class Monster {
    //CLASS: In programming, a class is a blueprint for an object
    // it defines the attributes and methods of an instantiated object
    //VISIBILITY MODIFIER: public - means available to other classes
    // (or a method available outside the class) - private cannot change
    // attributes or call methods etc outside the class.
    // protected - same as private but to do with packages/projects

    //attributes - public or private (static or not)
    // static = refers to the attribute at the class-level not object
    // static is used when you require attributes to be constant across
    // classes, not changed/duplicated at a object level
    public static final int ICE_MONSTER_TYPE = 1;
    public static final int WATER_MONSTER_TYPE = 2;
    public static final int FIRE_MONSTER_TYPE = 3;
    private String name = "Unknown";
    private int health = 100;
    private int strength = 10;
    private int monsterType = 0;
    // constructor - take parameters (or not)
    // default constructor -
    // public Monster(){}
    public Monster(String name, int health, int monsterType) {
        this.name = name; //this to refer to THIS objects att
        this.health = health;
        this.monsterType = monsterType;
    }
    //getters
    public String getName(){
        return name;
    }
    //setter
    public void setName(String newName){
        this.name = newName;
    }
    // method - return value is 'void'
    public void attack(Monster defender) {
//to be written
    }
    private static int rollDice() {
//returns a random integer between 1 and 12
        return new java.util.Random().nextInt(12)+1;
    }
    public static void output(String message) {
        System.out.println(message);
    }
}

/*
Q. Outline one advantage of making all instance variables in the Monster
class private.
A.

Two types = accessors and mutators



 */
