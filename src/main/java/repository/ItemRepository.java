package repository;

import entity.Item;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by komal on 06/10/15.
 */
@Component
public class ItemRepository {

    Map<Integer,Item> items = new HashMap<>();

    public void add(Item item){
        items.put(item.getId(), item);
    }

    public List<Item> getAll(){
        return new ArrayList(items.values());
    }

    public Item getItem(int itemId) {
        return items.get(itemId);
    }

    }