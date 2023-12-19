package org.com.abhi.Chapter11_20.Chapter14;

public class Printer_1 <T> {

    T toPrint;

    public Printer_1(T toPrint) {
        this.toPrint = toPrint;
    }

    public void printThis(){
        System.out.println(toPrint);
    }
}
