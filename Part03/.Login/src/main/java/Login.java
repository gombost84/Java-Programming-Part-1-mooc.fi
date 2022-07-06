
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String firstName = "alex";
        String secondName = "emma";
        
        String firstPass = "sunshine";
        String secondPass = "haskell";
        
        System.out.println("Enter username: ");
        String inputName = scanner.nextLine();
        System.out.println("Enter password: ");
        String inputPass = scanner.nextLine();
        
        if (inputName.equals(firstName) && inputPass.equals(firstPass)) {
            System.out.println("You have successfully logged in!");
        } else if (inputName.equals(secondName) && inputPass.equals(secondPass)) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }

    }
}
