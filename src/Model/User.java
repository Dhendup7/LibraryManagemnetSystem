package Model;


import java.util.ArrayList;

public class User {
    String name;
    int phone_no;
    ArrayList<Orders> orders;

    public User(String name, int phone_no, ArrayList<Orders> orders) {
        this.name = name;
        this.phone_no = phone_no;
        this.orders = orders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhone_no() {
        return phone_no;
    }

    public void setPhone_no(int phone_no) {
        this.phone_no = phone_no;
    }

    public ArrayList<Orders> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Orders> orders) {
        this.orders = orders;
    }
}