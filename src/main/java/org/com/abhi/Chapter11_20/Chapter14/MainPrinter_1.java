package org.com.abhi.Chapter11_20.Chapter14;

public class MainPrinter_1 {
    public static void main(String[] args) {
        Printer_1<Integer> intGeneric= new Printer_1<>(12);
        intGeneric.printThis();

        Printer_1<String> stringGeneric = new Printer_1<>("StringValue");
        stringGeneric.printThis();
    }
}
