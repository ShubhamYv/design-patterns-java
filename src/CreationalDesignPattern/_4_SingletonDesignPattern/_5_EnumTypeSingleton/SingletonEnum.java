package CreationalDesignPattern._4_SingletonDesignPattern._5_EnumTypeSingleton;

public enum SingletonEnum {
    INSTANCE;

    void getMessage() {
        System.out.println("Hello");
    }
}
