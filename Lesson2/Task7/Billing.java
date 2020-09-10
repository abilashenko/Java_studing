package Lesson2.Task7;

import java.util.Scanner;

public class Billing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Калькулятор стоимости междугородней связи.");
        while (true) {
            System.out.println("Введите длительность разговора в минутах:");
            while (!scanner.hasNextInt()) {
                System.out.println("Вы ввели что-то не то! Попробуйте еще раз!");
                System.out.println("Введите длительность разговора в минутах:");
                scanner.next();
            }
            int time = scanner.nextInt();
            if (time < 0) {
                System.out.println("Время не может быть меньше 0! Попробуйте еще раз!");
                continue;
            }
            System.out.println("Введите код города (Москва(905), Ростов(194), Краснодар(491), Киров(800)):");
            while (!scanner.hasNextInt()) {
                System.out.println("Вы ввели что-то не то! Попробуйте еще раз!");
                System.out.println("Введите код города (Москва(905), Ростов(194), Краснодар(491), Киров(800)):");
                scanner.next();
            }
            int code = scanner.nextInt();
            switch (code) {
                case 905:
                    double price905 = time * 4.15;
                    System.out.println("Стоимость разговора длительностью " + time + "мин. - " + price905 + "руб.\n");
                    break;
                case 194:
                    double price194 = time * 1.98;
                    System.out.println("Стоимость разговора длительностью " + time + "мин. - " + price194 + "руб.\n");
                    break;
                case 491:
                    double price491 = time * 2.69;
                    System.out.println("Стоимость разговора длительностью " + time + "мин. - " + price491 + "руб.\n");
                    break;
                case 800:
                    double price800 = time * 5.00;
                    System.out.println("Стоимость разговора длительностью " + time + "мин. - " + price800 + "руб.\n");
                    break;
                default:
                    System.out.println("Город с таким кодом не найден...\n");
            }
        }
    }
}