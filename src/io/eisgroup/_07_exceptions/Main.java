package io.eisgroup._07_exceptions;

public class Main {

    public static void main(String[] args) {

        CheckingAccount checkingAccount = new CheckingAccount(1);
        checkingAccount.deposit(500.00);

        try {
            checkingAccount.withdraw(100.00);
            checkingAccount.withdraw(500.00);
        } catch (InsufficientFundsException e) {
            System.out.println("Sorry but you're short: " + e.getAmount());
            e.printStackTrace();
        }

    }

}
