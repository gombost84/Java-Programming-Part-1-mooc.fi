
public class Container {

    private int contains;
    private int max = 100;
    private int min = 0;

    public Container() {
    }

    public int contains() {
        return this.contains;
    }

    public void add(int amount) {
        if (amount < 0) {
        } else {
            this.contains += amount;
            if (this.contains > this.max) {
                this.contains = this.max;
            }
        }
    }

    public void remove(int amount) {
        this.contains -= amount;
        if (this.contains < this.min) {
            this.contains = this.min;
        }
    }

    @Override
    public String toString() {
        return this.contains + "/" + this.max;
    }
}
