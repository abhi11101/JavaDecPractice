package org.com.abhi.Chapter1_10.Chapter9;

public class FootballCoach implements Coach{
    @Override
    public void running() {
        System.out.println("Football running with football kit");
    }

    @Override
    public void swimming() {
        System.out.println("Football Swimming");
    }
    public void expense(){
        System.out.println("Coach fee "+ fee);
        System.out.println("Total Expense: "+ (fee+8000));
    }

    public void workout(){
        System.out.println("Football Workout");
    }
}
