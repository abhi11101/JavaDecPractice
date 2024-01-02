package org.com.abhi.Chapter11_20.Chapter20.EqualsHashCode;

import java.util.HashSet;
import java.util.Set;

public class MainClass {
    public static void main(String[] args) {
        Pen blue = new Pen(20,"Blue");
        Pen red = new Pen(50,"Red");
        Pen blue2 = new Pen(20,"Blue");
        System.out.println(blue.equals(red));
        System.out.println(blue + "\n" + red + "\n"+blue2);
        System.out.println(blue.equals(blue2));
        Set<Pen> set = new HashSet<>();
        set.add(blue);
        set.add(red);
        set.add(blue2);
        set.forEach(s-> System.out.println("Element "+ s));
        Employee employee1 = new Employee(101, "Alice");
        Employee employee2 = new Employee(101, "Bob");

        // Same hash code, but not equal
        System.out.println("Hash Code 1: " + employee1.hashCode());
        System.out.println("Hash Code 2: " + employee2.hashCode());
        System.out.println("Objects are equal: " + employee1.equals(employee2));
    }
}
