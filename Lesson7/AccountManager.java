package Lesson7;

import java.util.Scanner;

public class AccountManager {
    AccountService accountService;

    public AccountManager(String path) {
        accountService = new AccountService(path);
        menu();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;

        while (run) {
            String[] args = scanner.nextLine().split("\\s+");

            switch (args[0]) {
                case "exit":
                    run = false;
                    break;
                case "balance":
                    balance(args);
                    break;
                case "withdraw":
                    withdraw(args);
                    break;
                case "deposite":
                    deposite(args);
                    break;
                case "tranfser":
                    transfer(args);
                    break;
                default:
                    error();
                    break;
            }
        }
    }

    private void balance(String[] args) {
        try {
            accountService.balance(Integer.parseInt(args[1]));
        } catch (UnknownAccountException e) {
            System.out.println("Пользователь " + e.getMessage() + " не найден.");
        }
    }

    private void withdraw(String[] args) {
        try {
            accountService.withdraw(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        } catch (UnknownAccountException e) {
            System.out.println("Пользователь " + e.getMessage() + " не найден.");
        } catch (NotEnoughMoneyException e) {
            System.out.println("На счете " + e.getMessage() + " недостаточно средств.");
        }
    }

    private void deposite(String[] args) {
        try {
            accountService.deposit(Integer.parseInt(args[1]), Integer.parseInt(args[2]));
        } catch (UnknownAccountException e) {
            System.out.println("Пользователь " + e.getMessage() + " не найден.");
        } catch (NotEnoughMoneyException e) {
            System.out.println("Вы ввели некорректную сумму (" + e.getMessage() + ")");
        }
    }

    private void transfer(String[] args) {
        try {
            accountService.transfer(Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));
        } catch (UnknownAccountException e) {
            System.out.println("Пользователь " + e.getMessage() + " не найден.");
        } catch (NotEnoughMoneyException e) {
            System.out.println("На счёте " + e.getMessage() + " недостаточно средст для перевода.");
        }
    }

    private void error() {
        System.out.println("Ошибка! Вы ввели некорректную команду!");
        menu();
    }

    private void menu() {
        System.out.println("Доступные действия:");
        System.out.println("'balance [id]' - баланс счёта");
        System.out.println("'withdraw [id] [ammount]' - снятие средств");
        System.out.println("'deposite [id] [ammount]' - пополнение счёта");
        System.out.println("'transfer [from] [to] [ammount]' - перевод средств");
        System.out.println("'exit' - выход");
    }
}