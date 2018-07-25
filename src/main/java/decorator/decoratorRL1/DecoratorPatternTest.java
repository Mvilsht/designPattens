package decorator.decoratorRL1;

//In software engineering, decorator design pattern is used to add additional features or behaviors to a particular instance of a class,
// while not modifying the other instances of same class. Decorators provide a flexible alternative to sub-classing for extending functionality.
// Please note that the description above implies that decorating an object changes its behavior but not its interface.

public class DecoratorPatternTest {
    public static void main(String[] args) {

        //ClientPopupDecorator popupDecoratored = new ClientPopupDecorator(new ClientLinkDecorator(new ClientReport()));
        //System.out.println(popupDecoratored.getFirstColumnData());

        SupportPopupDecorator supportPopupDecoratored = new SupportPopupDecorator(new SupportLinkDecorator(new SupportReport()));
        System.out.println(supportPopupDecoratored.getFirstColumnData());
    }
}
