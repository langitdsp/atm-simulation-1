package com.mitrais.cdc;

import java.util.Scanner;

import com.mitrais.cdc.model.Account;

public class WithdrawScreen {
    Account account;
    Scanner scanner;

    public WithdrawScreen(Account account, Scanner scanner) {
        this.account = account;
        this.scanner = scanner;
    }

    public void start() {
        int option;

        System.out.println("\n\nWithdraw");
        System.out.println("1. $10");
        System.out.println("2. $50");
        System.out.println("3. $100");
        System.out.println("4. Other");
        System.out.println("5. Back");
        System.out.println(" Exit");
        System.out.println("Please choose option[3]: ");

        option = this.scanner.nextInt();

        switch (option) {
            case 1:
                this.account.setBalance(this.account.getBalance() - 10);
                break;
            case 2:
                this.account.setBalance(this.account.getBalance() - 50);
                break;
            case 3:
                this.account.setBalance(this.account.getBalance() - 100);
                break;
            case 4:
                otherWithdraw(this.account);
                break;
            case 5:
                break;
            default:
                break;

        }
    }

    public void otherWithdraw(Account account) {

        System.out.println("\n\nOther Withdraw");
        System.out.println("Enter amount to withdraw");

        int amount = this.scanner.nextInt();

        if (amount > 1000 || amount % 10 != 0) {
            System.out.println("Invalid amount");
        } else if (amount > account.getBalance()) {
            System.out.println("Insufficeint balance $" + amount);
        } else {
            account.setBalance(account.getBalance() - amount);
        }
    }
}