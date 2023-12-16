package org.com.abhi.Chapter11_20.Chapter11.Multithreading.VolatileConcept;

import java.util.concurrent.TimeUnit;

public class WithVolatile {

    private volatile boolean flag = false;

    private void toggle(){
        flag = !flag;
    }

    public boolean getFlag() {
        return flag;
    }

    public static void main(String[] args) {

        WithVolatile obj = new WithVolatile();

        Thread writerThread = new Thread(() -> {
            try {
                TimeUnit.SECONDS.sleep(1);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            obj.toggle();
            System.out.println("A. Flag is "+ obj.getFlag());
        });

        Thread readerThread = new Thread(()-> {
            while (!obj.getFlag()){

            }
            System.out.println("B. Flag is "+ obj.getFlag());
        });

        writerThread.start();
        readerThread.start();
    }
}
