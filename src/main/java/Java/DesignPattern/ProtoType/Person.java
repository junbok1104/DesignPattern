package Java.DesignPattern.ProtoType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person implements Cloneable{
    private String name;
    private int age;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    // 복사 생성자
    public Person(Person original) {
        this.name = original.name;
        this.age = original.age;
    }

    // 복사 팩토리
    public static Person copy(Person original) {
        Person copyPerson = new Person();
        copyPerson.name = original.name;
        copyPerson.age = original.age;
        return copyPerson;
    }
}
