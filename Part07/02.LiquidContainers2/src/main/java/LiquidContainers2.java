
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Container cont1 = new Container();
        Container cont2 = new Container();

        while (true) {
            System.out.println("First: " + cont1.toString());
            System.out.println("Second: " + cont2.toString());

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
                        break;
                    }
                    cont1.add(ammount);
                    break;
                case "move":
                    if (ammount < 0) {
                        break;
                    } else if (cont1.contains() < ammount) {
                        ammount = cont1.contains();
                    }
                    cont1.remove(ammount);
                    cont2.add(ammount);
                    break;
                case "remove":
                    if (cont2.contains() == 0) {
                        break;
                    }
                    cont2.remove(ammount);
                    break;
                default:
                    break;
            }
        }
    }

}
