package Lesson2.Task3;

import java.util.Scanner;

public class PosNeg {
    public static void main(String[] args) {
            int number;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите целое число:");
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