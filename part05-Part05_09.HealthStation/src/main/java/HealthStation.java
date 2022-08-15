
public class HealthStation {
    
    private int weighings;

    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.weighings++;
        return person.getWeight();
    }
    
    public int weighings() {
        return this.weighings;
    }
    
    public void feed(Person person) {
        person.setWeight(person.getWeight() + 1);
    }

}
