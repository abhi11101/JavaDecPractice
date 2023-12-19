package org.com.abhi.Chapter11_20.Chapter14.InheritanceGenericExample;

public class Cat implements Animal{
    @Override
    public String walk() {
        return "Cat is walking";
    }

    @Override
    public String eat() {
        return "Cat is eating";
    }

    @Override
    public String toString() {
        return "Cat Meowww!!!!!!!!";
    }
}
