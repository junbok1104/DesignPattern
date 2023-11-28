package Java.DesignPattern.Facade;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Row {
    // DBMS에 저장된 데이터 클래스

    private String name;
    private String age;
    private String email;
}