package org.com.abhi.Chapter11_20.Chapter11.Synchronization.InterThreadCommunication.ProducerConsumer;

public class Producer implements Runnable{

    private SharedResource sharedResource;

    public Producer(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        try{
            sharedResource.produce();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
