package org.com.abhi.Chapter1_10.Chapter9;

public interface Coach {
    int fee = 10000;
    void running();

    void swimming();
    static void boom(){
        System.out.println("Interface Static method");
    }
    default void workout(){
        System.out.println("Default Coach Workout!!!");
    }
}
