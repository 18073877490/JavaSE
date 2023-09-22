package Object_Up.Class;

public class Bank {
    private Customer[] customers;
    private int numberOfCustomer;

    public Bank() {
        customers = new Customer[10];
        numberOfCustomer = 0;
    }

    public void addCustomer(String f, String l) {
        Customer customer = new Customer(f, l);
        customer.setAccount(new Account(numberOfCustomer, 0, 1.23));
        customers[numberOfCustomer] = customer;
        numberOfCustomer++;
    }

    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    public Customer getCustomer(int index) {
        return customers[index];
    }
}
