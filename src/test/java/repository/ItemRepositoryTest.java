package repository;

import entity.Item;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemRepositoryTest {

    private ItemRepository itemRepository;

    @Before
    public void setup(){
        itemRepository = new ItemRepository();
    }

    @Test
    public void testGetAllItems() throws Exception {
        assertEquals(0, itemRepository.getAll().size());
    }

    @Test
    public void testAddItem() throws Exception {
        itemRepository.add(new Item(1, 12, "IC"));
        assertEquals(1, itemRepository.getAll().size());

    }


}