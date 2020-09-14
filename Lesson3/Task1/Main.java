package Lesson3.Task1;

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.number = 1234;
        phone1.model = "Nokia 3310";
        phone1.weight = 200;

        Phone phone2 = new Phone();
        phone2.number = 5678;
        phone2.model = "Samsung S10";
        phone2.weight = 150;

        Phone phone3 = new Phone();
        phone3.number = 9012;
        phone3.model = "Iphone 10";
        phone3.weight = 175;

        phone1.aboutPhone();
        System.out.print("\n");
        phone2.aboutPhone();
        System.out.print("\n");
        phone3.aboutPhone();
        System.out.print("\n");

        phone1.receiveCall("John");
        phone2.receiveCall("Bob");
        phone3.receiveCall("Jack");
        System.out.print("\n");

        int number1 = phone1.getNumber();
        int number2 = phone2.getNumber();
        int number3 = phone3.getNumber();

        System.out.println("Номер телефона 1: " + number1);
        System.out.println("Номер телефона 2: " + number2);
        System.out.println("Номер телефона 3: " + number3);
        System.out.print("\n");

        Phone.receiveCall("Tom", 9999);
        System.out.print("\n");

        Phone.sendMessage(1111, 2222, 3333, 4444, 5555, 6666, 7777);
    }
}
