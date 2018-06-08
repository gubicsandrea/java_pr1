package shopping;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<Item> items;

    public Basket(List<Item> items) {
        this.items = items;
    }

    public Basket() {
        items = new ArrayList<>();
    }

    public List<Item> getItems() {
        return new ArrayList<>(items);
    }

    public void addItem(Item item){
        items.add(item);
    }

    public void removeItem(String barcode){
        Item item = new Item(barcode, 0, 0);
        items.remove(item);
    }

    public void clearBasket(){
        items.clear();
    }

    public Item mostExpensiveItem(){
        if(items.isEmpty()){
            throw new EmptyBasketException("The basket is empty");
        }
        Item maxPriceItem =items.get(0);
        for (Item item: items) {
            if(item.getNettoPrice() > maxPriceItem.getNettoPrice()){
                maxPriceItem = item;
            }
        }
        return maxPriceItem;
    }
}
