package org.com.abhi.Chapter11_20.Chapter11.Synchronization.InterThreadCommunication.ProducerConsumer;

public class MainClass {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource(1);
        Thread producerThread = new Thread(new Producer(sharedResource));
        Thread consumerThread = new Thread(new Consumer(sharedResource));

        producerThread.start();
        consumerThread.start();

        try {
            producerThread.join();
            consumerThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
