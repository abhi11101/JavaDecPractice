package org.com.abhi.Chapter11_20.Chapter20.SetInterface;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetClass {
    public static void main(String[] args) {
        String[] data = {"Abhijeet", "Goku","Naruto"};
        LinkedHashSet<String> set = new LinkedHashSet<>(Arrays.asList(data));
        set.forEach(System.out::println);
    }
}
