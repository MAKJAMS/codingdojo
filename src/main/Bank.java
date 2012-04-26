package main;

import java.util.Hashtable;

public class Bank {

    private Hashtable rates = new Hashtable();

    public Money reduce(Expression source, String currency) {
        return source.reduce(this, currency);
    }

    public int rate(String from, String to){
        return from.equals(to)? 1 : (Integer) rates.get(new Pair(from, to));
    }

    public void addRate(String from, String to, int rate) {
        rates.put(new Pair(from,to), rate);
    }
}
