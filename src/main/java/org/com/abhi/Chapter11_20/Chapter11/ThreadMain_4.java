package org.com.abhi.Chapter11_20.Chapter11;

public class ThreadMain_4 {
    public static void main(String[] args) {
        ThreadRunnable_4 obj = new ThreadRunnable_4();
        Thread thread = new Thread(obj);
        thread.start();
    }
}
