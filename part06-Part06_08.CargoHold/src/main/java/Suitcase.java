
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

        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        }

        int currentWeightSuitcase = 0;

        for (Item itm : this.items) {
            currentWeightSuitcase += itm.getWeight();
        }

        if (this.items.size() == 1) {
            return "1 item (" + currentWeightSuitcase + " kg)";
        }

        return this.items.size() + " items" + " (" + currentWeightSuitcase + " kg)";
    }

    public void printItems() {
        for (Item item : this.items) {
            System.out.println(item);
        }
    }

    public int totalWeight() {
        
        if(this.items.isEmpty()) {
            return 0;
        }
        
        int currentWeightSuitcase = 0;
        
        for (Item itm : this.items) {
            currentWeightSuitcase += itm.getWeight();
        }
        
        return currentWeightSuitcase;
    }
    
    public Item heaviestItem() {
        if(this.items.isEmpty()) {
            return null;
        }
        
        Item returnItem = this.items.get(0);
        
        for (Item item: this.items) {
            if(item.getWeight() > returnItem.getWeight()) {
                returnItem = item;
            }
        }
        
        return returnItem;
    }
}
