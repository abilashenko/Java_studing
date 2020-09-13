package Lesson2.Task5;

import java.util.Arrays;
import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        int[] Arr = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("Введите " + (i + 1) + "-е целое число: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Вы ввели не целое число!");
                scanner.next();
            }
            Arr[i] = scanner.nextInt();
        }
        Arrays.sort(Arr);
        System.out.println("Наименьшее число из трёх введённых: " + Arr[0]);
    }
}