package Java.DesignPattern.AbstractMethod;

import java.util.Objects;

public interface ShipFactory {
    default Ship orderShip(String name, String email) {
        validate(name, email);
        return createShip(name, email);
    }
    Ship createShip(String name, String email);
    private void validate(String name, String email) {
        if(Objects.isNull(name) || name.isBlank()) {
            throw new IllegalArgumentException("배 이름을 지어주세요");
        }        if(Objects.isNull(email) || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요");
        }
    }
}
