package Lesson4.Task1;

import java.util.Scanner;

public class Rectangle implements Shape {
    Scanner scanner = new Scanner(System.in);
    double a;
    double b;

    public double square() {
        System.out.println("Ведите длину прямоугольника: ");
        if (scanner.hasNextDouble()) {
            a = scanner.nextDouble();
        }
        System.out.println("Ведите ширину прямоугольника: ");
        if (scanner.hasNextDouble()) {
            b = scanner.nextDouble();
        }
        return a * b;
    }
}