package Java.DesignPattern.ProtoType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player{
    private String name;
    private String country;

    // 선수 정보를 DB에서 얻어온다고 가정
    public void loadPlayerDataFromDB() {
        name = "Ramos";
        country = "Spain";
    }
}
