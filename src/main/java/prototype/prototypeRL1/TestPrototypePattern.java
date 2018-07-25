package prototype.prototypeRL1;

public class TestPrototypePattern
{
    //	This is used in scenarios where application needs to create a number of instances of a class,
    //   which has almost same state or differs very little.

    public static void main(String[] args)
    {
        try
        {
            String moviePrototype  = PrototypeFactory.getInstance(PrototypeFactory.ModelType.MOVIE).toString();
            System.out.println(moviePrototype);

            String albumPrototype  = PrototypeFactory.getInstance(PrototypeFactory.ModelType.ALBUM).toString();
            System.out.println(albumPrototype);

            String showPrototype  = PrototypeFactory.getInstance(PrototypeFactory.ModelType.SHOW).toString();
            System.out.println(showPrototype);

        }
        catch (CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
    }
}