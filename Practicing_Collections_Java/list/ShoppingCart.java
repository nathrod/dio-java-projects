package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;

    public ShoppingCart(){
        this.items = new ArrayList<>();
    }

    public void addItem(String name, double price, int quantity){
        int exist = 1;
        for(Item item : items) {
            if (item.getName().equalsIgnoreCase(name)) {
                throw new DuplicateItemException("Product already added!");
            }
        }
        Item item = new Item(name, price, quantity);
        this.items.add(item);
    }

    public void removeItem(String name){
        Iterator<Item> iterator = items.iterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            if (item.getName().equalsIgnoreCase(name)) {
                iterator.remove();
                break;
            }
        }
    }

    public void calculateTotalValue(){
        if (items == null) {
            System.out.println("Cart is empty. Total Value: $0.00");
            return;
        }

        double totalValue = 0;
        for(Item item : items){
            totalValue += item.getPrice()*item.getQuantity();
        }
        System.out.println("Total Value: $" + totalValue);
    }

    public void displayItems(){
        for(Item item : items){
            System.out.println(item.getName() + " x" + item.getQuantity() + " - $" + item.getPrice());
        }
    }
}
