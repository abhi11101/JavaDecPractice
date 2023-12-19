package org.com.abhi.Chapter11_20.Chapter14.InheritanceGenericExample;

public class MainAnimal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        AnimalGeneric<Dog> animalGeneric = new AnimalGeneric<>(dog);
        System.out.println(animalGeneric.action());
        AnimalGeneric<Cat> catAnimalGeneric = new AnimalGeneric<>(cat);
        System.out.println(catAnimalGeneric.action());

    }
}
