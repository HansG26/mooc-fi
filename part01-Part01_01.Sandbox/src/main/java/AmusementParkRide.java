
import java.util.ArrayList;


public class AmusementParkRide {
    private String name;
    private int lowestHeight;
    private int visitors;
    private ArrayList<Person> riding;
    
    public AmusementParkRide(String name, int lowestHeight) {
        this.name = name;
        this.lowestHeight = lowestHeight;
        this.visitors = 0;
        this.riding = new ArrayList<>();
    }
    
    public boolean isAllowedOn(Person person) {
        if (person.getHeight() > lowestHeight) {
            this.visitors++;
            riding.add(person);
            return true;
        }
        
        return false;
    }
    
     public String toString() {
         return this.name + ", minimum height: " + this.lowestHeight + ", visitors: " + this.visitors;
     }
     
     
}
