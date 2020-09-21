package Lesson5.Task1;

public class Calculator {
    public LoggerFactory loggerFactory = new FileLoggerFactory();
    public Logger logger = loggerFactory.createLogger();

    public void sum(int a, int b) {
        String message = "Сумма чисел " + a + " и " + b + " равна " + (a + b) + ".";
        System.out.println(message);
        logger.log(message);
    }

    public void diff(int a, int b) {
        String message = "Разность чисел " + a + " и " + b + " равна " + (a - b) + ".";
        System.out.println(message);
        logger.log(message);
    }

    public void mult(int a, int b) {
        String message = "Произведение чисел " + a + " и " + b + " равно " + (a * b) + ".";
        System.out.println(message);
        logger.log(message);
    }

    public void div(int a, int b) {
        String message = "Частное чисел " + a + " и " + b + " равно " + ((float)a / b) + ".";
        System.out.println(message);
        logger.log(message);
    }
}