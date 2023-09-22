package Object_Up.Action;

import Object_Up.Class.Bank;

public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.addCustomer("黄", "思奇");
        bank.addCustomer("黄", "思捷");
        System.out.println(bank.getNumberOfCustomer());
        System.out.println(bank.getCustomer(1).toString());

    }
}
