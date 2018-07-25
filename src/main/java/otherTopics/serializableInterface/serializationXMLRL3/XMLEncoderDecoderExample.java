package otherTopics.serializableInterface.serializationXMLRL3;

import java.beans.ExceptionListener;
import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class XMLEncoderDecoderExample
{
    public static void main(String[] args) throws IOException
    {
        UserSettings settings = new UserSettings();
        settings.setFieldOne(10000);
        settings.setFieldTwo("HowToDoInJava.com");
        settings.setFieldThree(false);

        //Before
        System.out.println(settings);
        serializeToXML ( settings );
        UserSettings loadedSettings = deserializeFromXML();
        //After
        System.out.println(loadedSettings);
    }

    private static void serializeToXML (UserSettings settings) throws IOException {
        try (FileOutputStream fos = new FileOutputStream(""+"src/main/resources/XMLEncoderDecoderExampleSettings.xml");
             XMLEncoder encoder = new XMLEncoder(fos)) {

            encoder.setExceptionListener(e -> System.out.println("Exception! :" + e.toString()));
            encoder.writeObject(settings);
        }
    }

    private static UserSettings deserializeFromXML() throws IOException {

        try (FileInputStream fis = new FileInputStream(""+"src/main/resources/XMLEncoderDecoderExampleSettings.xml");
             XMLDecoder decoder = new XMLDecoder(fis)) {
            return (UserSettings) decoder.readObject();
        }

    }
}
