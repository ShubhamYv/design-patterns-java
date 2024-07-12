package CreationalDesignPattern._1_SimpleFactoryPattern.LoggerExample;

public class LoggerFactory {

    public static ILogger createLogger(LogLevelEnum level) {
        if (level == LogLevelEnum.INFO) {
            return new InfoLogger();
        } else if (level == LogLevelEnum.ERROR) {
            return new ErrorLogger();
        } else if (level == LogLevelEnum.DEBUG) {
            return new DebugLogger();
        } else {
            return null;
        }
    }
}

/*
* In future if we want to add any new type of logger, we need to change LoggerFactory Class.
* So here SOLID principle's 'O' which is open-closed principle violates.
* Because we need to change the code and everytime we have to add if/ else-if condition.
* */