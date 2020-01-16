package com.hod.behavioral.strategy;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        //Context
        Context ctx = new Context(new AdditionOperation());

        System.out.println("Perform Addition");
        ctx.executeOperation(5, 10);

        ctx = new Context(new SubtractionOperation());

        System.out.println("Perform Subtraction");
        ctx.executeOperation(15, 10);

        ctx = new Context(new MultiplicationOperation());

        System.out.println("Perform Multiplication");
        ctx.executeOperation(5, 5);
    }
}