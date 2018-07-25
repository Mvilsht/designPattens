package strategy.strategyRL1;

//Various implementations of ISocialMediaStrategy

public class FacebookStrategy implements ISocialMediaStrategy {

    public void connectTo(String friendName)
    {
        System.out.println("Connecting with " + friendName + " through Facebook");
    }
}