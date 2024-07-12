package CreationalDesignPattern._4_SingletonDesignPattern._4_DoubleCheckedLockingSingleton;

public class DriverClass {
    public static void main(String[] args) {
        DoubleCheckedSingletonPattern object1 = DoubleCheckedSingletonPattern.getInstance();
        System.out.println(object1.hashCode());

        DoubleCheckedSingletonPattern object2 = DoubleCheckedSingletonPattern.getInstance();
        System.out.println(object2.hashCode());

        DoubleCheckedSingletonPattern object3 = DoubleCheckedSingletonPattern.getInstance();
        System.out.println(object3.hashCode());
    }
}
