package Object_Down.Action;

import Object_Down.Class.Employee;
import Object_Down.Class.HourlyEmployee;
import Object_Down.Class.SalariedEmployee;
import Object_Middle.Class.MyDate;

import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();
        double salary = 0;

        Employee[] employees = new Employee[3];
        employees[0] = new SalariedEmployee("黄思奇", 1,
                new MyDate(16, 10, 2000), 15000);
        employees[1] = new HourlyEmployee("张三", 2, new MyDate(1, 10,
                2000), 30, 200);
        employees[2] = new HourlyEmployee("李四", 3, new MyDate(10, 1,
                1997), 27.5, 240);

        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
            if ((month == employees[i].getBirthday().getMonth())) {
                salary = employees[i].earnings() + 100;
                System.out.println("该员工本月过生日，追加一百元，总共工资是：" + salary);
            } else {
                salary = employees[i].earnings();
                System.out.println("该员工本月总共工资是：" + salary);
            }
        }
    }
}
