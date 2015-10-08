package controller;

import entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import repository.ItemRepository;

import java.util.List;

@Controller
public class ItemController {

    ItemRepository itemRepository ;

    @Autowired
    public ItemController(ItemRepository itemRepository){
        this.itemRepository = itemRepository;
    }

    @RequestMapping("/item")
    public String getItem(Model model) {
        addDummyItems();
        List<Item> items = itemRepository.getAll();
        model.addAttribute("items", items);
        return "items";
    }

    @RequestMapping("/addItem")
    public String addItem(@RequestParam(value="itemList") String[] itemList, Model model){
        for(String value : itemList) {
            System.out.println(value);
        }
        return "showCart";
    }

    private void addDummyItems(){
        itemRepository.add(new Item(1, 12d, "IC12"));
        itemRepository.add(new Item(2, 13d, "IC13"));
        itemRepository.add(new Item(3, 14d, "IC14"));
        itemRepository.add(new Item(4,15d,"IC15"));
        itemRepository.add(new Item(5, 16d, "IC16"));
    }

}

