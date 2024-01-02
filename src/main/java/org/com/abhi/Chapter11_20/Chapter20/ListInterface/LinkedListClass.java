package org.com.abhi.Chapter11_20.Chapter20.ListInterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
        Integer[] data = new Integer[5];
        for (int i=0;i<5;i++){
            data[i]=i;
        }
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(data));
        list.add(6);
        list.addLast(10);
        list.addFirst(88);
        list.add(54);
        list.forEach(System.out::println);
        System.out.println("-------------------");
        System.out.println(list.pop());
        System.out.println("----------------");
        list.forEach(System.out::println);
        System.out.println("-".repeat(20));
        System.out.println(list.peek());
        System.out.println("-".repeat(20));
        list.forEach(System.out::println);
        System.out.println("-".repeat(20));
        System.out.println(list.remove());
        System.out.println("-".repeat(20));
        list.forEach(System.out::println);


    }
}
