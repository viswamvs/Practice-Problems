package com.company;

public class SimpleInterest {
    private int principal;
    private int period;
    private int interestRate;

    public SimpleInterest(int principal, int period, int interestRate) {
        this.principal = principal;
        this.period = period;
        this.interestRate = interestRate;
    }

    public int calculateSimpleInterest() {
        return ((principal*period*interestRate) / 100);
    }
}
