package org.com.abhi.Chapter11_20.Chapter11;

public class Challenge_8 {
    public static void main(String[] args) {
        ChallengeThread_8 evenThread = new ChallengeThread_8();
        ChallengeRunnable_8 challengeRunnable8 = new ChallengeRunnable_8();
        Thread oddThread = new Thread(challengeRunnable8);

        System.out.println("Starting Even Thread");
        evenThread.start();
        System.out.println("Starting Odd Thread");
        oddThread.start();

        long now = System.currentTimeMillis();
        while (evenThread.isAlive()){
            if (System.currentTimeMillis()-now>2000){
                evenThread.interrupt();
                oddThread.interrupt();
            }
        }
    }
}
