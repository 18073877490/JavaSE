package Object_Down.Class;

import Object_Middle.Class.MyDate;

public abstract class Employee {
    protected String name;
    protected int number;
    protected MyDate birthday;

    public Employee() {
    }

    public Employee(String name, int number, MyDate birthday) {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    public abstract double earnings(); //工资


    public String toString() {
        return "name is " + name + "\tnumber is " + number + "\tbirthday is "
                + birthday.toDateString();
    }

    public MyDate getBirthday() {
        return birthday;
    }
}

