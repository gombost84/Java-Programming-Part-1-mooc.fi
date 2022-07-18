
public class Main {

    public static void main(String[] args) {
        // you can write code here for testing your program

        Song jackSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);
        Song anotherSparrow = new Song("The Lonely Island", "Jack Sparrow", 196);

        if (jackSparrow.equals(anotherSparrow)) {
            System.out.println(jackSparrow.equals(anotherSparrow));
            System.out.println("Songs are equal.");
        }

        if (jackSparrow.equals("Another object")) {
            System.out.println("Strange things are afoot.");
        }

        Song song1 = new Song("Ismo Leikola", "Pendolino", 194);
        Song song2 = new Song("Ismo Leikola", "Pendolino", 194);
        
        System.out.println(song1.equals(song2));
    }
}
