package Java.DesignPattern.Composite;

import org.junit.jupiter.api.Test;

public class CompositeTest {

    @Test
    void test1() {
        Item A = new Item("A", 550);
        Item B = new Item("B", 300);

        Bag bag = new Bag();
        bag.add(A);
        bag.add(B);

        // 클라이언트 입장에서 모든 정보를 가져가기 때문에 객체지향적으로 봐도 옳지 않다.
        // 가방안에 가방이 들어있거나 가방이 2개가 있다면 또 다른 메서드를 클라이언트에 구현을 해야합니다.
        // 결국 나중에는 코드 변경도 클라이언트 부분에서 할 필요가 생긴다는 겁니다.
        System.out.println(bag.getItems().stream().mapToInt(Item::getPrice).sum());
    }

    @Test
    void test2() {
        ItemForComposite A = new ItemForComposite("A", 550);
//        ItemForComposite B = new ItemForComposite("B", 300);

        BagForComposite bag = new BagForComposite();
        bag.add(A);
//        bag.add(B);

        // 클라이언트는 가장 상위를 바라본다. 즉, 구체적인 방법을 알필요가 없다.
        System.out.println(bag.getPrice());
        System.out.println(A.getPrice());
    }
}
