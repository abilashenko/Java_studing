package Lesson3.Task1;

public class Phone {
    int number;
    String model;
    int weight;
    String name;

    void aboutPhone() {
        System.out.println("Номер телефона 1: " + number);
        System.out.println("Модель телефона 1: " + model);
        System.out.println("Вес телефона 1: " + weight);
    }

    void receiveCall(String userName) {
        name = userName;
        System.out.println("Звонит " + name);
    }

    int getNumber() {
        return number;
    }

    public Phone(int number, String model, int weight) {
        this(number, model);
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    static void receiveCall(String userName, int phoneNumber) {
        System.out.println("Новый пользователь '" + userName + "' с номером: " + phoneNumber);
    }

    static void sendMessage(int... numbers) {
        System.out.println("Сообщение будет отправлено на следующие номера:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Номер " + (i + 1) + ": " + numbers[i]);
        }
    }
}