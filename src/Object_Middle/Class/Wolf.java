package Object_Middle.Class;

public class Wolf extends Animal {
    public Wolf() {
        super("熊大", 2);
        System.out.println("wolf无参构造器");
    }

    public static void main(String[] args) {
        new Wolf();
    }
}

class Animal extends Creature {
    public Animal() {
        super("熊二");
        System.out.println("Animal 无参构造器");
    }

    public Animal(String name) {
        super("熊大");
        System.out.println("Animal 有参构造器，name:" + name);
    }

    public Animal(String name, int age) {
        this(name);
        System.out.println("Animal两个参数构造器，其age:" + age);
    }
}

class Creature {
//    public Creature() {
//        System.out.println("Creature 无参构造器");
//    }

    public Creature(String name) {
        System.out.println("Creature 有参构造器" + name);
    }
}