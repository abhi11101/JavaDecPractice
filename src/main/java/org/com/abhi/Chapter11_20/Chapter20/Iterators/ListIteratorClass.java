package org.com.abhi.Chapter11_20.Chapter20.Iterators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class ListIteratorClass {
    public static void main(String[] args) {
        String[] data = {"Goku","Naruto","Vegeta","Itachi"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(data));

        ListIterator iterator = list.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next() + " "+ iterator.nextIndex() + "  " + iterator.previousIndex());
            iterator.add("NewData");
        }
        list.forEach(System.out::println);
    }
}
