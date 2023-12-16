package org.com.abhi.Chapter11_20.Chapter11;

public class ChallengeThread_8 extends Thread{

    @Override
    public void run(){
        for (int i=1;i<=10;i++){
            if (i%2==0){
                System.out.println(i);
            }
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(Thread.currentThread().getName() + " is interrupted");
                return;
            }
        }
    }
}
