package composite.compositeRL1;

import java.util.ArrayList;
import java.util.List;

//Component
//declares the interface for objects in the composition.
//implements default behavior for the interface common to all classes, as appropriate.
//declares an interface for accessing and managing its child components.


public abstract class Component
{
    AccountStatement accStatement;

    protected List<Component> list = new ArrayList<>();

    public abstract float getBalance();

    public abstract AccountStatement getStatement();

    public void add(Component g) {
        list.add(g);
    }

    public void remove(Component g) {
        list.remove(g);
    }

    public Component getChild(int i) {
        return (Component) list.get(i);
    }
}