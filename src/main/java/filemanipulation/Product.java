package filemanipulation;

public class Product {
    String ID;
    String name;
    int price;

    public Product(String ID, String name, int price) {
        this.ID = ID;
        this.name = name;
        this.price = price;
    }



    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
