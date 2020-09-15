package Lesson4.Task2;

public abstract class Car {
    private String brand;
    private String carClass;
    private int weight;
    public Engine motor = new Engine();

    public abstract void start();

    public abstract void stop();

    public abstract void printInfo();

    public void turnRight() {
        System.out.println("Поворот направо!");
    }

    public void turnLeft() {
        System.out.println("Поворот налево!");
    }
}
