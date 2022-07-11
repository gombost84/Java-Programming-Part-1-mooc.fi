
public class Items {
    String id;
    String name;
    
    public Items(String id, String name) {
        this.id = id;
        this.name = name;
    }
    
    @Override
    public boolean equals(Object compare) {
        Items compareTo = (Items) compare;
        
        if (this.id.equals(compareTo.id)) {
            return true;
        }
        
        return false;
    }
}
