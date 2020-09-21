package Lesson5.Task1;

public class Main {
    public static void main(String[] args) {
        int a = 9;
        int b = 7;
        Calculator calculator = new Calculator();
        calculator.sum(a, b);
        System.out.println("==============================================================");
        calculator.diff(a, b);
        System.out.println("==============================================================");
        calculator.mult(a, b);
        System.out.println("==============================================================");
        calculator.div(a, b);
    }
}
