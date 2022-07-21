
import java.io.File;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        RecipeBook book = new RecipeBook();
        Recipe recipe = new Recipe();
        int counter = 0;

        System.out.println("File to read: ");
        String file = scanner.nextLine();

        try (Scanner readFile = new Scanner(new File(file))) {
            while (readFile.hasNextLine()) {
                String line = readFile.nextLine();

                if (line.isEmpty()) {
                    book.addRecipe(recipe);
                    counter = 0;
                    recipe = new Recipe();
                } else if (counter == 0) {
                    recipe.setName(line);
                    counter++;
                } else if (counter == 1) {
                    recipe.setTime(Integer.valueOf(line));
                    counter++;
                } else {
                    recipe.addIngredients(line);
                }
            }
            book.addRecipe(recipe);
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }

        while (true) {

            System.out.println("");
            System.out.println("Commands:");
            System.out.println("list - lists the recipes");
            System.out.println("stop - stops the program");
            System.out.println("find name - searches recipes by name");
            System.out.println("find cooking time - searches recipes by cooking time");
            System.out.println("find ingredient - searches recipes by ingredient");
            System.out.println("");
            System.out.println("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("list")) {

                System.out.println("Recipes:");
                book.listRecipes();

            } else if (command.equals("find name")) {

                System.out.println("Searched word: ");
                String recipeName = scanner.nextLine();
                System.out.println("Recipes:");
                book.getRecipeByName(recipeName);
                System.out.println("");

            } else if (command.equals("find cooking time")) {

                System.out.println("Max cooking time: ");
                int time = Integer.valueOf(scanner.nextLine());
                System.out.println("Recipes:");
                book.getRecipeByTime(time);
                System.out.println("");

            } else if (command.equals("find ingredient")) {

                System.out.println("Ingredient:");
                String ingred = scanner.nextLine();
                System.out.println("Recipes:");
                book.getRecipeByIngeredient(ingred);
                System.out.println("");

            } else if (command.equals("stop")) {

                break;

            }
        }

    }

}
