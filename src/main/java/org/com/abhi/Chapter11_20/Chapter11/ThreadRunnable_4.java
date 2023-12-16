package org.com.abhi.Chapter11_20.Chapter11;

public class ThreadRunnable_4 implements Runnable{
    @Override
    public void run() {
        for (int i=1;i<=5;i++){
            System.out.println("Runnable");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
