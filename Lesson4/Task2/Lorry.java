package Lesson4.Task2;

public abstract class Lorry extends Car {
    private float tunnage;

    @Override
    public void start() {
        System.out.println("Грузовик поехал!");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановился!");
    }
}
