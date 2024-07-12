package CreationalDesignPattern._4_SingletonDesignPattern._1_EagerInitialization;

public class EagerSingleton {

    public static final EagerSingleton EAGER_OBJECT = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getEagerObject() {
        return EAGER_OBJECT;
    }
}
