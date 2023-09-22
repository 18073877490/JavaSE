package Object_Up.Action;

import java.util.Arrays;

public class VariableAgrument {
    public static void main(String[] args) {
        VariableAgrument vg = new VariableAgrument();
        vg.test(new String[]{"hello", "world"});
        vg.test1("good", "bad");
        vg.test1("man");

    }

    public void test(String[] msg) {
        System.out.println(Arrays.toString(msg));
    }

    public void test1(String book) {
        System.out.println(book);
    }

    public void test1(String... book) {
        System.out.println(Arrays.toString(book));
    }
}
