
import java.util.ArrayList;

public class Suitcase {

    private ArrayList<Item> items;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item) {
        int weightItem = item.getWeight();
        int currentWeightSuitcase = 0;

        for (Item itm : this.items) {
            currentWeightSuitcase += itm.getWeight();
        }

        if (weightItem + currentWeightSuitcase <= maxWeight) {
            this.items.add(item);
        }
    }

    public String toString() {

        int currentWeightSuitcase = 0;

        for (Item itm : this.items) {
            currentWeightSuitcase += itm.getWeight();
        }

        return this.items.size() + " items " + " (" + currentWeightSuitcase + " kg)";
    }
}
