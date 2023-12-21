package org.com.abhi.Chapter11_20.Chapter15.MethodReference.StaticReference;

public class MainClass {
    public static void main(String[] args) {

        Coah coah = MainClass::check;
        String result = coah.workout("Cricket Workout");
        System.out.println(result);
        Trainer trainer = MainClass::excercise;
        System.out.println(trainer.work("Hello ", 45));

        MainClass obj = new MainClass();
        Calculator cal = obj::calc;
        System.out.println(cal.work(5));

    }


    public static String excercise(String str, int count){
        return "Do this "+ str + " "+ count ;
    }

    public static String check(String str){
        return str+" YOYOYO!!!!";
    }

    public int calc(int i){
        for (int j=1;j<=10;j++){
            i*=j;
        }
        return i;
    }
}
