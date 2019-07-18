package com.mitrais.cdc;

import java.util.Scanner;

import com.mitrais.cdc.model.Account;

public class WithdrawScreen
{
  public void start(Account account){
    Scanner scanner = new Scanner(System.in);

    int option;

    System.out.println("\n\nWithdraw");
    System.out.println("1. $10");
    System.out.println("2. $50");
    System.out.println("3. $100");
    System.out.println("4. Other");
    System.out.println("5. Back");
    System.out.println(" Exit");
    System.out.println("Please choose option[3]: ");

    option = scanner.nextInt();

    switch(option) {
      case 1: 
        account.setBalance(account.getBalance() - 10);
        break;
      case 2: 
      account.setBalance(account.getBalance() - 50);
        break;
      case 3: 
      account.setBalance(account.getBalance() - 100);
        break;
      case 4: 
        break;
      case 5: 
        break;
      default:
        break;
        
    }





    scanner.close();

  }
}