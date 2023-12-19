package org.com.abhi.Chapter11_20.Chapter14.InheritanceGenericExample;

public class Dog implements Animal{
    @Override
    public String walk() {
        return "Dog is walking";
    }

    @Override
    public String toString() {
        return "Dog Woffff!!!";
    }

    public String bark() {
        return "Dog is barking";
    }

    @Override
    public String eat() {
        return "Dog is eating";
    }
}
