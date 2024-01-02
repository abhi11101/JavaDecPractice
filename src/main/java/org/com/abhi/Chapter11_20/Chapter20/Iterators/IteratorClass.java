package org.com.abhi.Chapter11_20.Chapter20.Iterators;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class IteratorClass {
    public static void main(String[] args) {
        String[] data = {"Goku","Naruto","Vegeta","Itachi"};
        HashSet<String> set = new HashSet<>(Arrays.asList(data));

        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
