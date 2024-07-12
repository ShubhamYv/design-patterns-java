package CreationalDesignPattern._2_FactoryMethodPattern.LoggerExample;

public class InfoLoggerFactory extends ILoggerFactory {
    @Override
    public ILogger createLogger() {
        return new InfoLogger();
    }
}