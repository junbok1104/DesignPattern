package Java.DesignPattern.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeModelFactory {

    // Flyweight Pool - TreeModel 객체들을 Map등록하여 캐싱
    private static final Map<String, TreeModel> cache = new HashMap<>();

    public static TreeModel getInstance(String key) {
        // 만약 캐시에 있다면
        if(cache.containsKey(key)) {
            return cache.get(key);
        }else {
            //캐시가 되어 있지 않으면 나무 모델 객체를 생성후 반환하고
            TreeModel model = new TreeModel(
                    key,
                    new Object(),
                    new Object()
            );

            System.out.println("나무 모델 객체 새로 생성완료");

            // 캐시에 저장
            cache.put(key, model);

            return model;
        }
    }
}
