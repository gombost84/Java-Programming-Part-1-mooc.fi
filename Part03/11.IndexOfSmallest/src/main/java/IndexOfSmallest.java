
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> list = new ArrayList<>();        

        // implement here a program that reads user input
        // until the user enters 9999
        
        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            
            if (num == 9999) {
                break;
            } else {
                list.add(num);
            }
        }
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        
        int smallest = list.get(0);
        
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            
            if (num < smallest) {
                smallest = num;
            }
        }
        
        System.out.println("Smallest number: " + smallest);
        
        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            
            if (num == smallest) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}
