package Object_Down.Class;

import Object_Middle.Class.MyDate;

public class SalariedEmployee extends Employee {
    private double monthlySalary;
    public MyDate today;

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, int number, MyDate birthday, double monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double earnings() {
        return monthlySalary;
    }
}
