package test;

import main.Money;
import org.junit.Test;


import static junit.framework.Assert.assertEquals;

public class MoneyTest {

    @Test
    public void shouldTestEquality(){
        Money five = Money.dollar(5);
        assertEquals(five, Money.dollar(5));

        Money three = Money.franc(3);
        assertEquals(three, Money.franc(3));
    }

    @Test
    public void shouldBeAbleToMultiplyDollars(){
        Money fiveDollars = Money.dollar(5);
        Money dollarProduct = fiveDollars.times(5);
        assertEquals(Money.dollar(25),dollarProduct);
    }

    @Test
    public void shouldBeAbleToMultiplyFrancs(){
        Money fiveFrancs = Money.franc(5);
        Money francProduct = fiveFrancs.times(5);
        assertEquals(Money.franc(25),francProduct);
    }

    @Test
    public void shouldBeAbleToAddDollars(){
        Money five = Money.dollar(5);
        Money sum = five.plus(five);
        assertEquals(Money.dollar(10), sum);
    }

    @Test
    public void shouldBeAbleToAddFrancs(){
        Money five = Money.franc(5);
        Money sum = five.plus(five);
        assertEquals(Money.franc(10), sum);
    }
}
