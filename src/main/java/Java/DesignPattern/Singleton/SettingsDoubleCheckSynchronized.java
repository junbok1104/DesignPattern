package Java.DesignPattern.Singleton;

public class SettingsDoubleCheckSynchronized {
    private static volatile SettingsDoubleCheckSynchronized instance;

    private SettingsDoubleCheckSynchronized() {};

    public static SettingsDoubleCheckSynchronized getInstance() {
        if(instance == null) {
            synchronized (SettingsDoubleCheckSynchronized.class) {
                if(instance == null) {
                    instance = new SettingsDoubleCheckSynchronized();
                }
            }
        }
        return instance;
    };
}
