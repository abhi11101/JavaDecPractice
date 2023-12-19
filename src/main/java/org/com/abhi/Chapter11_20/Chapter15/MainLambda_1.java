package org.com.abhi.Chapter11_20.Chapter15;

public class MainLambda_1 {
    public static void main(String[] args) {

        doWork(() -> System.out.println("YOYOY"));
    }

    public static void doWork(Printable printable){
        printable.printWork();
    }
}
