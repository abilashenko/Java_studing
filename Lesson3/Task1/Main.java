package Lesson3.Task1;

public class Main {
    public static void main(String[] args) {
        Phone[] phone = new Phone[3];
        phone[0] = new Phone(1234, "Nokia 3310", 200);
        phone[1] = new Phone(5678, "Samsung S10", 150);
        phone[2] = new Phone(9012, "Iphone 10", 175);

        for (Phone element : phone) {
            element.aboutPhone();
            System.out.println();
        }

        phone[0].receiveCall("John");
        phone[1].receiveCall("Bob");
        phone[2].receiveCall("Jack");
        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.println("Номер телефона " + (i + 1) + ": " + phone[i].getNumber());
        }
        System.out.println();

        Phone newPhone = new Phone();

        newPhone.receiveCall("Tom", 9999);
        System.out.println();

        newPhone.sendMessage(1111, 2222, 3333, 4444, 5555, 6666, 7777);
    }
}