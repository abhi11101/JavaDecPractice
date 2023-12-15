package org.com.abhi.Chapter1_10.Chapter8;

public class TriangleAbstractChild extends AbstractClass{

    int bill = 200;
    public static void main(String[] args) {
        TriangleAbstractChild obj = new TriangleAbstractChild();
        obj.area();
    }

    @Override
    public void area() {
        System.out.println("Triangle Area");
        bill +=rate;
        System.out.println(bill);
    }
}
