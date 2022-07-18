
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public Money plus(Money addition) {
        Money bigMoney = new Money((this.euros + addition.euros), (this.cents + addition.cents));

        return bigMoney;
    }

    public boolean lessThan(Money compared) {
        if ((this.euros < compared.euros) || (this.euros == compared.euros && this.cents < compared.cents)) {
            return true;
        }
        return false;
    }
    
    public Money minus(Money decreaser) {
        
        int eur = this.euros - decreaser.euros;
        int cents;
        
        if ((this.cents - decreaser.cents) < 0) {
            eur--;
            cents = 100 - (decreaser.cents - this.cents);
        } else {
            cents = this.cents - decreaser.cents;
        }
        
        if (eur < 0) {
            eur = 0;
            cents = 0;
        }
        
        Money smallMoney = new Money(eur, cents);
        
        return smallMoney;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
