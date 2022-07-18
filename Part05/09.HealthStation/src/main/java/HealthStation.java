
public class HealthStation {
    
    private int numberOfWeighins = 0;

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        numberOfWeighins += 1;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        int weight = person.getWeight();
        person.setWeight(weight + 1);
    }
    
    public int weighings() {
        return numberOfWeighins;
    }

}
