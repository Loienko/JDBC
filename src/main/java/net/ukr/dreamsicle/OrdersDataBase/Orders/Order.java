package net.ukr.dreamsicle.OrdersDataBase.Orders;

/**
 * Created by Yura on 09.05.2017.
 */
public class Order {
    private int id;
    private int date;
    private int orderId;

    public Order() {
    }

    public Order(int date, int orderId) {
        this.date = date;
        this.orderId = orderId;
    }

    public Order(int id, int date, int orderId) {
        this.id = id;
        this.date = date;
        this.orderId = orderId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", date=" + date +
                ", orderId=" + orderId +
                '}';
    }
}
