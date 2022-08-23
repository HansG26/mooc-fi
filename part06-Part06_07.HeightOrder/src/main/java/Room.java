
import java.util.ArrayList;


public class Room {
    private ArrayList<Person> persons;
    
    public Room() {
        this.persons = new ArrayList<>();
    } 
    
    public void add(Person person) {
        this.persons.add(person);
    }
    
    public boolean isEmpty() {
        return persons.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return this.persons;
    }
}
