package org.com.abhi.Chapter11_20.Chapter11;

import java.util.concurrent.TimeUnit;

public class ThreadRunnable_3 {
    public static void main(String[] args) {

        Runnable runnable = () -> {

            for (int i=1;i<=5;i++){
                System.out.println("Runnable Thread");
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        };

        Thread myThread = new Thread(runnable);
        myThread.start();

        for (int i=1;i<=5;i++){
            System.out.println("Main Thread");
            try {
                TimeUnit.SECONDS.sleep(1);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
