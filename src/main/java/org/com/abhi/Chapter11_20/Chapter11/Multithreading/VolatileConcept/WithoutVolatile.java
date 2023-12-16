package org.com.abhi.Chapter11_20.Chapter11.Multithreading.VolatileConcept;

import java.util.concurrent.TimeUnit;

public class WithoutVolatile {

    private boolean flag=false;

    public void toggle(){
        flag=!flag;
    }

    public boolean isReady(){
        return flag;
    }
    public static void main(String[] args) {

        WithoutVolatile obj = new WithoutVolatile();

        Thread writerThread = new Thread(()-> {
            try {
                TimeUnit.SECONDS.sleep(1);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            obj.toggle();
            System.out.println("A. Flag is set to " + obj.isReady());
        });

        Thread readerThread = new Thread(() -> {
            while (!obj.isReady()){

            }
            System.out.println("B. Flag is set to "+ obj.isReady());
        });

        writerThread.start();
        readerThread.start();

    }
}
