package Lesson5.Task1;

public class DbLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        return new DbLogger();
    }
}
