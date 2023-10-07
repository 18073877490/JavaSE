package Object_Middle.Class;

public class Order {
    protected int orderId;
    protected String orderName;

    public Order() {

    }

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    public boolean equals(Order obj) {
        return (orderId == obj.getOrderId()) && (orderName.equals(obj.getOrderName()));
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
}
