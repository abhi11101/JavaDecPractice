package org.com.abhi.Chapter11_20.Chapter20.ListInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class ArrayListClass {
    public static void main(String[] args) {

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i=1;i<=10;i++){
            integerArrayList.add(i);
        }
        Object[] listArray = integerArrayList.toArray();
        integerArrayList.forEach(System.out::println);
        for (Object i : listArray){
            System.out.println(i);
        }

        Collections.fill(integerArrayList,24);
        System.out.println("-".repeat(23));
        integerArrayList.forEach(System.out::println);
        integerArrayList.reversed();
        System.out.println("-".repeat(23));
        integerArrayList.forEach(System.out::println);

    }
}
