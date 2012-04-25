package main;


public class Money {

    int amount;
    String currency;
    
    private Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }
    public static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    public static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    public Money times(int amount) {
        return new Money(this.amount * amount, this.currency);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Money)) return false;

        Money money = (Money) o;

        if (amount != money.amount) return false;
        if (!currency.equals(money.currency)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = amount;
        result = 31 * result + currency.hashCode();
        return result;
    }

    public Money plus(Money addend) {
        return new Money(amount + addend.amount, currency);
    }
}
