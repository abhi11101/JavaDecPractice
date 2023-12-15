package org.com.abhi.Chapter1_10.Chapter10;

import java.io.File;
import java.io.FileNotFoundException;

public class ExceptionHandling {

    public static void main(String[] args) {
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        try {
            exceptionHandling.work();
        }catch (ArithmeticException e){
            System.out.println("Exception is: " + e.getMessage());
            System.out.println(e);
        }
        try {
            exceptionHandling.boom();
        }catch (FileNotFoundException e){
            System.out.println("Exception is : "+ e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception is: " + e.getMessage());
            System.out.println(e);
        }finally {
            System.out.println("Finally Block!!!");
        }
    }

    public int work(){
        int x =10;
        int y =0;
        return x/y;
    }

    public void boom() throws FileNotFoundException{
        System.out.println("Inside Boom");
        throw new ArrayIndexOutOfBoundsException("Boom Exception");
    }

}
