package Lesson3.Task1;

public class Phone {
    public int number;
    public String model;
    public int weight;
    public String name;

    public void aboutPhone() {
        System.out.println("Номер телефона: " + number);
        System.out.println("Модель телефона: " + model);
        System.out.println("Вес телефона: " + weight);
    }

    public void receiveCall(String userName) {
        this.name = userName;
        System.out.println("Звонит " + name);
    }

    public int getNumber() {
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
        this.number = 0;
        this.model = "NoName";
        this.weight = 0;
    }

    public void receiveCall(String userName, int phoneNumber) {
        System.out.println("Новый пользователь '" + userName + "' с номером: " + phoneNumber);
    }

    public void sendMessage(int... numbers) {
        System.out.println("Сообщение будет отправлено на следующие номера:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Номер " + (i + 1) + ": " + numbers[i]);
        }
    }
}