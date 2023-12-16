package org.com.abhi.Chapter11_20.Chapter11.Synchronization;

public class SynchronizedMethods_1 {

    public static void main(String[] args) {

        BankAccount_1 bankAccount = new BankAccount_1(10000);

        Thread deposit = new Thread(() -> bankAccount.deposit(5000));
        Thread withdraw = new Thread(()-> bankAccount.withdraw(2500));
        Thread deposit2 = new Thread(()->bankAccount.deposit(2500));

        deposit.start();
        withdraw.start();
        deposit2.start();

        try {
            deposit.join();
            withdraw.join();
            deposit2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Final balance: "+ bankAccount.getBalance());

    }
}
