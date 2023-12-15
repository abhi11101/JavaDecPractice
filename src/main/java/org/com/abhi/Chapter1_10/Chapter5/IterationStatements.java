package org.com.abhi.Chapter1_10.Chapter5;

public class IterationStatements {
    public static void main(String[] args) {

//        while loop
        int i =0;
        while (i<=5){
            System.out.println(i);
            i++;
        }

//        do while loop

        i =0;
        do {
            System.out.println("Do i: "+ i);
            System.out.println(i);
            i++;
        }while (i<0);

    }
}
