
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Grades grades = new Grades();
        Stats statistics = new Stats();
        System.out.println("Enter point totals, -1 stops:");

        while (true) {
            int point = Integer.valueOf(scanner.nextLine());
            
            if (point == -1) {
                break;
            }
            
            grades.loop(point);
            statistics.setGrades(point);
        }

        System.out.println("Point average (all): " + grades.getAllAvg());

        if (grades.getPassingCounter() == 0) {
            System.out.println("Point average (passing): -");
        } else {
            System.out.println("Point average (passing): " + grades.getPassingAvg());
        }
        
        System.out.println("Pass percentage: " + grades.getPassPercent());
        
        System.out.println("Grade distribution:");
        statistics.getFive();
        statistics.getFour();
        statistics.getThree();
        statistics.getTwo();
        statistics.getOne();
        statistics.getFailed();

        // Write your program here -- consider breaking the program into 
        // multiple classes.
    }
}
