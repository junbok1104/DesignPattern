package Java.DesignPattern.Facade;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Message {
    // Row클래스를 출력하는 클래스
    private Row row;

    public String nmakeName() {
        return "Name : \"" + row.getName() + "\"";
    }

    public String makeAge() {
        return "Age : \"" + row.getAge() + "\"";
    }

    public String makeEmail() {
        return "Email : \"" + row.getEmail() + "\"";
    }
}
