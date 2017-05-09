package net.ukr.dreamsicle.ApartmensDataBase;

/**
 * Created by Yura on 09.05.2017.
 */
public class Apartment {
    private int id;
    private String district;
    private String address;
    private int area;
    private int rooms;
    private int price;

    public Apartment() {
    }

    public Apartment(String district, String address, int area, int rooms, int price) {
        this.district = district;
        this.address = address;
        this.area = area;
        this.rooms = rooms;
        this.price = price;
    }

    public Apartment(int id, String district, String address, int area, int rooms, int price) {
        this.id = id;
        this.district = district;
        this.address = address;
        this.area = area;
        this.rooms = rooms;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "id=" + id +
                ", district='" + district + '\'' +
                ", address='" + address + '\'' +
                ", area=" + area +
                ", rooms=" + rooms +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Apartment apartment = (Apartment) o;

        if (id != apartment.id) return false;
        if (area != apartment.area) return false;
        if (rooms != apartment.rooms) return false;
        if (price != apartment.price) return false;
        if (district != null ? !district.equals(apartment.district) : apartment.district != null) return false;
        return address != null ? address.equals(apartment.address) : apartment.address == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (district != null ? district.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + area;
        result = 31 * result + rooms;
        result = 31 * result + price;
        return result;
    }
}
