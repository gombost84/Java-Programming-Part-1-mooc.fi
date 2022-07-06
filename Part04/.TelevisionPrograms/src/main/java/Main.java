import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Name: ");
            String title = scanner.nextLine();
            
            if (title.isEmpty()) {
                break;
            } else {
                System.out.print("Duration: ");
                int duration = Integer.valueOf(scanner.nextLine());
                
                programs.add(new TelevisionProgram(title, duration));
            }
        }
        
        System.out.println("Program's maximum duration? ");
        int length = Integer.valueOf(scanner.nextLine());
        
        for(TelevisionProgram program : programs) {
            if (program.getDuration() <= length) {
                System.out.println(program);
            }
        }
    }
}
