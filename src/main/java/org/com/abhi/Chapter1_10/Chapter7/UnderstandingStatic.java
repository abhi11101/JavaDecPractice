package org.com.abhi.Chapter1_10.Chapter7;

public class UnderstandingStatic {
    public static void main(String[] args) {
        System.out.println("Main method");
        Shape shape = new Shape();
        shape.area();
        shape = new Shape(4,6);
        shape.area();
        Shape.area(76);
    }
}

 class Shape {

    static {
        System.out.println("Static Block");
    }

    static int width=20;
    int length;

    Shape(){
        System.out.println("Default Constructor");
    }

    Shape(int width,int length){
        System.out.println("Parameterized Constructor");
        this.length=length;
        Shape.width=width;
    }

    public void area(){
        System.out.println("Area Method");
        System.out.println(length*width);
    }
    public static void area(int width){
        System.out.println("Static method area");
        Shape.width=width;
        System.out.println(Shape.width);
    }
}