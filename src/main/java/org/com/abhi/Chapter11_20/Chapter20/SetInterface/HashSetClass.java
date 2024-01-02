package org.com.abhi.Chapter11_20.Chapter20.SetInterface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HashSetClass {
    public static void main(String[] args) {
        String[] data = {"Abhijeet", "Goku","Naruto"};
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(data));
        hashSet.forEach(System.out::println);



    }
}
