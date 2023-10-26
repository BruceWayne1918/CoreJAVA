package com.sunbeam.q1;

public class Customer {
    private int accountNumber;
    private int beginningBalance;
    private int totalCharges;
    private int totalCredits;
    private int creditLimit;

    
    public Customer(int accountNumber, int beginningBalance, int totalCharges, int totalCredits, int creditLimit) {
        this.accountNumber = accountNumber;
        this.beginningBalance = beginningBalance;
        this.totalCharges = totalCharges;
        this.totalCredits = totalCredits;
        this.creditLimit = creditLimit;
    }
    
    public void display() {
    	
    	System.out.println("ACCOUNT NO :"+this.accountNumber);
//    	System.out.println("BEGINING BALANCE :"+this.beginningBalance);
    	System.out.println("TOTAL CHARGES :"+this.totalCharges);
//    	System.out.println("ACCOUNT NO :"+this.);
//    	System.out.println("ACCOUNT NO :"+this.accountNumber);
    }
    

   
    public int calculateNewBalance() {
        return beginningBalance + totalCharges - totalCredits;
    }

    
    public boolean isCreditLimitExceeded() {
        return calculateNewBalance() > creditLimit;
    }

   
}