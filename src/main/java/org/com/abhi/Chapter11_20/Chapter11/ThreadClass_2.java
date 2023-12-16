package org.com.abhi.Chapter11_20.Chapter11;

public class ThreadClass_2 extends Thread{

    @Override
    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println("1");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
                System.out.println(e);
            }
        }
    }

}
