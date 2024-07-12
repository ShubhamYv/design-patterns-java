package CreationalDesignPattern._2_FactoryMethodPattern.LoggerExample;

public class ErrorLogger implements ILogger{
    @Override
    public void log(String message) {
        System.out.println("ERROR::" + message);
    }
}
