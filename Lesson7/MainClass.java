package Lesson7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MainClass {
    private final static String path = "Lesson7/AccountsData.txt";

    public static void main(String[] args) {
        createStorage();
        (new AccountManager(path)).run();
    }

    public static void createStorage() {
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
}