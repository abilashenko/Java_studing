package Lesson7;

import java.io.*;
import java.util.ArrayList;

public class AccountService implements IfAccountService {
    private String path;
    private final ArrayList<Account> accounts;

    public AccountService(String path) {
        this.path = path;
        accounts = new ArrayList<>();
        readFromFile();
    }

    private void readFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String str;
            while ((str = reader.readLine()) != null) {
                String[] line = str.split("\\|");
                accounts.add(new Account(Integer.parseInt(line[0]), line[1], Integer.parseInt(line[2])));
            }
        } catch (Exception e) {
            System.out.println("Ошибка чтения из файла: " + e.getMessage());
        }
    }

    private void writeToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(path))) {
            for (Account account : accounts) {
                writer.println(account.getId() + "|" + account.getHolder() + "|" + account.getAmount());
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }
    }

    @Override
    public void balance(int accountID) throws UnknownAccountException {
        boolean unknownAccount = true;
        for (int i = 0; i < accounts.size(); i++) {
            Account account = accounts.get(i);
            if (account.getId() == accountID) {
                unknownAccount = false;
                System.out.println(account.getHolder() + ", Баланс: " + account.getAmount());
            }
        }
        if (unknownAccount) {
            throw new UnknownAccountException("(id = " + accountID + ")");
        }
    }

    @Override
    public void withdraw(int accountID, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        boolean unknownAccount = true;
        for (int i = 0; i < accounts.size(); i++) {
            Account account = accounts.get(i);
            if (account.getId() == accountID) {
                unknownAccount = false;
                if (account.getAmount() < amount) {
                    throw new NotEnoughMoneyException("(id = " + accountID + ")");
                } else {
                    account.setAmount(account.getAmount() - amount);
                    break;
                }
            }
        }
        if (unknownAccount) {
            throw new UnknownAccountException("(id = " + accountID + ")");
        }
        writeToFile();
        System.out.println("Операция выполнена успешно!");
    }

    @Override
    public void deposit(int accountID, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        boolean unknownAccount = true;
        for (int i = 0; i < accounts.size(); i++) {
            Account account = accounts.get(i);
            if (account.getId() == accountID) {
                unknownAccount = false;
                if (amount <= 0) {
                    throw new NotEnoughMoneyException("(id = " + accountID + ")");
                } else {
                    account.setAmount(account.getAmount() + amount);
                    break;
                }
            }
        }
        if (unknownAccount) {
            throw new UnknownAccountException("(id = " + accountID + ")");
        }
        writeToFile();
        System.out.println("Операция выполнена успешно!");
    }

    @Override
    public void transfer(int from, int to, int amount) throws NotEnoughMoneyException, UnknownAccountException {
        Account fromAccount = null;
        Account toAccount = null;
        for (int i = 0; i < accounts.size(); i++) {
            Account account = accounts.get(i);
            if (account.getId() == from) {
                fromAccount = account;
            }
            if (account.getId() == to) {
                toAccount = account;
            }
        }
        if (fromAccount == null) {
            throw new UnknownAccountException("(id = " + from + ")");
        }
        if (toAccount == null) {
            throw new UnknownAccountException("(id = " + to + ")");
        }
        if (fromAccount.getAmount() < amount) {
            throw new NotEnoughMoneyException("(id = " + from + ")");
        }

        fromAccount.setAmount(fromAccount.getAmount() - amount);
        toAccount.setAmount(toAccount.getAmount() + amount);
        writeToFile();
        System.out.println("Операция выполнена успешно!");
    }
}