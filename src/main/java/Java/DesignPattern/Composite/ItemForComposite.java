package Java.DesignPattern.Composite;

public class ItemForComposite implements Component{
    private String name;
    private int price;

    public ItemForComposite (String name, int price) {
        this.name = name;
        this.price = price;
    }
    @Override
    public int getPrice() {
        return this.price;
    }
}
