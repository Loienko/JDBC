package net.ukr.dreamsicle.OrdersDataBase.Orders;

/**
 * Created by Yura on 09.05.2017.
 */
public class Client {
    private int id;
    private String name;
    private String city;
    private int phone;

    public Client() {
    }

    public Client(String name, String city, int phone) {
        this.name = name;
        this.city = city;
        this.phone = phone;
    }

    public Client(int id, String name, String city, int phone) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", phone=" + phone +
                '}';
    }

}
