package Lesson4.Task2;

public class Lorry extends Car {
    private int tunnage;

    public int getTunnage() {
        return tunnage;
    }

    public void setTunnage(int tunnage) {
        this.tunnage = tunnage;
    }

    @Override
    public void start() {
        System.out.println("Грузовик поехал!");
    }

    @Override
    public void stop() {
        System.out.println("Грузовик остановился!");
    }

    @Override
    public void printInfo() {
        System.out.println("Информация об автомобиле класса 'Грузовик':");
        System.out.println("Бренд:\t\t\t\t" + getBrand());
        System.out.println("Класс:\t\t\t\t" + getCarClass());
        System.out.println("Вес:\t\t\t\t" + getWeight() + " килограмм");
        System.out.println("Грузоподъемность:\t" + getTunnage() + " тонн");
        System.out.println("Двигатель");
        System.out.println("Производитель:\t\t" + getMotor().getProducer());
        System.out.println("Мощность:\t\t\t" + getMotor().getPower() + " лошадиных сил");
    }
}
