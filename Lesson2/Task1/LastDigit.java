package Lesson2.Task1;

import java.util.Scanner;

public class LastDigit {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int lastdigit = number%10;
        String result = "Последняя цифра вашего числа: " + lastdigit;
        System.out.println (result);
    }
}