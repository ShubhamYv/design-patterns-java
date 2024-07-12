package CreationalDesignPattern._4_SingletonDesignPattern._2_LazyInitialization;

public class LazySingleton {

    public static LazySingleton lazySingletonObject;

    private LazySingleton() {
    }

    public static LazySingleton getLazySingletonObject() {
        if (lazySingletonObject == null) {
            lazySingletonObject = new LazySingleton();
        }
        return lazySingletonObject;
    }
}
