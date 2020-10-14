package Task1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class MainClass {
    private final static String path = "Lesson8/src/main/Data/AccountsData.txt";
    private static String type = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Выбирите тип хранилища [File, DB]:");
            String input = scanner.nextLine();

            if (input.equals("File")) {
                type = input;
                break;
            } else if (input.equals("DB")) {
                type = input;
                break;
            }
            System.out.println("Введённый тип хранилища (" + input + ") не поддерживается!");
        }
        switch (type) {
            case "File":
                createFile();
                break;
            case "DB":
                createDB();
                break;
        }
        (new AccountManager(path, type)).run();
    }

    public static void createFile() {
        File file = new File(path);
        if (file.exists() && !file.isDirectory()) {
            return;
        }

        try (PrintWriter writer = new PrintWriter(new FileWriter(path))) {
            writer.println("1|Андреев Андрей|10000");
            writer.println("2|Алексеев Алексей|20000");
            writer.println("3|Александров Александр|30000");
            writer.println("4|Васильев Василий|40000");
            writer.println("5|Дмитриев Дмитрий|50000");
            writer.println("6|Иванов Иван|60000");
            writer.println("7|Максимов Максим|70000");
            writer.println("8|Николаев Николай|80000");
            writer.println("9|Петров Пётр|90000");
            writer.println("10|Сергеев Сергей|100000");
        } catch (IOException e) {
            System.out.println("Ошибка создания файла: " + e.getMessage());
            System.exit(1);
        }
    }

    public static void createDB() {
        try {
            Class.forName("org.h2.Driver");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        Connection connection = null;
        try {
            try {
                connection = DriverManager.getConnection("jdbc:h2:file:~/test;INIT=RUNSCRIPT FROM './src/main/Data/Schema.sql'\\;RUNSCRIPT FROM './src/main/Data/Data.sql'");
            } finally {
                try {
                    if (connection != null) {
                        connection.close();
                    }
                } catch (Exception e) {}
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}