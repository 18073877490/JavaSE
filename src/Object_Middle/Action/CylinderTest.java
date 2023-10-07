package Object_Middle.Action;

import Object_Middle.Class.Circle;
import Object_Middle.Class.Cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();

        cylinder.setRadius(2.0);
        cylinder.setLength(2);

        System.out.printf("对于底面半径为%.2f 高度为%.2f的圆柱体\n", cylinder.getRadius(), cylinder.getLength());
        System.out.printf("其表面积为：%.2f\t体积为：%.2f\n", cylinder.findArea(), cylinder.findVolume());

        Circle circle = new Cylinder(2.0, 2.0, "blue", 10);
        System.out.println(circle.findArea());
        

    }
}
