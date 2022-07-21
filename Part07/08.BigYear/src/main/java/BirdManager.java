
import java.util.ArrayList;

public class BirdManager {

    private ArrayList<Bird> birds;

    public BirdManager() {
        this.birds = new ArrayList<>();
    }

    public void addBird(Bird bird) {
        this.birds.add(bird);
    }

    public void addObservation(String name) {
        birds.forEach(bird -> {
            if (bird.getName().equals(name)) {
                bird.setCounter();
            }
        });
    }

    public void getOne(String name) {
        birds.forEach(bird -> {
            if (bird.getName().equals(name)) {
                System.out.println(bird.getName() + "(" + bird.getLatinName() + ")" + ": " + bird.getCounter() + " observations");
            }
        });
    }

    @Override
    public String toString() {
        String birdsReturn = "";

        for (int i = 0; i < birds.size(); i++) {
            Bird tempBird = birds.get(i);
            birdsReturn += tempBird.getName() + "(" + tempBird.getLatinName() + ")" + ": " + tempBird.getCounter() + " observations";
        }

        return birdsReturn;
    }
}
