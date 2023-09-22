package Object_Up.Class;

public class Account {
    private int id;
    private double balance;     //余额
    private double annuallnterstRate;    //年利率

    public Account(int id, double balance, double annuallnterstRate) {
        this.id = id;
        this.balance = balance;
        this.annuallnterstRate = annuallnterstRate;
    }

    //    取钱
    public void withdraw(double amount) {
        if (balance - amount >= 0) {
            balance -= amount;
            System.out.println("成功取出： " + amount);
        } else {
            System.out.println("余额不足，操作失败");
            return;
        }
    }

    //    存钱
    public void deposit(double amount) {
        balance += amount;
        System.out.println("成功存入：" + amount);
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnuallnterstRate() {
        return annuallnterstRate;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnuallnterstRate(double annuallnterstRate) {
        this.annuallnterstRate = annuallnterstRate;
    }
}
