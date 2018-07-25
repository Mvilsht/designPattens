package singleton.singeltonRL;

import java.io.Serializable;

public class DemoSingleton implements Serializable {
    //When an application wants to have one and only one instance of any class per JVM,
    // in all possible scenarios without any exceptional condition.


    private static final long serialVersionUID = 1L;

    private DemoSingleton() {
        // private constructor
    }

    private static class DemoSingletonHolder {
        public static final DemoSingleton INSTANCE = new DemoSingleton();
    }

    public static DemoSingleton getInstance() {
        return DemoSingletonHolder.INSTANCE;
    }

    protected Object readResolve() {
        return getInstance();
    }


    public static void main(String[] args) {
        System.out.println(DemoSingleton.getInstance());
    }
}
