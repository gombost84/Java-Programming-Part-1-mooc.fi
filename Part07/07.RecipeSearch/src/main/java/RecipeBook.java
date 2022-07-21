
import java.util.ArrayList;

public class RecipeBook {

    private ArrayList<Recipe> book;

    RecipeBook() {
        this.book = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        this.book.add(recipe);
    }
    
    public void getRecipeByName(String name) {
        book.forEach(recipe -> {
            if (recipe.getName().contains(name)) {
                System.out.println(recipe.getName() + ", cooking time: " + recipe.getTime());
            }
        });
    }
    
    public void getRecipeByTime(int time) {
        book.forEach(recipe -> {
            if (recipe.getTime() <= time) {
                System.out.println(recipe.getName() + ", cooking time: " + recipe.getTime());
            }
        });
    }
    
    public void getRecipeByIngeredient(String ingred) {
        book.forEach(recipe -> {
            if (recipe.getIngredients().contains(ingred)) {
                System.out.println(recipe.getName() + ", cooking time: " + recipe.getTime());
            }
        });
    }

    public void listRecipes() {
        book.forEach(recipe -> {
            System.out.println(recipe.getName() + ", cooking time: " + recipe.getTime());
        });
    }
}
