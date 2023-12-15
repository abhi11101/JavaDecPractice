package org.com.abhi.Chapter1_10.Chapter8;

public class Inheritance {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.walk();
        animal.fly();

        Animal dog = new Dog();
        dog.walk();
        dog.fly();

        Animal eagle = new Eagle();
        eagle.walk();
        eagle.fly();
    }
}

class Animal{
    int legs;
     public void walk(){
         System.out.println("Can walk");
     }

     public void fly(){
         System.out.println("Can fly");
     }
}

class Dog extends Animal{
    public void walk(){
        System.out.println("Dog can walk");
    }
}

class Eagle extends Animal{

    public void walk(){
        System.out.println("Eagle can walk");
    }

    public void fly(){
        super.fly();
        System.out.println("Eagle can fly");
    }

}