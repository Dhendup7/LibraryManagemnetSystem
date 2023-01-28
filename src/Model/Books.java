package Model;

public class Books extends Catagory{
    String name;
    int book_id;

    String reviews = "Very Nice";

    public Books(String catagory, String genre, String name, int book_id ) {
        super(catagory, genre );
        this.name = name;
        this.book_id = book_id;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    @Override
    public void info(){
        System.out.println("Book Name: "+this.name);
        System.out.println("Book ID: "+this.book_id);
        System.out.println("Reviews: "+reviews);
        super.info();
    }

}