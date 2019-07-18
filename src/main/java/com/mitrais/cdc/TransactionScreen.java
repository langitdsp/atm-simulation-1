package com.mitrais.cdc;

import java.util.Scanner;

import com.mitrais.cdc.model.Account;

public class TransactionScreen
{
  public void start(Account account){
    Scanner scanner = new Scanner(System.in);

    int option;

    System.out.println("\n\nTransaction Screen");
    System.out.println("1. Withdraw");
    System.out.println("2. Fund Transfer");
    System.out.println(" Exit");
    System.out.println("Please choose option[3]: ");

    option = scanner.nextInt();

    switch(option) {
      case 1:
        WithdrawScreen withdrawScreen = new WithdrawScreen();
        withdrawScreen.start(account);
        break;
      case 2:
        break;
      case 3:
        break;
      default:
        break;
    }





    scanner.close();

  }
}