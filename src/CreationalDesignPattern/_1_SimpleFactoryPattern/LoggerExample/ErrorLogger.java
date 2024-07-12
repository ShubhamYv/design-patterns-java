package CreationalDesignPattern._1_SimpleFactoryPattern.LoggerExample;

public class ErrorLogger implements ILogger {

    @Override
    public void log(String message) {
        System.out.println("ERROR: " + message);
    }
}
