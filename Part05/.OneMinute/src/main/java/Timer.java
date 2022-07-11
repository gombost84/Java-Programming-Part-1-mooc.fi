
public class Timer {
    private ClockHand hundred;
    private ClockHand second;

    public Timer() {
        this.hundred = new ClockHand(100);
        this.second = new ClockHand(60);
    }
    
    public void advance() {
        this.hundred.advance();
        
        if (this.hundred.value() == 0) {
            this.second.advance();
        }
    }
    
    public String toString() {
        return this.second + ":" + this.hundred;
    }
        
}
