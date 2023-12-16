package org.com.abhi.Chapter11_20.Chapter11;

public class ThreadAction_6 {
    public static void main(String[] args) {

        Thread myThread = new Thread(() -> {
            String threadName = Thread.currentThread().getName();
            for (int i=1;i<=10;i++){

                System.out.print("* ");
                try {
                    Thread.sleep(1000);
                    System.out.println("A.State "+ Thread.currentThread().getState());
                }catch (InterruptedException e){
                    System.out.println(threadName + " is interrupted.");
                    System.out.println("A1.State "+ Thread.currentThread().getState());
                    return;
                }
            }
            System.out.println();
            System.out.println(threadName + " is completed");
        });

        System.out.println(myThread.getName() + " is starting");
        myThread.start();

        long now = System.currentTimeMillis();
        while (myThread.isAlive()){
            System.out.println("Waiting for thread to complete");
            try {
                Thread.sleep(1000);
                System.out.println("B. State "+ myThread.getState());

                if (System.currentTimeMillis() - now > 2000){
                    myThread.interrupt();
                }
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("C.State "+ myThread.getState());
    }
}
