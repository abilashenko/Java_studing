package Lesson2.Task1;

import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите целое число (q - выход):");
            if (scanner.hasNextInt()) {
                int lastdigit = scanner.nextInt() % 10;
                String result = "Последняя цифра вашего числа: " + lastdigit;
                System.out.println(result);
            } else if (scanner.next().equals("q")) {
                break;
            } else {
                System.out.println("Вы ввели не целое число!");
            }
        }
    }
}