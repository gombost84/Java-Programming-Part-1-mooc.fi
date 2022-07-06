
public class Statistics {
    private int numberCount;
    private int sum;
    
    public Statistics() {
        
    }
    
    public void addNumber(int number) {
        this.sum += number;
        this.numberCount += 1;
    }
    
    public int getCount() {
        return this.numberCount;
    }
    
    public int sum() {
        return this.sum;
    }
    
    public double average() {
        if (this.numberCount == 0) {
            return 0.0;
        } else {
            return (1.0 * this.sum) / (1.0 * this.numberCount);
        }
    }
}
