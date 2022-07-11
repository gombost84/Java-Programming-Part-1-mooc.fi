
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items = new ArrayList<>();
    private final int maxWeight;
    private int totalweight = 0;

    public Suitcase(int weight) {
        this.maxWeight = weight;
    }

    public void addItem(Item item) {
        if (!((totalweight + item.getWeight()) > maxWeight)) {
            items.add(item);
            totalweight += item.getWeight();
        }

    }
    
    public void printItems() {
        items.forEach(item -> {
            System.out.println(item.toString());
        });
    }
    
    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        Item heaviest = items.get(0);
        
        for (Item item : items) {
            if (item.getWeight() > heaviest.getWeight()) {
                heaviest = item;
            }
        }
        
        return heaviest;
    }
    
    public int totalWeight() {
        return totalweight;
    }

    @Override
    public String toString() {
        
        if (items.isEmpty()) {
            return "no items (0 kg)";
        } else if (items.size() == 1) {
            return this.items.size() + " item (" + this.totalweight + " kg)";
        }

        return this.items.size() + " items (" + this.totalweight + " kg)";
    }
}
