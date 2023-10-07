package Object_Down.Class;
public class Singleton_hungry {
    private Singleton_hungry() {

    }

    private static Singleton_hungry singletonHungry = new Singleton_hungry();

    public static Singleton_hungry getInstance() {
        return singletonHungry;
    }
}
