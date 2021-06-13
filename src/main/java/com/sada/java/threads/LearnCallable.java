package com.sada.java.threads;

import java.util.List;
import java.util.concurrent.*;

public class LearnCallable {
    // Thread executes a task. Doesn't return any value
    // Callabale returns a value

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Test1 test1 = new Test1("Sada");

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        // We submit() callable instead of execute() used for threads
        Future<String> submit = executorService.submit(test1);
        // Future is an interface that guarentees that there will be a result
        // Only if we do Future.get() we get back the data
        System.out.println(submit.get());

        executorService.shutdown();

        List<Test1> tests = List.of(new Test1("Sada"),new Test1("Siva"), new Test1("Dhruv"));
        ExecutorService executorService1 = Executors.newFixedThreadPool(1);
        // To run list of tasks we invokeAll() with list of Callable tasks
        List<Future<String>> futures = executorService1.invokeAll(tests);

        for (Future future:futures ) {
            System.out.println(future.get());
        }
        executorService1.shutdown();

        ExecutorService executorService2 = Executors.newFixedThreadPool(3);
        // To run list of tasks we invokeAll() with list of Callable tasks
        String firstResult = executorService2.invokeAny(tests);
        System.out.println(firstResult);
        executorService2.shutdown();

        System.out.println("Main Ends");
    }
}

class Test1 implements Callable<String> {

    String name;

    Test1(String name){
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        System.out.println("Task started for name="+name );
        return "Hello " + name;
    }
}