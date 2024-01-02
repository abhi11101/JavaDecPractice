package org.com.abhi.Chapter11_20.Chapter20.ComparableComparator;

public class Movie {

     int year;
     String name;

    public Movie(int year, String name) {
        this.year = year;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "year=" + year +
                ", name='" + name + '\'' +
                '}';
    }

    //    @Override
//    public int compareTo(Movie o) {
//        return this.year-o.year;
//    }
}
