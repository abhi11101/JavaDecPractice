package org.com.abhi.Chapter1_10.Chapter9;

public class WorkingClass {
    public static void main(String[] args) {
        Coach coach = new CricketCoach();
        coach.running();
        coach.swimming();
        coach.workout();
        coach = new FootballCoach();
        coach.running();
        coach.swimming();
        coach.workout();
        FootballCoach footballCoach = new FootballCoach();
        footballCoach.expense();

        Coach.boom();
    }
}
