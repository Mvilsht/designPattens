package prototype;

//The Prototype design pattern is used for creating new objects (instances) by cloning (copying) other objects.
//It allows for the adding of any subclass instance of a known super class at run time.
// It is used when there are numerous potential classes that you want to only use if needed at runtime.
// The major benefit of using the Prototype pattern is that it reduces the need for creating potentially unneeded subclasses.


public class TestCloning {

    public static void main(String[] args){

        // Handles routing makeCopy method calls to the
        // right subclasses of Animal

        CloneFactory animalMaker = new CloneFactory();

        // Creates a new Sheep instance

        Sheep sally = new Sheep();

        // Creates a clone of Sally and stores it in its own
        // memory location

        Sheep clonedSheep = (Sheep) animalMaker.getClone(sally);

        // These are exact copies of each other

        System.out.println(sally);

        System.out.println(clonedSheep);

        System.out.println("Sally HashCode: " + System.identityHashCode(System.identityHashCode(sally)));

        System.out.println("Clone HashCode: " + System.identityHashCode(System.identityHashCode(clonedSheep)));
    }

}
