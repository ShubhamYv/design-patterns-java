package CreationalDesignPattern._2_FactoryMethodPattern.LoggerExample;

public class DriverClass {

    public static void main(String[] args) {
        ILoggerFactory errorLoggerFactory = new ErrorLoggerFactory();
        errorLoggerFactory.logMessage("This is an error message.");

        ILoggerFactory warnLoggerFactory = new WarnLoggerFactory();
        warnLoggerFactory.logMessage("This is a warning message.");

        ILoggerFactory infoLoggerFactory = new InfoLoggerFactory();
        infoLoggerFactory.logMessage("This is an informational message.");
    }
}
