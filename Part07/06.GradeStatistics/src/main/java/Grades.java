
public class Grades {

    private int pointTotals;
    private int counter;
    private int passingTotal;
    private int passingCounter;

    Grades() {
        this.pointTotals = 0;
        this.counter = 0;
        this.passingTotal = 0;
        this.passingCounter = 0;
    }

    public int getPointTotals() {
        return pointTotals;
    }

    public int getCounter() {
        return counter;
    }

    public int getPassingTotal() {
        return passingTotal;
    }

    public int getPassingCounter() {
        return passingCounter;
    }

    public double getAllAvg() {
        return (1.0 * pointTotals) / (1.0 * counter);
    }

    public double getPassingAvg() {
        return (1.0 * passingTotal) / (1.0 * passingCounter);
    }

    public double getPassPercent() {
        return 100 * ((1.0 * passingCounter) / (1.0 * counter));
    }

    public void loop(int num) {
        if (0 < num && num < 100) {
            pointTotals += num;
            counter++;
            if (50 <= num) {
                passingTotal += num;
                passingCounter++;
            }
        }
    }
}
