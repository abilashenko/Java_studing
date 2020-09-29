package Lesson4.Task2;

public class SportCar extends Car {
    private int maxSpeed;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void start() {
        System.out.println("SportCar поехал!");
    }

    @Override
    public void stop() {
        System.out.println("SportCar остановился!");
    }

    @Override
    public void printInfo() {
        System.out.println("Информация об автомобиле класса 'Спортивная машина':");
        System.out.println("Бренд:\t\t\t\t" + getBrand());
        System.out.println("Класс:\t\t\t\t" + getCarClass());
        System.out.println("Вес:\t\t\t\t" + getWeight() + " килограмм");
        System.out.println("Макс. скорость:\t\t" + getMaxSpeed() + " км/ч");
        System.out.println("Двигатель");
        System.out.println("Производитель:\t\t" + getMotor().getProducer());
        System.out.println("Мощность:\t\t\t" + getMotor().getPower() + " лошадиных сил");
    }
}
