package com.company;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    private static int numberOfEmployees;

    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }
    public Employee(int baseSalary){
        this(baseSalary,0);
    }

    public static void printNumberOfEmployees(){
        System.out.println(numberOfEmployees);
    }
    private void setBaseSalary(int baseSalary){
        if(baseSalary <= 0)
           throw new IllegalArgumentException("Salary cannot be 0 or less");
        this.baseSalary = baseSalary;
    }

    public int calculateWage(int extraHours){
        return baseSalary + (hourlyRate * extraHours);
    }
    public int calculateWage(){
        return calculateWage(0);
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0)
            throw new IllegalArgumentException("Hours cannot be 0 or less");
        this.hourlyRate = hourlyRate;
    }

    private int getHourlyRate(){
        return hourlyRate;
    }
}
