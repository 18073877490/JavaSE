package Object_Down.Action;

import Object_Down.Class.Bank;

public class BankTest {
    public static void main(String[] args) {
        Bank a = new Bank("123", 2404.5);
        Bank b = new Bank("321", 12059);

        a.display();
        b.display();
    }
}
