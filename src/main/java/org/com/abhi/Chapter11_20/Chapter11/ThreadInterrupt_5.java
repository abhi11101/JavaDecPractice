package org.com.abhi.Chapter11_20.Chapter11;

public class ThreadInterrupt_5 {
    public static void main(String[] args) {

        Thread thread = new Thread(() -> {
            for (int i=1;i<=5;i++){
                System.out.print(".");
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    //e.printStackTrace();
                    System.out.println("Thread is Interrupted");
                    return;
                }
            }
        });
        System.out.println("Thread will take 5 dots");
        thread.start();

        System.out.println("Main Thread is working");
        for (int i=0;i<=5;i++){
            try {
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println();
        System.out.println("Time to interrupt the thread");
        thread.interrupt();
    }
}
