package Lesson4.Task1;

import java.util.Scanner;

public class Circle implements Shape {
    double R;
    Scanner scanner = new Scanner(System.in);

    public double square() {
        System.out.println("Ведите радиус круга: ");
        if (scanner.hasNextDouble()) {
            R = scanner.nextDouble();
        }
        return Math.PI * R * R;
    }
}
