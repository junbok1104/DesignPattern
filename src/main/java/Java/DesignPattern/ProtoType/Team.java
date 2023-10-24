package Java.DesignPattern.ProtoType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode // 값 비교를 위해 사용
public class Team implements Cloneable {
    private String name;
    private Player player;

    @Override
    public Object clone() throws CloneNotSupportedException {


//        Player copyPlayer = new Player();
//        player.loadPlayerDataFromDB();
//
//        Team copyTeam = new Team();
//        copyTeam.setName([this.name](http://this.name/));
//        copyTeam.setPlayer(copyPlayer);

//        return copyTeam;
        return super.clone();
    }
}
