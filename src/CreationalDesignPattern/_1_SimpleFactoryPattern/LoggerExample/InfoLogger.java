package CreationalDesignPattern._1_SimpleFactoryPattern.LoggerExample;

public class InfoLogger implements ILogger {

    @Override
    public void log(String message) {
        System.out.println("INFO: " + message);
    }
}
