
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int ageSum = 0;
        int counter = 0;
        
        while (true) {
            String line = scanner.nextLine();
            
            if (line.isEmpty()) {
                break;
            } else {
                counter += 1;
                String[] splitLine = line.split(",");
                String string = splitLine[0];
                int num = Integer.valueOf(splitLine[1]);
                
                ageSum += num;
                
                if (string.length() > name.length()) {
                    name = string;
                }
            }
        }
        
        System.out.println("Longest name: "+ name);
        System.out.println("Average of the birth years: " + ((1.0 * ageSum) / (1.0 * counter)));
    }
}
