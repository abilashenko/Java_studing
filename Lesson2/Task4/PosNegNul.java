package Lesson2.Task4;

import java.util.Scanner;

public class PosNegNul {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите целое число (q - выход):");
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                if (input > 0) {
                    number = input + 1;
                } else if (input == 0) {
                    number = 10;
                } else {
                    number = input - 2;
                }
                String result = "Результат вычислений:" + (number);
                System.out.println(result);
            } else if (scanner.next().equals("q")) {
                break;
            } else {
                System.out.println("Вы ввели не целое число!");
            }
        }
    }
}