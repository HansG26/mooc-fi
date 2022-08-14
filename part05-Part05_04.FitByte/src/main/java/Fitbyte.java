
public class Fitbyte {
    
    private int age;
    private int restingHeartRate;
    
    public Fitbyte(int age, int restingHeartRate) {
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }
    
    public double targetHeartRate(double percentageOfMaximum) {
        return (this.maximumHearthRate() - this.restingHeartRate) * percentageOfMaximum + this.restingHeartRate;
    }
    
    public double maximumHearthRate() {
        return 206.3 - (0.711 * this.age);
    }
}
