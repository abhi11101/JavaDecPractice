package org.com.abhi.Chapter11_20.Chapter15.GenericFunctionalInterface;

public class MainClass {
    public static void main(String[] args) {

        int add = Calculator((x,y) -> x+y,5,4, "Addition");
        int sub = Calculator((x,y) -> x-y,7,2,"Subtraction");
        int mul = Calculator((x,y) -> x*y,8,4,"Multiplication");


    }

    public static <T> T Calculator(GenericInterface<T> obj, T value1, T value2, String oper){
        T result = obj.operate(value1,value2);
        System.out.println("Result for " + oper + " "+ result);
        return result;
    }
}
