package Java.DesignPattern.Singleton;

public class SettingsEagerInitialization {
    
    // 예외를 던지지 않는 경우
//    private static final SettingsEagerInitialization instance = new SettingsEagerInitialization();
//
//    private SettingsEagerInitialization() {};
//
//    public static SettingsEagerInitialization getInstance() {
//        return instance;
//    };

    // 예외를 던지는 경우
    private static SettingsEagerInitialization instance = new SettingsEagerInitialization();

    static {
        try {
            instance = new SettingsEagerInitialization();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private SettingsEagerInitialization() {};

    public static SettingsEagerInitialization getInstance() {
        return instance;
    };
}
