package org.example;

class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Метод для внесения средств на счёт
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Депозит успешно добавлен");
        } else {
            System.out.println("Некорректная сумма депозита");
        }
    }

    // Метод для снятия средств со счёта
    public void withdraw(double amount) {
        if (balance >= amount && amount > 0) {
            balance -= amount;
            System.out.println("Снятие средств успешно выполнено");
        } else if (balance < amount) {
            System.out.println("Недостаточная сумма на счёте");
        } else {
            System.out.println("Отрицательная сумма снятия");
        }
    }
}