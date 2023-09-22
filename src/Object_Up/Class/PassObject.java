package Object_Up.Class;

public class PassObject {
    public static void main(String[] args) {
        PassObject pO = new PassObject();
        pO.printAreas(new Circle(), 5);
    }

    public void printAreas(Circle c, int time) {
        for (int i = 1; i <= time; i++) {
            c.radius = i;
//            System.out.println(c.radius + "\t" + c.findArea());
            System.out.printf("%.1f\t%.2f\n", c.radius, c.findArea());
        }
    }
}
