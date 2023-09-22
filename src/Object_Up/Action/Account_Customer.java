package Object_Up.Action;

import Object_Up.Class.Account;
import Object_Up.Class.Customer;

public class Account_Customer {
    public static void main(String[] args) {
        Customer jS = new Customer("Smith", "Jane");
        Account account = new Account(1000, 2000, 1.23);
        jS.setAccount(account);

        account.deposit(100);
        account.withdraw(960);
        account.withdraw(2000);

        System.out.println("balance is " + jS.getAccount().getBalance());

    }
}
