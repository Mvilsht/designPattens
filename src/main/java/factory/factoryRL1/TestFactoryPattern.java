package factory.factoryRL1;

public class TestFactoryPattern {
    //	This is most suitable where there is some complex object creation steps are involved.
    // To ensure that these steps are centralized and not exposed to composing classes, factory pattern should be used.




    public static void main(String[] args) {
        System.out.println(CarFactory.buildCar(CarType.SMALL));
        System.out.println(CarFactory.buildCar(CarType.SEDAN));
        System.out.println(CarFactory.buildCar(CarType.LUXURY));
    }
}
