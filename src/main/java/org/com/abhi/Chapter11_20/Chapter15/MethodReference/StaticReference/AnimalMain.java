package org.com.abhi.Chapter11_20.Chapter15.MethodReference.StaticReference;

import org.com.abhi.Chapter11_20.Chapter15.MethodReference.Animal;
import org.com.abhi.Chapter11_20.Chapter15.MethodReference.Dog;

public class AnimalMain {
    public static void main(String[] args) {

        Animal dog = new Dog();
        System.out.println(dog.bark("Scooby"));

        Animal cat = dog::bark;
        System.out.println(cat.bark("Tom"));

        Dog bruno = new Dog();
        bruno.bark("Bruno");
    }
}
