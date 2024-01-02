package org.com.abhi.Chapter11_20.Chapter20.MapInterface;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
    public static void main(String[] args) {

        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Goku");
        map.put(12,"Naruto");
        map.put(3,"Vegeta");

        for (Map.Entry<Integer,String> temp : map.entrySet()){
            System.out.println(temp.getKey() + " " + temp.getValue());
        }

    }
}
