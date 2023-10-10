package Object_Down.Class;

import Object_Middle.Class.MyDate;

public class HourlyEmployee extends Employee {
    private double wage;
    private int hour;

    public HourlyEmployee() {

    }

    public HourlyEmployee(String name, int number, MyDate birthday, double wage, int hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    @Override
    public double earnings() {
        return wage * hour;
    }
}
