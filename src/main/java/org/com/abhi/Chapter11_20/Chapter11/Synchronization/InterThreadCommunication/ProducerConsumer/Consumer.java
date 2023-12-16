package org.com.abhi.Chapter11_20.Chapter11.Synchronization.InterThreadCommunication.ProducerConsumer;

public class Consumer implements Runnable{

    private SharedResource sharedResource;

    public Consumer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        try{
            sharedResource.consume();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
