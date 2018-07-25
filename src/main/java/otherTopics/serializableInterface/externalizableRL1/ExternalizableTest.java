package otherTopics.serializableInterface.externalizableRL1;

import java.io.*;

public class ExternalizableTest {

    public static void main (String[]args) {
        UserSettings settings = new UserSettings();
        settings.setDoNotStoreMe("Sensitive info");
        settings.setFieldOne(10000);
        settings.setFieldTwo("HowToDoInJava.com");
        settings.setFieldThree(false);

        //Before
        System.out.println(settings);
        storeUserSettings(settings);
        UserSettings loadedSettings = loadSettings();
        System.out.println(loadedSettings);
    }

    private static UserSettings loadSettings () {
            try (FileInputStream fis = new FileInputStream(""+"src/main/resources/ExternalizableTest.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            return (UserSettings) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }


    private static void storeUserSettings (UserSettings settings)    {
        try (FileOutputStream fos = new FileOutputStream(""+"src/main/resources/ExternalizableTest.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(settings);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
