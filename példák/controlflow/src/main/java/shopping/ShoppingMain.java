package shopping;

import com.sun.istack.internal.logging.Logger;

import java.util.Collections;
import java.util.logging.Level;

public class ShoppingMain {

    public static void main(String[] args) {
        Basket basket = new Basket(Collections.EMPTY_LIST);
        ShoppingBasket shoppingBasket = new ShoppingBasket(basket);
        try {
            Item item = shoppingBasket.mostExpensiveItem();
        } catch (EmptyBasketException ex){
            Logger.getLogger(ShoppingMain.class).log(Level.WARNING, "Üres a kosár");
        }
    }
}
