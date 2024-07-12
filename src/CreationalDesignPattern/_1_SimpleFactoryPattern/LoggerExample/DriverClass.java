package CreationalDesignPattern._1_SimpleFactoryPattern.LoggerExample;

public class DriverClass {

    public static void main(String[] args) {
        ILogger infoLogger = LoggerFactory.createLogger(LogLevelEnum.INFO);
        infoLogger.log("This is info logger object");

        ILogger debugLogger = LoggerFactory.createLogger(LogLevelEnum.DEBUG);
        debugLogger.log("This is info logger object");

        ILogger errorLogger = LoggerFactory.createLogger(LogLevelEnum.ERROR);
        errorLogger.log("This is info logger object");
    }
}
