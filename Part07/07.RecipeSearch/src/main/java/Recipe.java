
import java.util.ArrayList;

public class Recipe {

    private String name = "";
    private int time = 0;
    private ArrayList<String> ingredients = new ArrayList<>();

    Recipe() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void addIngredients(String ingredient) {
        this.ingredients.add(ingredient);
    }    

    public String getName() {
        return name;
    }

    public int getTime() {
        return time;
    }

    public ArrayList<String> getIngredients() {
        return ingredients;
    }

}
