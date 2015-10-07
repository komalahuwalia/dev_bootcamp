package entity;

/**
 * Created by komal on 06/10/15.
 */
public class Item {

    private int id;
    private String name;
    private double price;

    public Item(int id, double price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
