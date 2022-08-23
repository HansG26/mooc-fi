
import java.util.ArrayList;

public class Hold {

    private ArrayList<Suitcase> suitcases;
    private int maxWeight;

    public Hold(int maximumWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maximumWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        
        int weightSuitcase = suitcase.totalWeight();
        int currentWeightHold = 0;

        for (Suitcase suitc : this.suitcases) {
            currentWeightHold += suitc.totalWeight();
        }

        if (weightSuitcase + currentWeightHold <= this.maxWeight) {
            this.suitcases.add(suitcase);
        }
    }

    public String toString() {

        int currentWeightHold = 0;

        for (Suitcase suitc : this.suitcases) {
            currentWeightHold += suitc.totalWeight();
        }

        return this.suitcases.size() + " suitcases" + " (" + currentWeightHold + " kg)";
    }
}
