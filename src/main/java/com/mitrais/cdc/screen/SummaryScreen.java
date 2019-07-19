package com.mitrais.cdc.screen;

import com.mitrais.cdc.model.Account;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SummaryScreen {
    Account account;
    Scanner scanner;
    LocalDateTime dateNow;

    public SummaryScreen(Account account, Scanner scanner) {
        this.account = account;
        this.scanner = scanner;
        this.dateNow = LocalDateTime.now();
    }

    public void start(int withdraw) {
        int option;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss a");

        System.out.println("\n\nSummary");
        System.out.println("Date : " + this.dateNow.format(formatter));
        System.out.println("Withdraw : $" + withdraw);
        System.out.println("Balance : $" + this.account.getBalance());

        System.out.println("\n1. Transaction");
        System.out.println("2. Exit");
        System.out.println("Choose option[2]");

        option = Integer.parseInt(this.scanner.nextLine());

        switch (option) {
            case 1:
                TransactionScreen transactionScreen = new TransactionScreen(account, this.scanner);
                transactionScreen.start();
                break;
            case 2:
                break;
            default:
                break;
        }
    }
}
