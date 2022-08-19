
public class Item {
    
    private String identifier;
    private String name;
    
    public Item(String identifier, String name) {
        this.identifier = identifier;
        this.name = name;
    }
    
    @Override
    public String toString() {
        return this.identifier + ": " + this.name;
    }
}
