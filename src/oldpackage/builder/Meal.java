package oldpackage.builder;

import java.util.ArrayList;
import java.util.List;

class Meal {

    private List<Item> items = new ArrayList<>();

    void addItem(Item item) {
        items.add(item);
    }

     float getCost() {
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

     void showItems() {
        for (Item item : items) {
            System.out.println("Item name:" + item.name());
            System.out.println("Item packing:" + item.packing().pack());
            System.out.println("Item price:" + item.price());
        }
    }


}
