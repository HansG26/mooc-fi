
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
    
    public Money plus(Money addition) {
        
        int newEuros = this.euros + addition.euros;
        int newCents = this.cents + addition.cents;
        
        Money money = new Money(newEuros, newCents);
        
        return money;
    }
    
    public boolean lessThan(Money compared) {
        if (compared.euros < this.euros) {
            return false;
        }
        
        if ((compared.euros == this.euros) && compared.cents < this.cents) {
            return false;
        }
        
        return true;
        
    }
    
    public Money minus(Money decreaser) {
        
        if (decreaser.euros > this.euros) {
            return new Money(0, 0);
        }
        
        if (decreaser.euros == this.euros && decreaser.cents > this.cents) {
            return new Money(0, 0);
        }
        
        int newEuros = this.euros - decreaser.euros;
        int newCents = this.cents - decreaser.cents;
        
        if (newCents < 0) {
            newEuros--;
            newCents = 100 + newCents;
        }
        
        return new Money(newEuros, newCents);
    }

}
