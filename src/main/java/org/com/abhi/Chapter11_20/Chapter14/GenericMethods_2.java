package org.com.abhi.Chapter11_20.Chapter14;

import org.com.abhi.Chapter11_20.Chapter14.InheritanceGenericExample.Cat;
import org.com.abhi.Chapter11_20.Chapter14.InheritanceGenericExample.Dog;

import java.util.List;

public class GenericMethods_2 {
    public static void main(String[] args) {
        work(24);
        work(54.12);
        work("String object");
        work(new Dog());
        work(new Cat());
    }

    public static <T> void work(T workingObject){
        System.out.println(workingObject);
    }


}
