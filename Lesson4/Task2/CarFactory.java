package Lesson4.Task2;

public class CarFactory {
    public static void main(String[] args) {
        Lorry lorry = new Lorry();
        lorry.setMotor(new Engine());

        lorry.setCarClass("Грузовик");
        lorry.setBrand("Volvo");
        lorry.setTunnage(30);
        lorry.setWeight(7000);

        lorry.getMotor().setProducer("Volvo Trucks");
        lorry.getMotor().setPower(300);

        SportCar sportCar = new SportCar();
        sportCar.setMotor(new Engine());

        sportCar.setCarClass("Спортивная машина");
        sportCar.setBrand("Ferrari");
        sportCar.setWeight(1450);
        sportCar.setMaxSpeed(450);

        sportCar.getMotor().setProducer("Ferrari");
        sportCar.getMotor().setPower(1200);

        lorry.printInfo();
        System.out.println("=======================================================");
        sportCar.printInfo();
    }
}
