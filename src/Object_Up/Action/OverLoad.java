package Object_Up.Action;

public class OverLoad {
    public static void main(String[] args) {
        System.out.println(mOL(3));
        System.out.println(mOL(3, 4));
        mOL("Hello");
    }

    public static int mOL(int x) {
        return x * x;
    }

    public static int mOL(int x, int y) {
        return x * y;
    }

    public static void mOL(String str) {
        System.out.println(str);
    }
}
