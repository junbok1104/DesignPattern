package Java.DesignPattern.Composite;

import lombok.Getter;

import java.util.LinkedList;
import java.util.List;

@Getter
public class BagForComposite implements Component{

    private List<Component> components = new LinkedList<>();

    public void add(Component component) {
        components.add(component);
    }

    @Override
    public int getPrice() {
        return components.stream().mapToInt(Component::getPrice).sum();
    }
}
