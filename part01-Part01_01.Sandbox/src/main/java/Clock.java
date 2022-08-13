
public class Clock {
    private ClockHand hours;
    private ClockHand minutes;
    private ClockHand seconds;
    
    public Clock() {
        this.hours = new ClockHand(24);
        this.minutes = new ClockHand(60);
        this.seconds = new ClockHand(60);
    }
    
    public void advance() {
        while (true) {
            seconds.advance();
            
            if (seconds.getValue() == 0) {
                minutes.advance();
                
                if (minutes.getValue() == 0) {
                    hours.advance();
                }
            }
        }
    }
}
