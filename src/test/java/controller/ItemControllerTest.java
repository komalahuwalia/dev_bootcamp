package controller;

import entity.Item;
import org.junit.Test;
import org.springframework.ui.Model;
import repository.ItemRepository;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.junit.Assert.assertEquals;

/**
 * Created by komal on 07/10/15.
 */
public class ItemControllerTest {

    @Test
    public void testGetItem(){
        ItemRepository mockRepository = mock(ItemRepository.class);
        Model mockModel = mock(Model.class);

        List<Item> listOfItems = new ArrayList<Item>();
        listOfItems.add(new Item(1, 12d, "IC12"));
        listOfItems.add(new Item(2, 13d, "IC13"));
        listOfItems.add(new Item(3, 14d, "IC14"));
        listOfItems.add(new Item(4,15d,"IC15"));
        listOfItems.add(new Item(5, 16d, "IC16"));

        when(mockRepository.getAll()).thenReturn(listOfItems);

        ItemController itemController = new ItemController(mockRepository);
        String viewName = itemController.getItem(mockModel);
        verify(mockModel).addAttribute("items", listOfItems);
        assertEquals("items",viewName);

    }
}