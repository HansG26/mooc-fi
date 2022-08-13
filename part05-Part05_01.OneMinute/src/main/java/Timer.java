
public class Timer {

    private ClockHand hundreths;
    private ClockHand seconds;

    public Timer() {
        this.hundreths = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }

    public void advance() {
        this.hundreths.advance();

        if (hundreths.value() == 0) {
            this.seconds.advance();
        }

    }

    @Override
    public String toString() {

        String timer = "";

        if (this.seconds.value() < 10) {
            timer += "0" + this.seconds.value();
        } else {
            timer += this.seconds.value();
        }

        timer += ":";

        if (this.hundreths.value() < 10) {
            timer += "0" + this.hundreths.value();
        } else {
            timer += this.hundreths.value();
        }

        return timer;

    }
}
