package org.com.abhi.Chapter1_10.Chapter7;

public class VariableArguments {
    public static void main(String[] args) {
        work(1,2,3,4,5,6,7,8,9);
    }

    public static void work(int ...num){
        for (int x : num){
            System.out.println(x);
        }
    }
}
