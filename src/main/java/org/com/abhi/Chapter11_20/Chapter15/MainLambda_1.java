package org.com.abhi.Chapter11_20.Chapter15;

public class MainLambda_1 {
    public static void main(String[] args) {

        Printable printable = (p,s) -> {
            System.out.println(p+s);
        };
       printable.printWork("Hi ","YO");

       NumericFunc numericFunc = (n) -> {
           int result=0;
           for (int i=1;i<=n;i++){
               result=result+i;
           }
          return result;
       };
        System.out.println("Value "+ numericFunc.numWork(10));
    }


}
