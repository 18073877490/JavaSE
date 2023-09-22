package Object_Up.Action;

import Object_Up.Class.Animal;

public class Zoo {
    public static void main(String[] args) {
        Animal cat = new Animal("猫", 4);
//        cat.setLegs(4);
        System.out.println("猫肢体的数量是：" + cat.getLegs());
        cat.eat();
        cat.move();
    }
}
