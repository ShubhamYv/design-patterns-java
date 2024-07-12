package CreationalDesignPattern._4_SingletonDesignPattern._3_SynchronizeMethodSingleton;

public class SynchronizeMethodSingleton {

    public static SynchronizeMethodSingleton instance;

    private SynchronizeMethodSingleton() {
    }

    public static synchronized SynchronizeMethodSingleton getInstance() {

        if (instance == null) {
            instance = new SynchronizeMethodSingleton();
        }
        return instance;
    }
}
