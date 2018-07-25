package singleton.singeltonRL;

public class BillPughSingleton {
    private BillPughSingleton() {
    }

    private static class LazyHolder {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return LazyHolder.INSTANCE;
    }

    public static void main(String[] args) {

        //until we need an instance, the LazyHolder class will not be
        //initialized until required and you can still use other static members of BillPughSingleton class

        System.out.println(BillPughSingleton.getInstance());
    }
}