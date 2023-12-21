package org.com.abhi.Chapter11_20.Chapter15.MethodReference;

import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MainClass {
    public static void main(String[] args) {
        Supplier<MainClass> obj = MainClass::new;
        MainClass object = obj.get();
        MainClass object2 = obj.get();
        String str = "Abhi";

    }

    public void work(){
        System.out.println("Work");
    }
}
