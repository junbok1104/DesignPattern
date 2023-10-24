package Java.DesignPattern.ProtoTypeTest;

import Java.DesignPattern.ProtoType.Person;
import org.junit.jupiter.api.Test;
import org.springframework.test.util.ReflectionTestUtils;

import static org.assertj.core.api.Assertions.assertThat;

public class CopyTest {

    @Test
    void copyTest1() {
        Person person = new Person("Ramos", 33);
        Person copyPerson = person;

        copyPerson.setName("Messi");

        System.out.println(person.getName());
        System.out.println(copyPerson.getName());
        System.out.println(System.identityHashCode(person));
        System.out.println(System.identityHashCode(copyPerson));
        assertThat(person).isEqualTo(copyPerson);
    }

    @Test
    void copyTest2() {
        Person person = new Person("Ramos", 33);
        Person copyPerson = ReflectionTestUtils.invokeMethod(person,"clone");

        copyPerson.setName("Messi");

        System.out.println(person.getName());
        System.out.println(copyPerson.getName());
        System.out.println(System.identityHashCode(person));
        System.out.println(System.identityHashCode(copyPerson));
        assertThat(person).isSameAs(copyPerson);
    }

    @Test
    void copyTest3() {
        Person person = new Person("Ramos", 33);
        Person copyPersonConstructor = new Person(person);
        Person copyPersonFactory = ReflectionTestUtils.invokeMethod(person,"copy",person);

        copyPersonConstructor.setName("Messi");
        copyPersonFactory.setName("Messi");

        System.out.println(person.getName());
        System.out.println(copyPersonConstructor.getName());
        System.out.println(copyPersonFactory.getName());
        System.out.println(System.identityHashCode(person));
        System.out.println(System.identityHashCode(copyPersonConstructor));
        System.out.println(System.identityHashCode(copyPersonFactory));
    }


}
