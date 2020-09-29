package Lesson4.Task2;

public abstract class Car {
    private String brand;
    private String carClass;
    private int weight;
    private Engine motor;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Engine getMotor() {
        return motor;
    }

    public void setMotor(Engine motor) {
        this.motor = motor;
    }

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
