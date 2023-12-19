package org.com.abhi.Chapter11_20.Chapter14.InheritanceGenericExample;

public class AnimalGeneric <T extends Animal>{

    T animal;

    public AnimalGeneric(T animal) {
        this.animal = animal;
    }

    public String action(){
        return animal.eat()+" "+animal.walk();
    }
}
