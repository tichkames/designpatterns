package com.hod.creational.abstractfactory;

abstract public class AbstractFactory {
    abstract HollywoodMovie getHollywoodMovie();
    abstract BollywoodMovie getBollywoodMovie();
}

class ActionMovieFactory extends AbstractFactory{

    @Override
    HollywoodMovie getHollywoodMovie() {
        return new HollywoodActionMovie();
    }

    @Override
    BollywoodMovie getBollywoodMovie() {
        return new BollywoodActionMovie();
    }
}

class ComedyMovieFactory extends AbstractFactory{

    @Override
    BollywoodMovie getBollywoodMovie() {
        return new BollywoodComedyMovie();
    }

    @Override
    HollywoodMovie getHollywoodMovie() {
        return new HollywoodComedyMovie();
    }
}