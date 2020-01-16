package com.hod.behavioral.strategy;

public class Context {
    Strategy operation;

    public Context(Strategy operation){
        this.operation = operation;
    }

    public void executeOperation(int one, int two){
        int result = operation.performOperation(one, two);
        System.out.println(String.format("result for %s, %s equals %s", one, two, result));
    }
}
