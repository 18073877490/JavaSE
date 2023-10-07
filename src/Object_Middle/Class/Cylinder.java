package Object_Middle.Class;

public class Cylinder extends Circle {
    private double length;


    public Cylinder(double radius, double length, String color, double weight) {
        super(radius, color, weight);
        this.length = length;
    }

    public Cylinder() {
        super();
    }

    public double findVolume() {
        return super.findArea() * length;
    }

    @Override
    public double findArea() {
        return (super.findArea() + getRadius() * 3.14 * this.length) * 2;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

}
