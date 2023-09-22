package Object_Up.Class;

public class Animal {
    private int legs;
    private String name;

    public Animal(String name, int legs) {
        this.name = name;
        this.legs = legs;
    }


    public void setLegs(int i) {
        if (i != 0 && i != 2 && i != 4) {
            System.out.println("Wrong number of legs");
            return;
        }
        legs = i;
    }

    public int getLegs() {
        return legs;
    }

    public void eat() {
        System.out.println("Eating.");
    }

    public void move() {
        System.out.println("moving.");
    }
}
