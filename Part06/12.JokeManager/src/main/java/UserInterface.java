
import java.util.Scanner;

public class UserInterface {
    
    private JokeManager joker;
    private Scanner scanner;
    
    public UserInterface(JokeManager jokes, Scanner scanner) {
        this.joker = jokes;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            
            String command = scanner.nextLine();
            
            switch (command) {
                case "X":
                    return;
                case "1":
                    System.out.println("Write the joke to be added: ");
                    String newJoke = scanner.nextLine();
                    this.joker.addJoke(newJoke);
                    break;
                case "2":
                    System.out.println(this.joker.drawJoke());
                    break;
                case "3":
                    this.joker.printJokes();
                    break;
            }
        }
    }
}
