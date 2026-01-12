public class PlayerSTUDENT {
    // Attributes
    private String playerName;
    // add private variables for health (int), level (int), socre (int), and isAlive (boolean)


    public Player(String name) {
        this.playerName = name;
        //set instance variables using this. keyword
    }

    // Methods
    public void takeDamage(int amount) {
        health -= amount;
        //perform a validation check to check if health is below 0, if so, set isAlive to false
    }

    public void heal(int amount) {
        if (isAlive)
        {
            // increment health by amoung
        }
    }

    public void levelUp() {
        //increment level
    }

    //create a new setter/mutator method to add score - it should take a points parameter
    public ... {

    }
}
