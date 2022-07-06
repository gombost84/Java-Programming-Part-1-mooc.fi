
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            String line = scanner.nextLine();
            
            if (line.isEmpty()) {
                break;
            } else {
                String [] splitLine = line.split(" ");
                System.out.println(splitLine[splitLine.length - 1]);
            }
        }
    }
}
