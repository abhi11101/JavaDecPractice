package org.com.abhi.Chapter11_20.Chapter11.Synchronization;

public class BankAccount_1 {

    private int balance;

    public BankAccount_1(int balance){
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public synchronized void deposit(int amount){
        try {
            Thread.sleep(100);
        }catch (InterruptedException e){

        }
        long original_balance =balance;
        balance+=amount;
        System.out.printf("Original: %d Deposit Amount: %d Balance: %d%n",original_balance,amount,balance);
    }

    public synchronized void withdraw(int amount){
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        if (amount<=balance){
            long original = balance;
            balance-=amount;
            System.out.printf("Original: %d Withdraw Amount: %d Balance: %d%n",original,amount,balance);
        }else {
            System.out.printf("Insufficient Fund. Balance: %d",balance);
        }
    }
}
