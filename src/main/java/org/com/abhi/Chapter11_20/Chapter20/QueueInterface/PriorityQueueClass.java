package org.com.abhi.Chapter11_20.Chapter20.QueueInterface;

import java.util.PriorityQueue;

public class PriorityQueueClass {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("First");
        priorityQueue.add("Second");
        priorityQueue.add("Third");
        priorityQueue.forEach(System.out::println);
    }
}
