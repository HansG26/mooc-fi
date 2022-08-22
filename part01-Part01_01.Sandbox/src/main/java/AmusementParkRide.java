
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
    
    public void removeEveryoneOnRide() {
        this.riding.clear();
    }
    
    public double averageHeightOfPeopleOnRide() {
        if (this.riding.isEmpty()) {
            return -1;
        }
        
        int sumOfHeights = 0;
        
        for (Person per: riding) {
            sumOfHeights += per.getHeight();
        }
        
        return (double) sumOfHeights / this.riding.size();
    }
    
    public Person getTallest() {
        if (this.riding.isEmpty()) {
            return null;
        }
        
        Person returnObject = this.riding.get(0);
        
        for (Person prs: riding) {
            if(prs.getHeight() > returnObject.getHeight()) {
                returnObject = prs;
            }
        }
        
        return returnObject;
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
        
        return printOutput + "on the ride: \n" + onTheRide;

    }

}
