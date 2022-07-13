
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    private void end() {
        System.out.println("Bye bye!");
    }

    private void add() {
        System.out.println("Word: ");
        String word = scanner.nextLine();

        System.out.println("Translation: ");
        String translation = scanner.nextLine();

        dictionary.add(word, translation);
    }

    private void search() {
        System.out.println("To be translated: ");
        String toTranslate = scanner.nextLine();
        String translated = dictionary.translate(toTranslate);

        if (translated != null) {
            System.out.println("Translation: " + translated);
        } else {
            System.out.println("Word " + toTranslate + " was not found");
        }
    }

    public void start() {

        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();

            switch (command) {
                case "end":
                    this.end();
                    return;
                case "add":
                    this.add();
                    break;
                case "search":
                    this.search();
                    break;
                default:
                    System.out.println("Unknown command");
                    break;
            }
        }
    }
}
