package org.com.abhi.Chapter11_20.Chapter11;

public class Join_7 {

    public static void main(String[] args) {

        Thread myThread = new Thread(() -> {

            for (int i=1;i<=10;i++){
                System.out.print("* ");
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    System.out.println(Thread.currentThread().getName() + " is interrupted");
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        });

        Thread installThread = new Thread(()-> {
            for (int i=1;i<=10;i++){
                System.out.println("Installing Step "+ i);
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        },"Installation Thread");

        Thread monitor = new Thread(() -> {
            long now = System.currentTimeMillis();
            while (myThread.isAlive()){
                System.out.println("Waiting " + myThread.getName() + " to get completed");
                try {
                    Thread.sleep(1000);

                    if (System.currentTimeMillis()-now >2000){
                        myThread.interrupt();
                    }
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }

        });

        System.out.println(myThread.getName() + " is starting");
        myThread.start();
        monitor.start();

        try {
            myThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (!myThread.isInterrupted()){
            installThread.start();
        }else {
            System.out.println("Previous thread was interrupted.");
        }

    }
}
