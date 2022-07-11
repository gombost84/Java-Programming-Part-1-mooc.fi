
import java.util.ArrayList;

public class Room {

    private ArrayList<Person> persons = new ArrayList<>();

    public Room() {
    }

    public void add(Person person) {
        this.persons.add(person);
    }

    public boolean isEmpty() {
        if (this.persons.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons() {
        return this.persons;
    }

    public Person shortest() {
        if (this.persons.isEmpty()) {
            return null;
        }

        Person shorty = this.persons.get(0);

        for (Person prs : this.persons) {
            if (prs.getHeight() < shorty.getHeight()) {
                shorty = prs;
            }
        }
        return shorty;
    }

    public Person take() {
        if (this.persons.isEmpty()) {
            return null;
        }

        Person shortest = this.shortest();

        this.persons.remove(shortest);

        return shortest;
    }
}
