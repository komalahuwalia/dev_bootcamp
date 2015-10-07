package entity;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertFalse;

/**
 * Created by komal on 07/10/15.
 */
public class ShoppingCartTest {

    @Test
    public void ableToAddItemsToShoppingCart(){
        ShoppingCart shoppingCart = new ShoppingCart();
        for(int index = 0; index < 4; index++){
            Item item = new Item(index,12d + index,"My Item "+index);
            shoppingCart.addItem(item);
        }
        assertEquals(4, shoppingCart.getAllItems().size());
    }


}
