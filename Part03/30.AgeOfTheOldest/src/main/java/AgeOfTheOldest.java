
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        
        while (true) {
            String line = scanner.nextLine();            
            
            if (line.isEmpty()) {
                break;
            } else {
                String[] splitLine = line.split(",");
                int num = Integer.valueOf(splitLine[1]);
                
                if (num > age) {
                    age = num;
                }
            }            
        }
        System.out.println("Age of the oldest: " + age);
    }
}
