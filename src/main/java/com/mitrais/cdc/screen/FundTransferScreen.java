package com.mitrais.cdc.screen;

import com.mitrais.cdc.model.Account;

import java.util.Scanner;

public class FundTransferScreen {
    Scanner scanner;
    Account account;

    public FundTransferScreen(Account account, Scanner scanner) {
        this.account = account;
        this.scanner = scanner;
    }

    public void start(){
        String destinationAccountNumber = "";
        int amount = 0;
        String referenceNo = "";
        int option;

        System.out.println("\n\nFund Transfer...");

        System.out.println("Please enter destination account and");
        System.out.println("press enter to continue or");
        System.out.println("press cancel (Esc) to go back to Transaction : ");

        destinationAccountNumber = this.scanner.nextLine();

        System.out.println("Please enter transfer amount and");
        System.out.println("press enter to continue or");
        System.out.println("press cancel (Esc) to go back to Transaction : ");

        amount = Integer.parseInt(this.scanner.nextLine());

        // Transfer confirmation
        System.out.println("\n\nTransfer Confirmation");
        System.out.printf("%-20s : %s %n", "Destination Account", destinationAccountNumber);
        System.out.printf("%-20s : %d %n", "Transfer amount", amount);
        System.out.printf("%-20s : %s %n", "Reference Number", referenceNo);

        System.out.printf("\n1. Confirm Trx");
        System.out.println("Cancel Trx");

        option = Integer.parseInt(this.scanner.nextLine());

        switch (option){
            case 1:
                confirmTrx(destinationAccountNumber, amount, referenceNo);
                break;
            case 2:
                break;
            default:
                break;
        }

    }

    private void confirmTrx(String destinationAccountNumber, int amount, String referenceNo){

    }
}
