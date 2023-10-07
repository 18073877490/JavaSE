package Object_Middle.Action;

import Object_Middle.Class.MyDate;

public class EqualsTest {
    public static void main(String[] args) {
        MyDate m1 = new MyDate(14, 3, 1976);
        MyDate m2 = new MyDate(14, 3, 1976);
        if (m1 == m2) {
            System.out.println("m1==m2");
        } else {
            System.out.println("m1!=m2"); // m1 != m2
        }
        if (m1.equals(m2)) {
            System.out.println("m1 is equal to m2");// m1 is equal to m2
        } else {
            System.out.println("m1 is not equal to m2");
        }

//        三目运算符只能使用基本数据类型，且要求数据类型一致，因此在
//        编译时将其先拆箱，int提升为double然后计算，最后再装箱成double类
//        包装类重写了toString()方法
//        Object o1 = true ? new Integer(1) : new Double(2.0);
//        System.out.println(o1);//
//
//        Object o2;
//        if (true)
//            o2 = new Integer(1);
//        else
//            o2 = new Double(2.0);
//        System.out.println(o2);//
    }

}
