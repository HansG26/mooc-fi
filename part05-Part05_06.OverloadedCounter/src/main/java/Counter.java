
public class Counter {
    private int value;
    
    public Counter(int startValue) {
        this.value = startValue;
    }
    
    public Counter() {
        this(0);
    }
    
    public int value() {
        return this.value;
    }
    
    public void increase(int increaseBy) {
        this.value += increaseBy;
    }
    
    public void increase() {
        this.increase(1);
    }
    
    public void decrease(int decreaseBy) {
        this.value -= decreaseBy;
    }
    
    public void decrease() {
        this.decrease(1);
    }
}
