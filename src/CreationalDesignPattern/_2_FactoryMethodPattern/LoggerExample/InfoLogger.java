package CreationalDesignPattern._2_FactoryMethodPattern.LoggerExample;

public class InfoLogger implements ILogger {
    @Override
    public void log(String message) {
        System.out.println("INFO::" + message);
    }
}
