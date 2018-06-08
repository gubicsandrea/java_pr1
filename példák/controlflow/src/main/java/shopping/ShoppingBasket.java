package shopping;

import java.util.Iterator;

public class ShoppingBasket {

    private Basket basket;

    public ShoppingBasket(Basket basket) {
        this.basket = basket;
    }

    public void addItem(Item item){
        basket.addItem(item);
    }

    public void removeItem(String barcode){
        basket.removeItem(barcode);
    }

    public double sumNettoPrice(){
        double sum = 0;
        Iterator<Item> itemIterator = basket.getItems().iterator();
        while(itemIterator.hasNext()){
            Item item = itemIterator.next();
            sum += item.getNettoPrice();
        }
        return sum;
    }

    public Item mostExpensiveItem(){
        return basket.mostExpensiveItem();
    }
}
