package Lesson2.Task3;

import java.util.Scanner;

public class PosNeg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите целое число (q - выход):");
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                if (input > 0) {
                    input++;
                }
                String result = "Результат вычислений:" + (input);
                System.out.println(result);
            } else if (scanner.next().equals("q")) {
                break;
            } else {
                System.out.println("Вы ввели не целое число!");
            }
        }
    }
}