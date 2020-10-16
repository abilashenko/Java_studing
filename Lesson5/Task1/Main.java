package Lesson5.Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String logType;
        Logger logger;
        LoggerFactory logFactory = null;
        int a = 9;
        int b = 7;

        System.out.println("Введите тип логирования: F(File), D(DataBase), C(Console)");
        Scanner scanner = new Scanner(System.in);
        logType = scanner.nextLine();

        if (logType != null) {
            switch (logType) {
                case "F":
                    logFactory = new FileLoggerFactory();
                    break;
                case "D":
                    logFactory = new DbLoggerFactory();
                    break;
                case "C":
                    logFactory = new ConsoleLoggerFactory();
                    break;
                default:
                    System.out.println("Указанный тип логирования не поддерживается.");
                    System.exit(1);
            }
        }

        assert logFactory != null;
        logger = logFactory.createLogger();
        Calculator calculator = new Calculator(logger);

        calculator.sum(a, b);
        System.out.println("==============================================================");
        calculator.diff(a, b);
        System.out.println("==============================================================");
        calculator.mult(a, b);
        System.out.println("==============================================================");
        calculator.div(a, b);
    }
}
