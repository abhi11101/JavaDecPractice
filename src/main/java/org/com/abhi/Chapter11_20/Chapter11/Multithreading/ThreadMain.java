package org.com.abhi.Chapter11_20.Chapter11.Multithreading;

import java.util.concurrent.TimeUnit;

public class ThreadMain {
    public static void main(String[] args) throws InterruptedException {
        Stopwatch stopwatch = new Stopwatch(TimeUnit.SECONDS);
        Thread blue = new Thread(()-> stopwatch.countdown(11),ThreadColor.ANSI_BLUE.name());
        Thread green = new Thread(stopwatch::countdown, ThreadColor.ANSI_GREEN.name());
        Thread purple = new Thread(stopwatch::countdown,ThreadColor.ANSI_PURPLE.name());
        blue.start();
        green.start();
        purple.start();
    }
}

class Stopwatch{

    private TimeUnit timeUnit;
    private int i=4;

    public Stopwatch(TimeUnit timeUnit){
        this.timeUnit=timeUnit;
    }

    public void countdown(){
        countdown(8);
    }
    public void countdown(int unit){
        String threadName = Thread.currentThread().getName();
        ThreadColor threadColor = ThreadColor.ANSI_RESET;
        try {
            threadColor = ThreadColor.valueOf(threadName);
        }catch (IllegalArgumentException e){

        }
        String color = threadColor.color();
        for ( i=unit;i>0;i--){
            System.out.println(Thread.currentThread().getName() + " For loop " + i);
            try {
                timeUnit.sleep(1);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getState() + " " + i);
            System.out.printf("%s%s Thread : i = %d%n",color,threadName,i);
        }
    }
}
