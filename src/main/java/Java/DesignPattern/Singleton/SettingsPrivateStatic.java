package Java.DesignPattern.Singleton;

public class SettingsPrivateStatic {
    private static SettingsPrivateStatic instance;

    SettingsPrivateStatic() {

    }

    public static SettingsPrivateStatic getInstance() {
        if(instance == null){
            instance = new SettingsPrivateStatic();
        }
        return instance;
    }
}
