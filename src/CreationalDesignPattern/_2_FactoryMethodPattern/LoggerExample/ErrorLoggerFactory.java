package CreationalDesignPattern._2_FactoryMethodPattern.LoggerExample;

public class ErrorLoggerFactory extends ILoggerFactory {
    @Override
    public ILogger createLogger() {
        return new ErrorLogger();
    }
}
