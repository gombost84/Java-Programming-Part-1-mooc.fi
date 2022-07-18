
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private TodoList todoList;
    
    public UserInterface(TodoList todoList, Scanner scanner) {
        this.scanner = scanner;
        this.todoList = todoList;
    }
    
    public void start() {
        
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            
            switch (command) {
                case "stop":
                    return;
                case "add":
                    System.out.println("To add: ");
                    String toAdd = scanner.nextLine();                    
                    this.todoList.add(toAdd);
                    break;
                case "list":
                    this.todoList.print();
                    break;
                case "remove":
                    System.out.println("Which one is removed? ");
                    int id = Integer.valueOf(scanner.nextLine());
                    this.todoList.remove(id);
                    break;
            }
        }
    }
}
