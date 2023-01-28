import Model.Books;
import Model.Orders;
import Model.User;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Books b1 = new Books("Book","Fantasy","LittlePrince",15);
        b1.info();
        Books b2 = new Books("Novel","Action","GameofThrone",16);
        b2.info();

        ArrayList<Books> books_list = new ArrayList<>();
        books_list.add(b1);
        books_list.add(b2);

        Orders orders_list = new Orders(books_list);

        ArrayList<Orders> o1 = new ArrayList<Orders>();
        o1.add(orders_list);


        User u1 = new User("Dhendup",992103801,o1);


    }
}
