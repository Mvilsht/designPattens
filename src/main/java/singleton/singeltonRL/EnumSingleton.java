package singleton.singeltonRL;

public enum EnumSingleton {
    INSTANCE;

    public void someMethod(String param) {
        // some class member
        System.out.println("WWW " + param);
    }

    public static void main(String[] args) {
        EnumSingleton.INSTANCE.someMethod("NBA");
    }
}


