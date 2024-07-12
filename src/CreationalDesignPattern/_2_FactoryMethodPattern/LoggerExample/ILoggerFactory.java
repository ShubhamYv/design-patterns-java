package CreationalDesignPattern._2_FactoryMethodPattern.LoggerExample;

public abstract class ILoggerFactory {
    public abstract ILogger createLogger();

    public void logMessage(String message) {
        ILogger logger = createLogger();
        logger.log(message);
    }
}
