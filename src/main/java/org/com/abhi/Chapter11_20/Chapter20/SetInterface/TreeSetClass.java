package org.com.abhi.Chapter11_20.Chapter20.SetInterface;

import java.util.TreeSet;

public class TreeSetClass {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(45);
        set.add(2);
        set.add(92);
        set.add(12);
        set.forEach(System.out::println);
        System.out.println(set.ceiling(16));
    }
}
