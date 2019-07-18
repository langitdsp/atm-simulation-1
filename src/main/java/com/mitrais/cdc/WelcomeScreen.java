package com.mitrais.cdc;

import java.util.ArrayList;
import java.util.Scanner;

import com.mitrais.cdc.model.Account;
import com.mitrais.cdc.utils.Utils;

/*
 * Welcome screen
 */
public class WelcomeScreen
{
    public void start(ArrayList<Account> accounts){
      Scanner scanner = new Scanner(System.in);
      String accountNumber = "";
      String pin = "";
      Account account = new Account();
  
        // Enter account number
        System.out.println("Enter Account Number");
        accountNumber = scanner.nextLine();
    
        if(!Utils.isLengthValid(accountNumber)){
            System.out.println("Account Number should have 6 digits number");
            break;
        }

        if(!Utils.isNumericOnlyValid(accountNumber)){
            System.out.println("Account Number should only contains numbers");
            break;
        }

        // Enter account number
        System.out.println("Enter PIN");
        pin = scanner.nextLine();
        
        if(!Utils.isLengthValid(pin)){
            System.out.println("PIN should have 6 digits number");
            break;
        }

        if(!Utils.isNumericOnlyValid(pin)){
            System.out.println("PIN should only contains numbers");
            break;
        }

        Boolean isFound = false;
        for(Account acc: accounts){
          if(acc.getAccountNumber().equals(accountNumber) && acc.getPin().equals(pin)){
              isFound = true;
              account = acc;
          }
        }

        if(!isFound){
            System.out.println("Invalid Account Number/PIN");
        }

        scanner.close();

        TransactionScreen transactionScreen = new TransactionScreen();
        transactionScreen.start(account);
  
      
    }
}