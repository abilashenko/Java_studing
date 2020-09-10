package Lesson2.Task1;

import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Вы ввели не целое число!\nВведите целое число:");
            scanner.next();
        }
        int number = scanner.nextInt();
        int lastdigit = number%10;
        String result = "Последняя цифра вашего числа: " + lastdigit;
        System.out.println (result);
    }
}