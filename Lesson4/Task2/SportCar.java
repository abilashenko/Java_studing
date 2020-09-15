package Lesson4.Task2;

public abstract class SportCar extends Car {
    private int maxSpeed;

    @Override
    public void start() {
        System.out.println("SportCar поехал!");
    }

    @Override
    public void stop() {
        System.out.println("SportCar остановился!");
    }
}
