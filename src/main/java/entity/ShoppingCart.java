package entity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by komal on 07/10/15.
 */
public class ShoppingCart {

    private List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        items.add(item);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public int getItemCount() {
        return items.size();
    }

    public List<Item> getAllItems() {
        return items;
    }
}