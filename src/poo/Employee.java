package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
    private final String name;
    private double salary;
    private final Date contractDay;
    private static int idNext;
    private final int id;

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day);
        this.contractDay = calendar.getTime();
        ++idNext;
        id = idNext;
    }

    public Employee(String name) {
        this(name, 30000, 2000, 1, 1);
    }

    public int getId(){
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public Date getContractDay() {
        return this.contractDay;
    }

    public void incrementSalary(double percentage) {
        double increment = this.salary * (percentage / 100);
        salary += increment;
    }
}
