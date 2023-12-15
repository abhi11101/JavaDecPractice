package org.com.abhi.Chapter1_10.Chapter6;

public class ObjectTemp {
    public static void main(String[] args) {
        Box myBox = new Box();
        myBox.area();

        Box newBox = new Box(2,3);
        newBox.area();
    }
}

class Box{
    int height;
    int width;

    public Box(){
        System.out.println("Default Constructor");
    }

    public Box(int height, int width){
        System.out.println("Parameterised Constructor");
        this.height =height;
        this.width=width;
    }
    public void area(){
        System.out.println(height*width);
    }
}