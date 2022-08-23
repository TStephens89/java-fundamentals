package inheritance;

public class Shop extends Business {

    String description;

    public Shop(String shopName, String description, int price, int stars) {
        super(name, stars, price);
        this.description = description;
    }

    public String toString(){
        return super.toString() + "\nDescription: " + this.description;
    }
}