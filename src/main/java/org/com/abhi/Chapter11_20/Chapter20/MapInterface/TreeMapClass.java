package org.com.abhi.Chapter11_20.Chapter20.MapInterface;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapClass {

    public static void main(String[] args) {

        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(11,"Goku");
        map.put(2,"Naruto");
        map.put(3,"Vegeta");

        for (Map.Entry<Integer,String> temp : map.entrySet()){
            System.out.println(temp.getKey() + " " + temp.getValue());
        }
        System.out.println("-".repeat(30));
        System.out.println(map);
    }
}
