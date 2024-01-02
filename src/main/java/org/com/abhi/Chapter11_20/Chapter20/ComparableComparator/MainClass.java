package org.com.abhi.Chapter11_20.Chapter20.ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        Movie movie = new Movie(2020,"8-Mile");
        Movie avengers = new Movie(2011,"Avengers");

        List<Movie> list = new ArrayList<>();
        list.add(movie);
        list.add(avengers);
        Comparator<Movie> comparator = (o1,o2) -> o1.year>o2.year ? 1: -1;
        Collections.sort(list,comparator);
        list.forEach(System.out::println);
    }
}
