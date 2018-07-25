package prototype;

// By making this class cloneable you are telling Java
// that it is ok to copy instances of this class
// These instance copies have different results when
// System.identityHashCode(System.identityHashCode(bike))
// is called - this is the prototype capable interface

public interface Animal extends Cloneable {

    public Animal makeCopy();

}