package org.com.abhi.Chapter11_20.Chapter20.EqualsHashCode;

import java.util.Objects;

public class Pen {

    private int price;
    private String color;

    public Pen(int price, String color) {
        this.price = price;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {

//        Checking if Object o is same as this
        if (this == o) return true;

//        Checking if Object o is null and this class is not same as o class
        if (o == null || getClass() != o.getClass()) return false;

        Pen pen = (Pen) o;
//        Checking price and color equality
        return price == pen.price && Objects.equals(color, pen.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, color);
    }

//    @Override
//    public String toString() {
//        return "Pen{" +
//                "price=" + price +
//                ", color='" + color + '\'' +
//                '}';
//    }
}
