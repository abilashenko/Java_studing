package Lesson5.Task2;

import java.util.Scanner;

public class PC {
    public static void main(String[] args) {
        System.out.println("Введите тип конфигурации ПК (DESKTOP, GAMING, SERVER):");
        Scanner scanner = new Scanner(System.in);
        ComputerCreate pc = null;

        switch (scanner.next()) {
            case "DESKTOP":
                pc = new CreateDesktopPC();
                break;
            case "GAMING":
                pc = new CreateGamingPC();
                break;
            case "SERVER":
                pc = new CreateServerPC();
                break;
            default:
                System.out.println("Такая конфигурация не предусмотрена!");
                System.exit(1);
        }

        Computer computer = (new PCBuilder()).create(pc);

        System.out.println(computer.pcInfo());
        System.exit(1);
    }
}