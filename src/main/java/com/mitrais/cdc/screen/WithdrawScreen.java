package com.mitrais.cdc.screen;

import java.util.Scanner;

import com.mitrais.cdc.model.Account;

public class WithdrawScreen {
    Account account;
    Scanner scanner;
    SummaryScreen summaryScreen;

    public WithdrawScreen(Account account, Scanner scanner) {
        this.account = account;
        this.scanner = scanner;
        this.summaryScreen = new SummaryScreen(account, scanner);
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

        option = Integer.parseInt(this.scanner.nextLine());

        switch (option) {
            case 1:
                if (this.account.getBalance() < 10) {
                    System.out.println("Insufficient balance $" + this.account.getBalance());
                    break;
                }
                this.account.setBalance(this.account.getBalance() - 10);
                this.summaryScreen.start(10);
                break;
            case 2:
                if (this.account.getBalance() < 50) {
                    System.out.println("Insufficient balance $" + this.account.getBalance());
                    break;
                }

                this.account.setBalance(this.account.getBalance() - 50);
                this.summaryScreen.start(50);
                break;
            case 3:
                if (this.account.getBalance() < 100) {
                    System.out.println("Insufficient balance $" + this.account.getBalance());
                    break;
                }
                this.account.setBalance(this.account.getBalance() - 100);
                this.summaryScreen.start(100);
                break;
            case 4:
                otherWithdraw();
                break;
            case 5:
                break;
            default:
                break;

        }
    }

    public void otherWithdraw() {

        System.out.println("\n\nOther Withdraw");
        System.out.println("Enter amount to withdraw");

        int amount = Integer.parseInt(this.scanner.nextLine());

        if (amount > 1000 || amount % 10 != 0) {
            System.out.println("Invalid amount");
        } else if (amount > this.account.getBalance()) {
            System.out.println("Insufficeint balance $" + amount);
        } else {
            this.account.setBalance(account.getBalance() - amount);
            this.summaryScreen.start(amount);
        }
    }
}