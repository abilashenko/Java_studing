package Lesson4.Task1;

import java.util.Scanner;

public class Triangle implements Shape {
    double[] a = new double[3];
    Scanner scanner = new Scanner(System.in);

    public double square() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Ведите длину " + (i + 1) + "-ой стороны треугольника: ");
            if (scanner.hasNextDouble()) {
                a[i] = scanner.nextDouble();
            }
        }
        double p = (a[0] + a[1] + a[2]) / 2;
        return Math.sqrt(p * (p - a[0]) * (p - a[1]) * (p - a[2]));
    }
}
