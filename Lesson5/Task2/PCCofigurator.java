package Lesson5.Task2;

import java.util.Scanner;

public class PCCofigurator {
    public static void main(String[] args) {
        PCType pcType = new PCType();

        System.out.println("Введите тип конфигурации ПК (Gaming, Desktop, Server):");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.next()) {
            case "Gaming":
                pcType.setComputer(new GamingPC());
                break;
            case "Desktop":
                pcType.setComputer(new DesktopPC());
                break;
            case "Server":
                pcType.setComputer(new ServerPC());
                break;
            default:
                System.out.println("Такая конфигурация не предусмотрена!");
        }
        pcType.configurePC();
    }
}
