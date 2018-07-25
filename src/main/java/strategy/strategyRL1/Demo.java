package strategy.strategyRL1;

//This pattern defines a set of related algorithm and encapsulate them in separated classes,& allows client to choose any algorithm at run time.
//It allows to add new algorithm without modifying existing algorithms or context class, which uses algorithm or strategies
//Strategy is a behavioral pattern in Gang of Four Design pattern list.
//Strategy pattern is based upon Open Closed design principle of SOLID principals.
//Combination of Collections.sort() and Comparator interface is an solid example of Strategy pattern.


public class Demo {
    public static void main(String[] args) {

        // Creating social Media Connect Object for connecting with friend by
        // any social media strategy.
        SocialMediaContext context = new SocialMediaContext();

        // Setting Facebook strategy.
        context.setSocialmediaStrategy(new FacebookStrategy());
        context.connect("Lokesh");

        System.out.println("====================");

        // Setting Twitter strategy.
        context.setSocialmediaStrategy(new TwitterStrategy());
        context.connect("Lokesh");

        System.out.println("====================");

        // Setting GooglePlus strategy.
        context.setSocialmediaStrategy(new GooglePlusStrategy());
        context.connect("Lokesh");

        System.out.println("====================");

        // Setting Orkut strategy.
        context.setSocialmediaStrategy(new OrkutStrategy());
        context.connect("Lokesh");
    }
}