package Java.DesignPattern.Strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    // 전략을 매개변수로 받는다
    public void pay(PaymentStrategy paymentStrategy) {
        int amount = 0;
        for(Item item : items) {
            amount += item.price;
        }
        paymentStrategy.pay(amount);
    }
}