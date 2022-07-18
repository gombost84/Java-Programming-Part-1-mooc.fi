
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        int firstCurrent = 0;
        int firstMax = 100;
        int secondCurrent = 0;
        int secondMax = 100;

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("First: " + firstCurrent + "/" + firstMax);
            System.out.println("Second: " + secondCurrent + "/" + secondMax);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int ammount = Integer.valueOf(parts[1]);

            switch (command) {
                case "add":
                    if (ammount < 0) {
                        continue;
                    }   firstCurrent += ammount;
                    if (firstCurrent > 100) {
                        firstCurrent = 100;
                    }   break;
                case "move":
                    if (ammount < 0) {
                        continue;
                    } else if (firstCurrent - ammount < 0) {
                        ammount = firstCurrent;
                        firstCurrent = 0;
                        secondCurrent += ammount;
                    } else {
                        firstCurrent -= ammount;
                        secondCurrent += ammount;
                    }   if (secondCurrent > 100) {
                        secondCurrent = 100;
                    }   break;
                case "remove":
                    if (secondCurrent == 0) {
                        continue;
                    } else {
                        secondCurrent -= ammount;
                        if (secondCurrent < 0) {
                            secondCurrent = 0;
                        }
                    }   break;
                case "quit":
                    break;
                default:
                    break;
            }
        }
    }

}
