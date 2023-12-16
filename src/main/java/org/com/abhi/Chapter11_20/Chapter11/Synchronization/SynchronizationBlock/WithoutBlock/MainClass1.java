package org.com.abhi.Chapter11_20.Chapter11.Synchronization.SynchronizationBlock.WithoutBlock;

public class MainClass1 {

//    Issue is even though we can withdraw amount but threads are waiting for deposit to talk. As during that its not
//    even using critical section i.e. balance. To overcome this we put critical section inside
    public static void main(String[] args) {
        BankAccount1 bankAccount = new BankAccount1(10000);

        Thread withdraw = new Thread(() -> bankAccount.withdraw(2000));
        Thread withdraw2 = new Thread(() -> bankAccount.withdraw(5000));
        Thread withdraw3 = new Thread(() -> bankAccount.withdraw(3000));
        Thread deposit = new Thread(() -> bankAccount.deposit(4500));

        withdraw.start();
        withdraw2.start();
        withdraw3.start();
        deposit.start();

        try {
            withdraw.join();
            withdraw2.join();
            withdraw3.join();
            deposit.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Final balance "+ bankAccount.getBalance());
    }
}
