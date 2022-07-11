
import java.util.ArrayList;

public class Hold {

    private int maxWeight;
    private int totalWeight;
    private ArrayList<Suitcase> suitcases = new ArrayList<>();

    public Hold(int weight) {
        this.maxWeight = weight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (!((totalWeight + suitcase.totalWeight()) > maxWeight)) {
            suitcases.add(suitcase);
            totalWeight += suitcase.totalWeight();
        }
    }

    public void printItems() {
        suitcases.forEach(suitcase -> {
            suitcase.printItems();
        });
    }

    @Override
    public String toString() {
        return this.suitcases.size() + " suitcases (" + this.totalWeight + " kg)";
    }
}
