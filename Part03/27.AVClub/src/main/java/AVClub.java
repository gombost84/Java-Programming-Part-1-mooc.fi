
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        while (true) {
            String line = scanner.nextLine();
            
            if (line.isEmpty()) {
            break;
            } else {
                String[] splitLine = line.split(" ");
                
                for (String word : splitLine) {
                    if (word.contains("av")) {
                        System.out.println(word);
                    }
                }
            }
        }
    }
}
