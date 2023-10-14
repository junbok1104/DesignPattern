package Java.DesignPattern.Singleton;

public class SettingsSynchronized {
    private static SettingsSynchronized instance;

    public static synchronized SettingsSynchronized getInstance() {
        if(instance == null) {
            instance = new SettingsSynchronized();
        }
        return instance;
    }
}
