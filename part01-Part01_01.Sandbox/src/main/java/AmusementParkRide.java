
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

        String printOutput = this.name
                + ", minimum height requirement : " + this.lowestHeight
                + ", visitors: " + this.visitors + "\n";
        
        if (riding.isEmpty()) {
            return printOutput + "no on is on the ride.";
        }

        String onTheRide = "";
        for (Person person : this.riding) {
            onTheRide = onTheRide + person.getName() + "\n";
        }
        
        return printOutput + "\n" + "on the ride: \n" + onTheRide;

    }

}
