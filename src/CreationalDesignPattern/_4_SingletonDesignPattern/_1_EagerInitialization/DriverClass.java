package CreationalDesignPattern._4_SingletonDesignPattern._1_EagerInitialization;

public class DriverClass {
    public static void main(String[] args) {
        EagerSingleton object1 = EagerSingleton.getEagerObject();
        System.out.println(object1.hashCode());

        EagerSingleton object2 = EagerSingleton.getEagerObject();
        System.out.println(object2.hashCode());
    }
}
