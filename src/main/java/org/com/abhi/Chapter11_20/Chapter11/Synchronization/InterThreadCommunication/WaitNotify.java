package org.com.abhi.Chapter11_20.Chapter11.Synchronization.InterThreadCommunication;

public class WaitNotify {

    public static void main(String[] args) {
            SharedResource sharedResource = new SharedResource();

            Thread waitThread = new Thread(sharedResource::waitForZeroCondition);
            Thread incThread = new Thread(sharedResource::incrementCount);
            Thread decThread = new Thread(()-> sharedResource.decrementCount());
        waitThread.start();
        incThread.start();
        decThread.start();
            for (int i=0; i<=5;i++){
                try {
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }

    }
}

class SharedResource{

    private int count=0;

    synchronized void waitForZeroCondition(){


            try {
            while (count!=0){
                System.out.println("Thread waiting for count=0");
                wait();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Count is Zero");
    }

    public synchronized void incrementCount(){
        System.out.println("Increment");
        count++;
    }

    public synchronized void decrementCount(){
        System.out.println("Decrement");
        count--;
        if (count==0){
            notifyAll();
        }
    }

}