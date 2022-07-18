
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int pointTotals = 0;
        int counter = 0;
        int passingTotal = 0;
        int passingCounter = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter point totals, -1 stops:");

        while (true) {
            int point = Integer.valueOf(scanner.nextLine());
            
            if (point == -1) {
                break;
            } else if (point >= 0) {
                pointTotals += point;
                counter++;
                if (point > 50) {
                    passingTotal += point;
                    passingCounter++;
                }
            }
        }
        
        double allAvg = (1.0 * pointTotals) / (1.0 * counter);
        double passingAvg = (1.0 * passingTotal) / (1.0 * passingCounter);

        System.out.println("Point average (all): " + allAvg);
        
        if (passingCounter == 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + passingAvg);
        }

        // Write your program here -- consider breaking the program into 
        // multiple classes.
    }
}
