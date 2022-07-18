
import java.util.ArrayList;

public class Package {
    
    private ArrayList<Gift> gifts = new ArrayList<>();
    
    public Package() {
    }
    
    public void addGift(Gift gift) {
        gifts.add(gift);
    }
    
    public int totalWeight() {
        int allWeight = 0;
        
        for (Gift gift : gifts) {
            allWeight += gift.getWeight();
        }
        
        return allWeight;
    }
}
