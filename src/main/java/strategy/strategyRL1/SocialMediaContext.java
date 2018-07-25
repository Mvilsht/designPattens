package strategy.strategyRL1;

//The context which determines the implementation.

public class SocialMediaContext
{
    ISocialMediaStrategy smStrategy;

    public void setSocialmediaStrategy(ISocialMediaStrategy smStrategy)
    {
        this.smStrategy = smStrategy;
    }

    public void connect(String name)
    {
        smStrategy.connectTo(name);
    }
}