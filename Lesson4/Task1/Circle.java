package Lesson4.Task1;

public class Circle implements Shape {
    private double r;

    public double square() {
        this.r = 10;
        return Math.PI * r * r;
    }
}