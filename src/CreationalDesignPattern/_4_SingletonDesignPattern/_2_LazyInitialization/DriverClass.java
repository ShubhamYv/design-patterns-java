package CreationalDesignPattern._4_SingletonDesignPattern._2_LazyInitialization;

public class DriverClass {
    public static void main(String[] args) {
        LazySingleton object1 = LazySingleton.getLazySingletonObject();
        System.out.println(object1.hashCode());

        LazySingleton object2 = LazySingleton.getLazySingletonObject();
        System.out.println(object2.hashCode());

        LazySingleton object3 = LazySingleton.getLazySingletonObject();
        System.out.println(object3.hashCode());
    }
}
