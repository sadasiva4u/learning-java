package com.sada.java.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyExecutorService {
    public static void main(String[] args) {
        /*
        Thread Vs Threadpool
        Initiate & run only once... Initiate, run-multiple times, close at the end
         */
        //ExecutorService executorService1 = Executors.newSingleThreadExecutor();
        ExecutorService executorService1 = Executors.newFixedThreadPool(2);
        executorService1.execute(new Task1());
        executorService1.execute(new Thread(new Task2()));
        executorService1.execute(new Task1());
        executorService1.execute(new Task1());
        executorService1.execute(new Thread(new Task2()));

        System.out.println("Task3 begins");
        for(int i =300; i <400; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Task3 complete");

        executorService1.shutdown();
    }
}
