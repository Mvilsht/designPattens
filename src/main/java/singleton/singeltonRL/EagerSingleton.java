package singleton.singeltonRL;

public class EagerSingleton {
    private static volatile EagerSingleton instance = new EagerSingleton();

    // private constructor
    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(EagerSingleton.getInstance());
    }
}
