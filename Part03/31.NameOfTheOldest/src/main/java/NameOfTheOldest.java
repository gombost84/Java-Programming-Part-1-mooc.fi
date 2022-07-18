
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        String name = "name";
        
        while (true) {
            String line = scanner.nextLine();
            
            if (line.isEmpty()) {
                break;
            } else {
                String[] splitLine = line.split(",");
                String string = splitLine[0];
                int num = Integer.valueOf(splitLine[1]);
                                
                if (num > age) {
                    age = num;
                    name = string;
                }
            }
        }
        System.out.println("Name of the oldest: " + name);
    }
}
