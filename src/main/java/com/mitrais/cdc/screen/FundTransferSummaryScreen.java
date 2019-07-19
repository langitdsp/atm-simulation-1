package com.mitrais.cdc.screen;

import com.mitrais.cdc.model.Account;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class FundTransferSummaryScreen {
    private Account account;
    private Scanner scanner;
    private LocalDateTime dateNow;

    public FundTransferSummaryScreen(Account account, Scanner scanner) {
        this.account = account;
        this.scanner = scanner;
        this.dateNow = LocalDateTime.now();
    }

    public void start(String destinationAccountNumber, int amount, String referenceNo) {
        int option;

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss a");

        System.out.println("\n\nFund Transfer Summary");
        System.out.printf("%-20s : %s %n", "Destination Account", destinationAccountNumber);
        System.out.printf("%-20s : %d %n", "Transfer amount", amount);
        System.out.printf("%-20s : %s %n", "Reference Number", referenceNo);
        System.out.printf("%-20s : %s %n", "Balance", this.account.getBalance());


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
