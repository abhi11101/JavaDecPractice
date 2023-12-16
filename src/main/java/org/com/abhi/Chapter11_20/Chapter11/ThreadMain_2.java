package org.com.abhi.Chapter11_20.Chapter11;

import java.util.concurrent.TimeUnit;

public class ThreadMain_2 {
    public static void main(String[] args) {
        ThreadClass_2 obj = new ThreadClass_2();
        obj.start();
        for (int i=1;i<=5;i++){
            System.out.println("0");
            try {
                Thread.sleep(1000);
                TimeUnit.SECONDS.sleep(1);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
