package com.sunbeam.q1;

import java.util.Scanner;

import com.sunbeam.q1.*;

public class CreditLimitCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Details");

        System.out.println("Enter AccNo.");
        int accountNumber = input.nextInt();
        System.out.println("Enter Begining Balance This Month");
        int beginningBalance = input.nextInt();
        System.out.println("Enter total items charged");
        int totalCharges = input.nextInt();
        System.out.println("Enter total all credit applied in this month");
        int totalCredits = input.nextInt();
        System.out.println("Enter Credit Limit");
        int creditLimit = input.nextInt();

        
        Customer customer = new Customer(accountNumber, beginningBalance, totalCharges, totalCredits, creditLimit);
        
        customer.display();

        
        int newBalance = customer.calculateNewBalance();

        System.out.println("New Balance: " + newBalance);

        
        if (customer.isCreditLimitExceeded()) {
            System.out.println("Credit limit exceeded.");
        }
        else {
        	System.out.println("Credit Limit is within the limit.");
        }

        input.close();
    }
}
