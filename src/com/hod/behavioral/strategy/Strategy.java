package com.hod.behavioral.strategy;

//Strategy interface
public interface Strategy {
    int performOperation(int one, int two);
}

//Concrete strategies
class AdditionOperation implements Strategy {
    @Override
    public int performOperation(int one, int two) {
        return one + two;
    }
}

class SubtractionOperation implements Strategy {
    @Override
    public int performOperation(int one, int two) {
        return one - two;
    }
}

class MultiplicationOperation implements Strategy {
    @Override
    public int performOperation(int one, int two) {
        return one * two;
    }
}