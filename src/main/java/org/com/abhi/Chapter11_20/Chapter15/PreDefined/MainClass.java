package org.com.abhi.Chapter11_20.Chapter15.PreDefined;

import java.util.function.*;

public class MainClass {
    public static void main(String[] args) {
        workUnary((a) -> a*2,45);
        workBinary((a,b) -> a*b,5,4);
        workConsumer((a) -> System.out.println("Consumer "+ a*2), 35);
        workBiConsumer((a,b) -> System.out.println("Bi Consumer " + (a*b)),3,4);
        workPredicate((a) -> a%2==0, 4);
        workBiPredicate((a,b) -> a%b==0,4,7);
        workSupplier(()-> new String("Check"));
        workFunction((a) -> a*5,4);
    }

    public static <T> T workUnary(UnaryOperator<T> obj, T value1){
        T result = obj.apply(value1);
        System.out.println("Result of UnaryOperator "+ result);
        return result;
    }

    public static <T> T workBinary(BinaryOperator<T> obj, T value1, T value2){
        T result = obj.apply(value1,value2);
        System.out.println("Result of Binary Operator "+ result);
        return result;
    }

    public static <T> void workConsumer(Consumer<T> obj, T value){
         obj.accept(value);
    }

    public static <T> void workBiConsumer(BiConsumer<T,T> obj, T value1, T value2){
            obj.accept(value1,value2);
    }

    public static <T> boolean workPredicate(Predicate<T> obj, T value){
        boolean result = obj.test(value);
        System.out.println("Predicate " + result);
        return result;
    }

    public static <T> boolean workBiPredicate(BiPredicate<T,T> obj, T value1, T value2){
        boolean result = obj.test(value1,value2);
        System.out.println("BiPredicate "+ result);
        return result;
    }

    public static <T> T workSupplier(Supplier<T> obj){
        T result = obj.get();
        System.out.println(result);
        return result;
    }

    public static <T> T workFunction(Function<T,T> obj, T value1){
        T result = obj.apply(value1);
        return result;
    }
}
