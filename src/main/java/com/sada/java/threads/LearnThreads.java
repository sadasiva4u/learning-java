package com.sada.java.threads;

public class LearnThreads {
    public static void main(String[] args) throws InterruptedException {

        /*
        RUNNABLE
        RUNNING
        SLEEP -- WAIT
        BLOCKED
        SUSPENDED/TERMINATED
         */

        Task1 task1 = new Task1();
        //task1.run();

        /*
         public static final int MIN_PRIORITY = 1;
          The default priority that is assigned to a thread.
          public static final int NORM_PRIORITY = 5;
          The maximum priority that a thread can have.
          public static final int MAX_PRIORITY = 10;
         */

        task1.setPriority(10);
        task1.start();

        //task1.join();

        Task2 task2 = new Task2();
        Thread task2Thread = new Thread(task2);
        task2Thread.start();

        System.out.println("Task3 begins");
        for(int i =300; i <400; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Task3 complete");
    }
}

class Task2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Task2 begins");
        for(int i =200; i <300;i++){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Task2 complete");
    }
}

class Task1 extends Thread{
    @Override
    public void run() {
        System.out.println("Task1 begins");
        for(int i =100; i <200; i++){
            /*
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/

            yield();
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Task1 complete");
    }
}