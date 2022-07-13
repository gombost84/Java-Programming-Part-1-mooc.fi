
import java.util.ArrayList;

public class ExerciseManagement {

    private ArrayList<Exercise> exerciseList;

    public ExerciseManagement() {
        this.exerciseList = new ArrayList<>();
    }

    public ArrayList<String> exerciseList() {

        ArrayList<String> listOfExc = new ArrayList<>();

        exerciseList.forEach(exc -> {
            listOfExc.add(exc.getName());
        });

        return listOfExc;
    }

    public void add(String exc) {
        Exercise toAdd = new Exercise(exc);
        exerciseList.add(toAdd);
    }

    public boolean isCompleted(String exc) {
        for (Exercise name : exerciseList) {
            if (name.getName().equals(exc)) {
                return name.isComplete();
            }
        }
        return false;
    }

    public void markAsCompleted(String name) {
        for (Exercise exc : exerciseList) {
            if (exc.getName().equals(name)) {
                exc.setComplete(true);
            }
        }
    }

}
