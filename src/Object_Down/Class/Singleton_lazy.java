package Object_Down.Class;

public class Singleton_lazy {
    private Singleton_lazy() {

    }

    private static Singleton_lazy singletonLazy;

    public static Singleton_lazy getINstance() {
        if (singletonLazy == null) {
            singletonLazy = new Singleton_lazy();
        }
        return singletonLazy;
    }


}
