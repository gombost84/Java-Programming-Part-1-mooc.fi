
import java.util.ArrayList;

public class Stack {
    private ArrayList<String> array = new ArrayList<>();
    
    public boolean isEmpty() {
        if (this.array.size() == 0) {
            return true;
        }
        return false;
    }
    
    public void add(String value) {
        this.array.add(value);
    }
    
    public ArrayList<String> values() {
        return this.array;
    }
    
    public String take() {
        int toTake = this.array.size() - 1;
        String taken = this.array.get(toTake);
        this.array.remove(toTake);
        
        return taken;
    }
}
