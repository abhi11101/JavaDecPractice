package org.com.abhi.Chapter1_10.Chapter8;

public class ChildAbstractClass extends AbstractClass{
    int charge = 150;
    @Override
    public void area() {
        System.out.println("Child Area");
        charge = charge+ rate;
        System.out.println(charge);
    }

    public static void main(String[] args) {
        ChildAbstractClass child = new ChildAbstractClass();
        child.area();
        child.work();
    }

    public void work(){
        super.work();
        System.out.println("Child work");
    }
}
