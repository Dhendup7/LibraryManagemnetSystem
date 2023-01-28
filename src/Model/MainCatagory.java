package Model;

public class MainCatagory {
    String catagory;
    String Library_name="DSS Library";

    public MainCatagory(String catagory) {
        this.catagory = catagory;

    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }

    public void info(){
        System.out.println("Type: "+this.catagory);
        System.out.println("Library: "+Library_name);
    }


}