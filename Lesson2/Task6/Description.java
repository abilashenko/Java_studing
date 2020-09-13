package Lesson2.Task6;

import java.util.Scanner;

public class Description {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String pos = "положительное ";
        String neg = "отрицательное ";
        String even = "чётное число!";
        String odd = "нечётное число!";
        String nul = "нулевое число!";
        while (true) {
            System.out.println("Введите целое число (q - выход):");
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                if (input > 0) {
                    if (input % 2 == 0) {
                        System.out.println("Вы ввели " + pos + even);
                    } else {
                        System.out.println("Вы ввели " + pos + odd);
                    }
                }
                if (input < 0) {
                    if (input % 2 == 0) {
                        System.out.println("Вы ввели " + neg + even);
                    } else {
                        System.out.println("Вы ввели " + neg + odd);
                    }
                }
                if (input == 0) {
                    System.out.println("Вы ввели " + nul);
                }
            } else if (scanner.next().equals("q")) {
                break;
            } else {
                System.out.println("Вы ввели не целое число!");
            }
        }
    }
}