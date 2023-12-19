package org.com.abhi.Chapter11_20.Chapter12.Enumeration;

import java.util.Arrays;

public class EnumMain {
    public static void main(String[] args) {
        System.out.println(DayOfTheWeek.valueOf("MONDAY"));
        DayOfTheWeek[] list = DayOfTheWeek.values();
        Arrays.asList(list).forEach(goku -> System.out.println(goku));
        DayOfTheWeek obj = DayOfTheWeek.SUNDAY;
        System.out.println(obj.ordinal());
    }
}
