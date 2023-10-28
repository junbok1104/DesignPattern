package Java.DesignPattern.Composite;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bag {
    private List<Item> items = new LinkedList<>();

    public void add(Item item) {
        items.add(item);
    }


}
