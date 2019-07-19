package com.mitrais.cdc;

import java.util.ArrayList;
import java.util.Scanner;

import com.mitrais.cdc.model.Account;
import com.mitrais.cdc.utils.Utils;

/*
 * Welcome screen
 */
public class WelcomeScreen {
    Scanner scanner;
    ArrayList<Account> accounts;

    public WelcomeScreen(Scanner scanner) {
        // Create initial data
        this.accounts = new ArrayList<Account>();
        this.accounts.add(new Account("John Doe", "012108", 100, "112233"));
        this.accounts.add(new Account("Jane Doe", "932012", 30, "112244"));
        this.scanner = scanner;
    }

    public void start() {
        String accountNumber = "";
        String pin = "";
        Account account = new Account();

        // Enter account number
        System.out.println("Enter Account Number");
        accountNumber = this.scanner.nextLine();

        if (!Utils.isLengthValid(accountNumber)) {
            System.out.println("Account Number should have 6 digits number");
        }

        if (!Utils.isNumericOnlyValid(accountNumber)) {
            System.out.println("Account Number should only contains numbers");
        }

        // Enter account number
        System.out.println("Enter PIN");
        pin = this.scanner.nextLine();

        if (!Utils.isLengthValid(pin)) {
            System.out.println("PIN should have 6 digits number");
        }

        if (!Utils.isNumericOnlyValid(pin)) {
            System.out.println("PIN should only contains numbers");
        }

        Boolean isFound = false;
        for (Account acc : this.accounts) {
            if (acc.getAccountNumber().equals(accountNumber) && acc.getPin().equals(pin)) {
                isFound = true;
                account = acc;
            }
        }

        if (!isFound) {
            System.out.println("Invalid Account Number/PIN");
        }

        TransactionScreen transactionScreen = new TransactionScreen(account, this.scanner);
        transactionScreen.start();


    }
}