package Model;

import java.util.ArrayList;

public class Orders {
    ArrayList<Books> books;

    public Orders(ArrayList<Books> books) {
        this.books = books;
    }

    public ArrayList<Books> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Books> books) {
        this.books = books;
    }
}
