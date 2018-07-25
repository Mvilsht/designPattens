package abstractFactory.abstractFactoryRL1;

public class TestFactoryPattern
{

    //Whenever you need another level of abstraction over a group of factories, you should consider using abstract factory pattern.

    public static void main(String[] args)
    {
        System.out.println(CarFactory.buildCar(CarType.SMALL));
        System.out.println(CarFactory.buildCar(CarType.SEDAN));
        System.out.println(CarFactory.buildCar(CarType.LUXURY));
    }
}
