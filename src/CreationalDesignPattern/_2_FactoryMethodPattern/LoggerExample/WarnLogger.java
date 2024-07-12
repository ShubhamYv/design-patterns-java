package CreationalDesignPattern._2_FactoryMethodPattern.LoggerExample;

public class WarnLogger implements ILogger {
    @Override
    public void log(String message) {
        System.out.println("WARN::" + message);
    }
}
