package com.mitrais.cdc.screen;

import java.util.Scanner;

import com.mitrais.cdc.model.Account;

public class TransactionScreen {
    private Account account;
    private Scanner scanner;

    public TransactionScreen(Account account, Scanner scanner) {
        this.account = account;
        this.scanner = scanner;
    }

    public void start() {
        int option;

        System.out.println("\n\nTransaction Screen");
        System.out.println("1. Withdraw");
        System.out.println("2. Fund Transfer");
        System.out.println("3. Exit");
        System.out.println("Please choose option[3]: ");

        option = Integer.parseInt(this.scanner.nextLine());

        switch (option) {
            case 1:
                WithdrawScreen withdrawScreen = new WithdrawScreen(this.account, this.scanner);
                withdrawScreen.start();
                break;
            case 2:
                FundTransferScreen fundTransferScreen = new FundTransferScreen(this.account, this.scanner);
                fundTransferScreen.start();
                break;
            case 3:
                break;
            default:
                break;
        }

    }
}