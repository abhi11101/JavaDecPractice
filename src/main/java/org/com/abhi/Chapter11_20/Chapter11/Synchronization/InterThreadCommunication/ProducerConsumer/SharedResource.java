package org.com.abhi.Chapter11_20.Chapter11.Synchronization.InterThreadCommunication.ProducerConsumer;

import java.util.LinkedList;

public class SharedResource {

    private LinkedList<Integer> list = new LinkedList<>();
    private int capacity;

    public SharedResource(int capacity) {
        this.capacity = capacity;
    }

    public void produce() throws InterruptedException{
            int value=1;
            while (true){
               synchronized (this){
                   while (list.size()==capacity){
                       wait();
                   }
                   System.out.println("Produced..." + value);
                   list.add(value++);
                   notify();
                   Thread.sleep(1000);
               }
            }
    }
    public void consume() throws InterruptedException{
        while (true){
            synchronized (this){
                while (list.size()==0){
                    wait();
                }
                int val = list.removeFirst();
                System.out.println("Consumed "+ val);

                notify();
                Thread.sleep(1000);
            }
        }
    }
}
