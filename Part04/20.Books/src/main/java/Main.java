import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while (true) {
            System.out.print("Title: ");
            String name = scanner.nextLine();
            System.out.println("");
            
            if (name.isEmpty()) {
                break;
            } else {
                System.out.print("Pages: ");
                String number = scanner.nextLine();
                System.out.println("");
            
                System.out.print("Publication year: ");
                String date = scanner.nextLine();
                System.out.println("");
            
                books.add(new Book(name, number, date));
            }                        
        }
        
        System.out.print("What information will be printed? ");
        String answer = scanner.nextLine();
        System.out.println("");
        
        if (answer.equals("everything")) {
            for (Book book : books) {
                System.out.println(book);
            }
        } else if (answer.equals("name")) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        }
    }
}
