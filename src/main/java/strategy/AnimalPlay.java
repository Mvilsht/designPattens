package strategy;
//You use this pattern if you need to dynamically change an algorithm used by an object at run time. Don’t worry, just watch the video and you’ll get it.
//The pattern also allows you to eliminate code duplication. It separates behavior from super and subclasses.
// It is a super design pattern and is often the first one taught.

public class AnimalPlay{

    public static void main(String[] args){

        Animal sparky = new Dog();
        Animal tweety = new Bird();

        System.out.println("Dog: " + sparky.tryToFly());

        System.out.println("Bird: " + tweety.tryToFly());

        // This allows dynamic changes for flyingType

        sparky.setFlyingAbility(new ItFlys());

        System.out.println("Dog: " + sparky.tryToFly());

    }

}