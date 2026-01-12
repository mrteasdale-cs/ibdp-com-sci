import java.util.ArrayList;

public class Inventory {
    // Attributes
    private int maxCapacity;
    private double currentWeight;
    private int goldCoins;
    private ArrayList<String> items; // To track names of items

    public Inventory(int capacity) {
        this.maxCapacity = capacity;
        this.currentWeight = 0.0;
        this.goldCoins = 0;
        this.items = new ArrayList<>();
    }

    // Methods
    public void addItem(String item, double weight) {
        if (currentWeight + weight <= maxCapacity) {
            items.add(item);
            currentWeight += weight;
        }
    }

    public void removeItem(String item) {
        items.remove(item);
        // Note: Realistically, you'd need the specific item weight to subtract
    }

    public boolean isFull() {
        return currentWeight >= maxCapacity;
    }

    public double getInventoryValue() {
        // Example implementation based on gold
        return goldCoins;
    }
}
