package CreationalDesignPattern._2_FactoryMethodPattern.LoggerExample;

public class WarnLoggerFactory extends ILoggerFactory {
    @Override
    public ILogger createLogger() {
        return new WarnLogger();
    }
}