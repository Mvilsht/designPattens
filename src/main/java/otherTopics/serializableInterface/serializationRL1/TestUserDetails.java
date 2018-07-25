package otherTopics.serializableInterface.serializationRL1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.Date;
public class TestUserDetails {

    //Default Serialization with Added Validation !!!

    public static void main(String[] args) {
        // Create new UserDetails object
        UserDetails myDetails = new UserDetails("Lokesh", "Gupta", 102825,
                new Date(Calendar.getInstance().getTimeInMillis()));

        // Serialization code
        try (FileOutputStream fileOut = new FileOutputStream(""+"src/main/resources/userDetails.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

            out.writeObject(myDetails);
        }catch (IOException i) {
            i.printStackTrace();
        }


        // De-serialization code
        try (FileInputStream fileIn = new FileInputStream(""+"src/main/resources/userDetails.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)){

            UserDetails deserializedUserDetails = (UserDetails) in.readObject();

            // verify the object state
            System.out.println(deserializedUserDetails.getFirstName());
            System.out.println(deserializedUserDetails.getLastName());
            System.out.println(deserializedUserDetails.getAccountNumber());
            System.out.println(deserializedUserDetails.getDateOpened());

        }catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (ClassNotFoundException cnfe) {
            cnfe.printStackTrace();
        }
    }
}
