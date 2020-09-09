package Lesson2.Task2;

import java.util.Scanner;

public class DigitSum {

    static int sum(int n) {
        if (n < 10) return n;
        return n % 10 + sum(n / 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println("Введите целое трёхзначное число:");
            while (!scanner.hasNextInt()) {
                System.out.println("Вы ввели не число!\nВведите целое трёхзначное число:");
                scanner.next();
            }
          number = scanner.nextInt();
          System.out.println("Вы ввели не трёхзначное число!");
            }   while (Integer.toString(number).length() != 3);
                int digitsum = sum(number);
                String result = "Сумма цифр Вашего числа: " + digitsum;
                System.out.println(result);
    }
}