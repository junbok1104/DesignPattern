package Java.DesignPattern.Singleton;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@SpringBootTest
public class SingletonPatternTest {

//    @Test
//    void SettingsPrivateStatic() {
//        SettingsPrivateStatic settings = SettingsPrivateStatic.getInstance();
//        SettingsPrivateStatic settings2 =  SettingsPrivateStatic.getInstance();
//
//        assertThat(settings).isEqualTo(settings2);
//    }
//
//    @Test
//    void SettingsStaticInnerTest() {
//        SettingsStaticInner settings = SettingsStaticInner.getInstance();
//        SettingsStaticInner settings2 = SettingsStaticInner.getInstance();
//
//        assertThat(settings).isEqualTo(settings2);



    @Test
    @DisplayName("싱글톤 깨트리는 방법1 - 리플레션")
    void Reflection() throws Exception {
        SettingsStaticInner setting = SettingsStaticInner.getInstance();

        Constructor<SettingsStaticInner> newSetting = SettingsStaticInner.class.getDeclaredConstructor();
        newSetting.setAccessible(true);

        SettingsStaticInner setting2 = newSetting.newInstance();

        assertThat(setting).isEqualTo(setting2);
    }

    @Test
    @DisplayName("싱글톤 깨트리는 방법2 - 직렬화 & 역직렬화 이용")
    void SerializeAndRevers() throws Exception{
        SettingsStaticInner setting = SettingsStaticInner.getInstance();
        SettingsStaticInner setting2 = null;

        try(ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(setting);
        }

        try(ObjectInput input = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            setting2 = (SettingsStaticInner) input.readObject();
        }

        assertThat(setting).isEqualTo(setting2);
    }

    @Test
    @DisplayName("싱글톤을 깨트리는 방법3 - Enum을 이용한 Singleton")
    void EnumSingleton() throws Exception {
        EnumSingleton setting = EnumSingleton.INSTANCE;
        EnumSingleton setting2 = null;

        Constructor<?>[] newSettings = EnumSingleton.class.getDeclaredConstructors();
        for(Constructor<?> newSetting : newSettings) {
            newSetting.setAccessible(true);
            setting2 = (EnumSingleton) newSetting.newInstance("INSTANCE");
        }

        assertThat(setting).isEqualTo(setting2);
    }
}
