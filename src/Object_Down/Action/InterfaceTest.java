package Object_Down.Action;

import Object_Down.Class.ComparableCircle;

public class InterfaceTest {
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle();
        ComparableCircle c2 = new ComparableCircle();

        c1.setRedius(2.4);
        c2.setRedius(2.4);
        System.out.println(c1.compareTo(c2));
    }
}
