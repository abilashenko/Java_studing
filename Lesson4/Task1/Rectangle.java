package Lesson4.Task1;

public class Rectangle implements Shape {
    private double a;
    private double b;

    public double square() {
        this.a = 5.5;
        this.b = 7.25;
        return a * b;
    }
}