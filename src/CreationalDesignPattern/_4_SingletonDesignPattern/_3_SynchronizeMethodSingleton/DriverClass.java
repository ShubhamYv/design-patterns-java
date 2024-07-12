package CreationalDesignPattern._4_SingletonDesignPattern._3_SynchronizeMethodSingleton;

public class DriverClass {
    public static void main(String[] args) {
        SynchronizeMethodSingleton object1 = SynchronizeMethodSingleton.getInstance();
        System.out.println(object1.hashCode());

        SynchronizeMethodSingleton object2 = SynchronizeMethodSingleton.getInstance();
        System.out.println(object2.hashCode());

        SynchronizeMethodSingleton object3 = SynchronizeMethodSingleton.getInstance();
        System.out.println(object3.hashCode());
    }
}
