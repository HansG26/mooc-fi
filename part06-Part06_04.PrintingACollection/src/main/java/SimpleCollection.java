
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {

        String output = "The collection " + this.name;
        String listOfElements = "";
        int numberOfElements = this.elements.size();

        if (numberOfElements == 0) {
            return output + " is empty.";
        }

        for (int i = 0; i < this.elements.size(); i++) {
            if(i + 1 == this.elements.size()) {
                listOfElements += this.elements.get(i);
                continue;
            }
            listOfElements += this.elements.get(i) + "\n";
            
        }

        if (numberOfElements == 1) {
            return output + " has " + numberOfElements + " element:\n" + this.elements.get(0);
        }

        return output + " has " + numberOfElements + " elements:\n" + listOfElements;

    }
}
