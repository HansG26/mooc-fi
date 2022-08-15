
public class AmusementParkRide {
    private String name;
    private int lowestHeight;
    private int visitors;
    
    public AmusementParkRide(String name, int lowestHeight) {
        this.name = name;
        this.lowestHeight = lowestHeight;
        this.visitors = 0;
    }
    
    public boolean allowedToRide(Person person) {
        if (person.getHeight() > lowestHeight) {
            this.visitors++;
            return true;
        }
        
        return false;
    }
    
     public String toString() {
         return this.name + ", minimum height: " + this.lowestHeight + ", visitors: " + this.visitors;
     }
     
     
}
