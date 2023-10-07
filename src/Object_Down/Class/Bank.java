package Object_Down.Class;

public class Bank {
    private int account;
    private static int total = 0;
    private String password;
    private double balance;
    private static double rate = 0.032;
    private static double minBalance = 100;

    public Bank(String password, double balance) {
        total++;
        account = total;
        this.password = password;
        this.balance = balance;
    }

    public void display() {
        System.out.printf("Account is %d\t balance is %.2f \trate is %.2f\t" +
                "minBalance is %.2f\n", getAccount(), getBalance(), getRate(), getMinBalance());
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public static int getTotal() {
        return total;
    }

    public static void setTotal(int total) {
        Bank.total = total;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getRate() {
        return rate;
    }

    public static void setRate(double rate) {
        Bank.rate = rate;
    }

    public static double getMinBalance() {
        return minBalance;
    }

    public static void setMinBalance(double minBalance) {
        Bank.minBalance = minBalance;
    }
}
