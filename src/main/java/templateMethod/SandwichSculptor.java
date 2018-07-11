package templateMethod;
//With this pattern, you define a method (algorithm) in an abstract class. It contains both abstract methods and non-abstract methods.
// The subclasses that extend this abstract class then override those methods that don’t make sense for them to use in the default way.

public class SandwichSculptor {

    public static void main(String[] args){

        ItalianHoagie cust12Hoagie = new ItalianHoagie();

        cust12Hoagie.makeSandwich();

        System.out.println();

        VeggieHoagie cust13Hoagie = new VeggieHoagie();

        cust13Hoagie.makeSandwich();

    }

}
