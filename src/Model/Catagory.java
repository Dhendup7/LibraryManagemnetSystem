package Model;

public class Catagory extends MainCatagory{
    String genre;
    int genre_id = 15;

    public Catagory(String catagory, String genre ) {
        super(catagory);
        this.genre = genre;

    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void info(){
        System.out.println("Genre: "+this.genre);
        System.out.println("Genre ID: "+genre_id);
        super.info();
    }

}