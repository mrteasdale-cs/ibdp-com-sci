public class Player {
    // Attributes
    private String playerName;
    private int health;
    private int level;
    private int score;
    private boolean isAlive;

    public Player(String name) {
        this.playerName = name;
        this.health = 100;
        this.level = 1;
        this.score = 0;
        this.isAlive = true;
    }

    // Methods
    public void takeDamage(int amount) {
        health -= amount;
        if (health <= 0) {
            health = 0;
            isAlive = false;
        }
    }

    public void heal(int amount) {
        if (isAlive) health += amount;
    }

    public void levelUp() {
        level++;
    }

    public void addScore(int points) {
        score += points;
    }
}
