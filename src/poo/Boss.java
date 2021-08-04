package poo;

public class Boss extends Employee {
    private double incentive;

    public Boss(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
    }

    public void setIncentive(double incentive) {
        this.incentive = incentive;
    }

    public double getSalary() {
        double bossSalary = super.getSalary();
        return bossSalary + incentive;
    }

}
