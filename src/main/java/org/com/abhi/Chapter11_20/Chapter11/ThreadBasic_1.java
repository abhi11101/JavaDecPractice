package org.com.abhi.Chapter11_20.Chapter11;

public class ThreadBasic_1 {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getClass().getName());
        printThreadData(thread);

    }

    public static void printThreadData(Thread thread){
        System.out.println("------------------");
        System.out.println("Thread Id "+ thread.getId());
        System.out.println("Thread name "+ thread.getName());
        System.out.println("Thread Priority "+ thread.getPriority());
        System.out.println("Thread State "+ thread.getState());
        System.out.println("Thread Group "+ thread.getThreadGroup());
        System.out.println("Thread is Alive "+ thread.isAlive());
    }
}
