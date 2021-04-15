package com.company;

public class CompoundInterest {
    private double principal;
    private double period;
    private double interestRate;

    public CompoundInterest(double principal, double period, double interestRate) {
        this.principal = principal;
        this.period = period;
        this.interestRate = interestRate;
    }

    public double calculateCompoundInterest() {
        return (principal * Math.pow(1 + (period / 100), interestRate));
    }
}
