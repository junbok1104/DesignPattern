package Java.DesignPattern.Singleton;

import java.io.Serializable;

public class SettingsStaticInner implements Serializable {
    SettingsStaticInner() {};

    private static class SettingHolder {
        private static final SettingsStaticInner INSTANCE = new SettingsStaticInner();
    };

    public static SettingsStaticInner getInstance() {
        return SettingHolder.INSTANCE;
    };

    //직렬화 및 역질렬화시, 새로운 인스턴스를 만드는 것에 대한 방지
    private Object readResolve() {
        return SettingHolder.INSTANCE;
    }
}
