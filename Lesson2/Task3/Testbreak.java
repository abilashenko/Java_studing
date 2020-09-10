package Lesson2.Task3;

import java.util.Scanner;

public class Testbreak {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите целое число (q - выход):");
            if (scanner.next().equals("q")) {
                break;
            }
            while (!scanner.hasNextInt()) {
                System.out.println("Вы ввели не целое число!\nВведите целое число:");
                scanner.next();
            }
            int input = scanner.nextInt();
            if (input > 0) number = input + 1;
            else number = input;
            String result = "Результат вычислений:" + (number);
            System.out.println(result);
        }
    }
}