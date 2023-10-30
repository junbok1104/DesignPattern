package Java.DesignPattern.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FontFactory {
    private Map<String, Font> cache = new HashMap<>();

    public Font getFont(String font) {
        if(cache.containsKey(font)) {
            return cache.get(font);
        }else {
            String[] split = font.split(",");

            //폰트이름, 폰트사이즈 분리
            Font newFont = new Font(split[0], Integer.parseInt(split[1]));
            cache.put(font, newFont);
            return newFont;
        }
    }
}
