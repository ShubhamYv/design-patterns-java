package CreationalDesignPattern._4_SingletonDesignPattern._5_EnumTypeSingleton;

public class DriverClass {
    public static void main(String[] args) {
        SingletonEnum.INSTANCE.getMessage();

        int hashCode1 = SingletonEnum.INSTANCE.hashCode();
        System.out.println("Hashcode 1:::" + hashCode1);

        int hashCode2 = SingletonEnum.INSTANCE.hashCode();
        System.out.println("Hashcode 2:::" + hashCode2);

        int hashCode3 = SingletonEnum.INSTANCE.hashCode();
        System.out.println("Hashcode 3:::" + hashCode3);
    }
}
