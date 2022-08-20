
public class Counter {
    private int value;
    
    public Counter(int value) {
        this.value = value;
    }
    
    public Counter() {
        this(0);
    }
    
    public void increase() {
        this.value++;
    }
    
    public String toString() {
        return "value: " + this.value;
    }
    
    public Counter clone() {
        return new Counter(this.value); 
    }
}
