package chain_of_responsibility;

public class ChainPatternDemo {
    public static AbstractLogger getChainOfLoggers() {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new ErrorLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ErrorLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {

        AbstractLogger loggerChain = ChainPatternDemo.getChainOfLoggers();

        loggerChain.LogMessage(AbstractLogger.INFO, "This is an info information");
        loggerChain.LogMessage(AbstractLogger.DEBUG, "This is an debug information");
        loggerChain.LogMessage(AbstractLogger.ERROR, "This is an error information");

    }
}
