
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter

        BirdManager newBirds = new BirdManager();
        
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            System.out.println("?");
            String command = scan.nextLine();
            
            switch (command) {
                case "Add":
                    System.out.println("Name: ");
                    String name = scan.nextLine();
                    System.out.println("Name in Latin: ");
                    String latinName = scan.nextLine();
                    Bird bird = new Bird(name, latinName);
                    newBirds.addBird(bird);
                    break;
                case "Observation":
                    System.out.println("Bird?");
                    String observedBird = scan.nextLine();
                    newBirds.addObservation(observedBird);
                    break;
                case "All":
                    System.out.println(newBirds.toString());
                    break;
                case "One":
                    System.out.println("Bird? ");
                    String oneBird = scan.nextLine();
                    newBirds.getOne(oneBird);
                    break;
                case "Quit":
                    return;
            }
        }
        

    }

}
