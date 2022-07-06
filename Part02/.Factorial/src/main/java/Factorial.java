
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int fac = 1;
        
        System.out.print("Give a number: ");
        int num = Integer.valueOf(scanner.nextLine());
        
        if (num != 0) {
            for (int i = 1; i <= num; i++) {
                fac *= i;
            }
        }
        System.out.println("Factorial: " + fac);
    }
}
