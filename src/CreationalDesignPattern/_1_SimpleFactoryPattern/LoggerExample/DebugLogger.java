package CreationalDesignPattern._1_SimpleFactoryPattern.LoggerExample;

public class DebugLogger implements ILogger {
    @Override
    public void log(String message) {
        System.out.println("DEBUG: " + message);
    }
}
