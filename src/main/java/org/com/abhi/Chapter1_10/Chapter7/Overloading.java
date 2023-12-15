package org.com.abhi.Chapter1_10.Chapter7;

public class Overloading {
    public static void main(String[] args) {
        work();
        work("Naruto");

        Box myBox = new Box();
        Box myBox2 = new Box(2,3);
        Box myBox3 = new Box(5);
    }

//    Method Overloading
    public static void work(){
        System.out.println("First Work");
    }

    public static void work(String input){
        System.out.println("Second work: "+ input);
    }


}

class Box {
    int height;
    int width;

//    Constructor Overloading
    Box(){
        System.out.println("Default");
    }

    Box(int height,int width){
        System.out.println("Parameterized");
    }

    Box(int height){
        System.out.println("Height: "+ height);
    }
}
