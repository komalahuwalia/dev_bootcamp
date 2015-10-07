package repository;

import entity.Item;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by komal on 06/10/15.
 */
@Component
public class ItemRepository {

    List<Item> items = new ArrayList<>();

    public void add(Item item){
        items.add(item);
    }

    public List<Item> getAll(){
        return items;
    }

}
