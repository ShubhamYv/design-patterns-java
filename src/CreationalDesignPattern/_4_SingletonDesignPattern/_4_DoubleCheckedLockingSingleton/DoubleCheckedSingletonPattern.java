package CreationalDesignPattern._4_SingletonDesignPattern._4_DoubleCheckedLockingSingleton;

public class DoubleCheckedSingletonPattern {

    public static volatile DoubleCheckedSingletonPattern instance;

    private DoubleCheckedSingletonPattern() {
    }

    public static DoubleCheckedSingletonPattern getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedSingletonPattern.class) {
                if (instance == null) {
                    instance = new DoubleCheckedSingletonPattern();
                }
            }
        }
        return instance;
    }
}
