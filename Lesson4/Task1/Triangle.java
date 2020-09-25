package Lesson4.Task1;

public class Triangle implements Shape {
    private double a;
    private double b;
    private double c;

    public double square() {
        this.a = 4.7;
        this.b = 5.8;
        this.c = 10;
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
