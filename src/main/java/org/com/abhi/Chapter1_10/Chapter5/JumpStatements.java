package org.com.abhi.Chapter1_10.Chapter5;

public class JumpStatements {
    public static void main(String[] args) {
        boolean bool_num = true;

        first:
        {
            second:
            {
                third:
                {
                    if (bool_num) {
                        System.out.println("Inside Third if");
                        break second;
                    }
                    System.out.println("Third");
                }
                System.out.println("Second");
            }
            System.out.println("First");
        }
    }
}