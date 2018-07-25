package otherTopics.serializableInterface.externalizableRL2;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyExternalizable implements Externalizable
{

    private String userName;
    private String passWord;
    private Integer roll;

    public MyExternalizable()
    {

    }

    public MyExternalizable(String userName, String passWord, Integer roll)
    {
        this.userName = userName;
        this.passWord = passWord;
        this.roll = roll;
    }

    @Override
    public void writeExternal(ObjectOutput oo) throws IOException
    {
        oo.writeObject(userName);
        oo.writeObject(roll);
    }

    @Override
    public void readExternal(ObjectInput oi) throws IOException, ClassNotFoundException
    {
        userName = (String)oi.readObject();
        roll = (Integer)oi.readObject();
    }

    public String toString()
    {
        StringBuilder b = new StringBuilder();
        b.append("userName: ");
        b.append(userName);
        b.append("  passWord: ");
        b.append(passWord);
        b.append("  roll: ");
        b.append(roll);

        return b.toString();
    }
    public static void main(String[] args)
    {
        MyExternalizable m  = new MyExternalizable("nikki", "student001", 20);
        System.out.println(m.toString());

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("" + "src/main/resources/MyExternalizable.ser"))) {

            oos.writeObject(m);

        }catch(IOException ex) {
            Logger.getLogger(MyExternalizable.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("***********************************************************************");

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("" + "src/main/resources/MyExternalizable.ser"))) {

            MyExternalizable mm = (MyExternalizable) ois.readObject();
            System.out.println(mm.toString());

        }catch (ClassNotFoundException ex) {
            Logger.getLogger(MyExternalizable.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(IOException ex)
        {
            Logger.getLogger(MyExternalizable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

