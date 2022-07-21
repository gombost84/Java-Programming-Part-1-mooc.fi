
public class Stats {

    private int failed;
    private int one;
    private int two;
    private int three;
    private int four;
    private int five;

    public Stats() {
        this.failed = 0;
        this.one = 0;
        this.two = 0;
        this.three = 0;
        this.four = 0;
        this.five = 0;
    }
    
    public void getFailed() {
        System.out.print("0: ");
        for (int i = 0; i < failed; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
    
    public void getOne() {
        System.out.print("1: ");
        for (int i = 0; i < one; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
    
    public void getTwo() {
        System.out.print("2: ");
        for (int i = 0; i < two; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
    
    public void getThree() {
        System.out.print("3: ");
        for (int i = 0; i < three; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
    
    public void getFour() {
        System.out.print("4: ");
        for (int i = 0; i < four; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
    
    public void getFive() {
        System.out.print("5: ");
        for (int i = 0; i < five; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public void setGrades(int num) {
        if (num < 0) {
            return;
        }
        if (num < 50) {
            failed++;
        } else if (num < 60) {
            one++;
        } else if (num < 70) {
            two++;
        } else if (num < 80) {
            three++;
        } else if (num < 90) {
            four++;
        } else if (num <= 100) {
            five++;
        }
    }
}
