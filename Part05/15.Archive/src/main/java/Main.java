
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Items> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Identifier? (empty will stop)");
            String newId = scanner.nextLine();
            if (newId.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String newName = scanner.nextLine();
            if (newName.isEmpty()) {
                break;
            }

            Items tempItem = new Items(newId, newName);
            if (!(items.contains(tempItem))) {
                items.add(tempItem);
            }
        }

        items.forEach(item -> {
            System.out.println(item.id + ": " + item.name);
        });
    }

}
