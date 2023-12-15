package org.com.abhi.Chapter1_10.Chapter5;

public class SelectionStatements {
    public static void main(String[] args) {

//         if elseif ladder

        if(10==1) System.out.println("10>1");
        else if (20>1) {
            System.out.println("20>1");

        }
        else System.out.println("Else");

//        Switch Statement

        char char_num ='C';
        switch (char_num){
            case 'A':
                System.out.println("A");
                break;
            case 'B':
                System.out.println("B");
                break;
            case 'C':
                System.out.println("C");
            default:
                System.out.println("Default");
        }

    }
}
